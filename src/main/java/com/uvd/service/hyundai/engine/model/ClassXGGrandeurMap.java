package com.uvd.service.hyundai.engine.model;

import java.util.HashMap;


/***
 * XG Grandeur
 */
public class ClassXGGrandeurMap extends HashMap<String, String> {

  public static ClassXGGrandeurMap getDefault() {
    ClassXGGrandeurMap defaultMap = new ClassXGGrandeurMap();

    defaultMap.put("A", "2.0 l (gasoline, DOHC)");
    defaultMap.put("C", "2.5 liter (gasoline, DOHC)");
    defaultMap.put("D", "3.0 l (gasoline, DOHC)");
    defaultMap.put("E", "3.5 l (gasoline, DOHC)");
    defaultMap.put("M", "2.7 l");

    return defaultMap;
  }

}
