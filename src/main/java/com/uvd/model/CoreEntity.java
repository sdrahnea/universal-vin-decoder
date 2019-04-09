package com.uvd.model;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by sdrahnea
 */
@MappedSuperclass
public abstract class CoreEntity {

  private static final long serialVersionUID = -3009157732242241606L;

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private long id;

  @Column(name = "name")
  private String name;

  @Lob
  @Column(name = "notes")
  private String notes;

  @Column(name = "created_date")
  @Temporal(TemporalType.TIMESTAMP)
  private Date createdDate;

  @Column(name = "end_date")
  @Temporal(TemporalType.TIMESTAMP)
  private Date endDate;

  protected CoreEntity(){
    if (getCreatedDate() == null){
      setCreatedDate(new Date());
    }
  }

  public CoreEntity(String name){
    this.name = name;
  }

  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getNotes() {
    return notes;
  }

  public void setNotes(String notes) {
    this.notes = notes;
  }

  public Date getCreatedDate() {
    return createdDate;
  }

  public void setCreatedDate(Date createDate) {
    this.createdDate = createDate;
  }

  public Date getEndDate() {
    return endDate;
  }

  public void setEndDate(Date endDate) {
    this.endDate = endDate;
  }

  @Override
  public String toString() { return String.format("%s", name); }
  //public String toString() {return String.format("CoreEntity[id=%d, name='%s'", id, name, notes);}
}