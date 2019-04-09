package com.uvd.controller;


import com.uvd.model.CoreEntity;
import com.uvd.service.AbstractService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.annotation.PostConstruct;
import java.io.Serializable;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

/**
 * Created by sdrahnea
 */
@CrossOrigin("*")
public abstract class AbstractController<T extends CoreEntity> implements Serializable {

  private List<T> list = new LinkedList<>();

  private T selectedObject;

  private final Logger logger = LoggerFactory.getLogger(this.getClass());

  @Autowired
  public AbstractService<T> service;

  @PostConstruct
  public void init(){
    if (list == null || list.isEmpty()) {
      list = toList(findAll());
    } else {
      list = toList(findAll());
    }
    selectedObject = buildObject();
  }

  public String save(){
    save(getSelectedObject());
    logger.info("Save object: " + getSelectedObject());
    init();
    return getClassName().toLowerCase() + "List";
  }

  //create methods for managed beans
  public String remove(T tobject){
    delete(tobject.getId());
    init();
    return getClassName().toLowerCase() + "List";
  }

  public String edit(T tobject){
    setSelectedObject(tobject);
    return getClassName().toLowerCase() + "View";
  }

  public String cancel(){
    init();
    return getClassName().toLowerCase() + "List";
  }

  public String getEditButtonCaption(){
    return getSelectedObject().getId() > 0 ? "Update" : "Save";
  }

  //create methods for REST access
  @RequestMapping(method = RequestMethod.POST)
  public T save(@RequestBody T tobject) {
    logger.info("save object via post request");
    tobject = service.save(tobject);
    return tobject;
  }

  @RequestMapping(method = RequestMethod.PUT)
  public T update(@RequestBody T tobject) {
    logger.info("Receive request to update the " + tobject.toString());
    service.save(tobject);
    return tobject;
  }

  @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
  public T delete(@PathVariable("id") long id) {
    logger.info("Receive request to delete the object with id: " + id);
    T tobject = service.findById(id);
    service.delete(id);
    return tobject;
  }

  @RequestMapping(method = RequestMethod.GET)
  public Iterable<T>  findAll() {
    logger.info("return all objects");
    Iterable<T> tobjects = service.findAll();
    return tobjects;
  }

  @RequestMapping(value = "/{id}", method = RequestMethod.GET)
  public T findById(@PathVariable("id") long id) {
    T tobject = service.findById(id);
    return tobject;
  }

  private String getClassName() {
    String[] className = ("" + ((ParameterizedType) getClass().getGenericSuperclass()).getActualTypeArguments()[0]).split("\\.");
    return className[className.length - 1];
  }

  public static <T> List<T> toList(final Iterable<T> iterable) {
    return StreamSupport.stream(iterable.spliterator(), false)
        .collect(Collectors.toList());
  }

  public T buildObject(){
    try{
      Class<T> tClass;
      Type type = getClass().getGenericSuperclass();
      if (type instanceof ParameterizedType) {
        ParameterizedType paramType = (ParameterizedType)type;
        tClass = (Class<T>) paramType.getActualTypeArguments()[0];
        return tClass.newInstance();
      }
    } catch(Exception ex){
      logger.warn("Can't' create an object: " + ex);
    }
    return null;
  }


  public List<T> getList() {
    return list;
  }

  public void setList(List<T> list) {
    this.list = list;
  }

  public T getSelectedObject() {
    if (selectedObject == null) {
      selectedObject = buildObject();
    }
    return selectedObject;
  }

  public void setSelectedObject(T selectedObject) {
    this.selectedObject = selectedObject;
  }

  public T getRandomObject(){
    int min = 0;
    int max = list.size() - 1;
    Random r = new Random();
    int index = r.nextInt((max - min) + 1) + min;
    return list.get(index);
  }

}
