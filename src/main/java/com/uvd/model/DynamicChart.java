package com.uvd.model;

/**
 * Created by sdrahnea
 */
public class DynamicChart {

  private Object graphic;
  private String uiType;

  public DynamicChart(Object graphic, String uiType){
    this.graphic = graphic;
    this.uiType = uiType;
  }

  public Object getGraphic() {
    return graphic;
  }

  public void setGraphic(Object graphic) {
    this.graphic = graphic;
  }

  public String getUiType() {
    return uiType;
  }

  public void setUiType(String uiType) {
    this.uiType = uiType;
  }
}
