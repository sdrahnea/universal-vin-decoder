package com.uvd.model;

public class Vin {

  private String value;
  private String wmi;
  private String vds;
  private String vis;

  private Position position1 = new Position(0);
  private Position position2 = new Position(1);
  private Position position3 = new Position(2);
  private Position position4 = new Position(3);
  private Position position5 = new Position(4);
  private Position position6 = new Position(5);
  private Position position7 = new Position(6);
  private Position position8 = new Position(7);
  private Position position9 = new Position(8);
  private Position position10 = new Position(9);
  private Position position11 = new Position(10);
  private Position positionAfterEleven = new Position();

  public Vin() {}

  public Vin(String value) {
    this.value = value;
    populateFields();
  }

  /**
   * create default values for all fields
   */
  private void populateFields(){
    if (value != null && !value.isEmpty()){
      this.wmi = value.substring(0, 3);
      this.vds = value.substring(4, 9);
      this.vis = value.substring(10);

      this.position1.setName("The country where the Hyundai was assembled");
      this.position1.setValue("" + value.charAt(0));

      this.position2.setName("The division of Hyundai that manufactured the vehicle");
      this.position2.setValue("" + value.charAt(1));

      this.position3.setName("The brand division");
      this.position3.setValue("" + value.charAt(2));

      this.position4.setName("The model of the vehicle and the location of the wheel");
      this.position4.setValue("" + value.charAt(3));

      this.position5.setName("The equipment vehicle level (European market) or body type (American market)");
      this.position5.setValue("" + value.charAt(4));

      this.position6.setName("The body type");
      this.position6.setValue("" + value.charAt(5));

      this.position7.setName("The type of security systems that have been incorporated in the vehicle");
      this.position7.setValue("" + value.charAt(6));

      this.position8.setName("The vehicle’s engine type for a class of models");
      this.position8.setValue("" + value.charAt(7));

      this.position9.setName("The steering wheel arrangement");
      this.position9.setValue("" + value.charAt(8));

      this.position10.setName("The model year");
      this.position10.setValue("" + value.charAt(9));

      this.position11.setName("The assembly plant");
      this.position11.setValue("" + value.charAt(10));

      this.positionAfterEleven.setName("The position 12-17 is serial number");
      this.positionAfterEleven.setValue(value.substring(11));
    }
  }

  public String getValue() {
    return value;
  }

  public void setValue(String value) {
    this.value = value;
  }

  public String getWmi() {
    return wmi;
  }

  public void setWmi(String wmi) {
    this.wmi = wmi;
  }

  public String getVds() {
    return vds;
  }

  public void setVds(String vds) {
    this.vds = vds;
  }

  public String getVis() {
    return vis;
  }

  public void setVis(String vis) {
    this.vis = vis;
  }

  public Position getPosition1() {
    return position1;
  }

  public void setPosition1(Position position1) {
    this.position1 = position1;
  }

  public Position getPosition2() {
    return position2;
  }

  public void setPosition2(Position position2) {
    this.position2 = position2;
  }

  public Position getPosition3() {
    return position3;
  }

  public void setPosition3(Position position3) {
    this.position3 = position3;
  }

  public Position getPosition4() {
    return position4;
  }

  public void setPosition4(Position position4) {
    this.position4 = position4;
  }

  public Position getPosition5() {
    return position5;
  }

  public void setPosition5(Position position5) {
    this.position5 = position5;
  }

  public Position getPosition6() {
    return position6;
  }

  public void setPosition6(Position position6) {
    this.position6 = position6;
  }

  public Position getPosition7() {
    return position7;
  }

  public void setPosition7(Position position7) {
    this.position7 = position7;
  }

  public Position getPosition8() {
    return position8;
  }

  public void setPosition8(Position position8) {
    this.position8 = position8;
  }

  public Position getPosition9() {
    return position9;
  }

  public void setPosition9(Position position9) {
    this.position9 = position9;
  }

  public Position getPosition10() {
    return position10;
  }

  public void setPosition10(Position position10) {
    this.position10 = position10;
  }

  public Position getPosition11() {
    return position11;
  }

  public void setPosition11(Position position11) {
    this.position11 = position11;
  }

  public Position getPositionAfterEleven() {
    return positionAfterEleven;
  }

  public void setPositionAfterEleven(Position positionAfterEleven) {
    this.positionAfterEleven = positionAfterEleven;
  }
}
