package com.uvd.service.hyundai;

import java.util.HashMap;


/***
 * For Hyundai vehicles made for the European market, the character identifies the steering wheel arrangement map
 */
public class HyundaiWheelArrangementMap extends HashMap<String, String> {

  public static HyundaiWheelArrangementMap getDefault() {
    HyundaiWheelArrangementMap defaultMap = new HyundaiWheelArrangementMap();

    defaultMap.put("P", "Left-hand side");
    defaultMap.put("R", "Right-hand side");

    return defaultMap;
  }

}
