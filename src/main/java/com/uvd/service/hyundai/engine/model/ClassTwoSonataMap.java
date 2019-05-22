package com.uvd.service.hyundai.engine.model;

import java.util.HashMap;


/***
 * II Sonata
 */
public class ClassTwoSonataMap extends HashMap<String, String> {

  public static ClassTwoSonataMap getDefault() {
    ClassTwoSonataMap defaultMap = new ClassTwoSonataMap();

    defaultMap.put("D", "1.8 l (gasoline)");
    defaultMap.put("F", "2.0 liters (petrol)");
    defaultMap.put("L", "L of 2.0");
    defaultMap.put("M", "1.8 l");
    defaultMap.put("N", "1.8 l");
    defaultMap.put("T", "3.0 l");

    return defaultMap;
  }

}
