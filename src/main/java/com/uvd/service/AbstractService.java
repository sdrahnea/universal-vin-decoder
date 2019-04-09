package com.uvd.service;

import com.uvd.model.CoreEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.io.Serializable;
import java.lang.reflect.ParameterizedType;

/**
 * Created by sdrahnea.
 */
public abstract class AbstractService<T extends CoreEntity> implements Serializable {

  @Autowired
  private CrudRepository<T, Long> repository;

  @PersistenceContext
  EntityManager entityManager;

  public T save(T tobject) {
    tobject = repository.save(tobject);
    return tobject;
  }

  public void delete(long id) {
    repository.delete(new Long(id));
  }

  public Iterable<T> findAll() {
    Iterable<T> tobjects = repository.findAll();
    return tobjects;
  }

  public T findById(long id) {
    T tobject = (T) repository.findOne(new Long(id));
    return tobject;
  }

  public T findByName(String name) {
    T tobject = (T) entityManager.createQuery("FROM " + getClassName() + " t WHERE t.name = :name")
        .setParameter("name", name)
        .getSingleResult();
    return tobject;
  }

  private String getClassName() {
    String[] className = ("" + ((ParameterizedType) getClass().getGenericSuperclass()).getActualTypeArguments()[0]).split("\\.");
    return className[className.length - 1];
  }

}
