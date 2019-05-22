package com.uvd.model;

public class Position {

  private int index;
  private String name;
  private String value;

  public Position(){}

  public Position(int index) {
    this.index = index;
  }

  public Position(int index, String name, String value) {
    this.index = index;
    this.name = name;
    this.value = value;
  }

  public int getIndex() {
    return index;
  }

  public void setIndex(int index) {
    this.index = index;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getValue() {
    return value;
  }

  public void setValue(String value) {
    this.value = value;
  }
}
