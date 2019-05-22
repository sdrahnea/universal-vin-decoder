package com.uvd.service.hyundai.engine.model;

import java.util.HashMap;

/***
 * Class D (Sonata for the European market)
 */
public class ClassDEuropaMap extends HashMap<String, String> {

  public static ClassDEuropaMap getDefault() {
    ClassDEuropaMap defaultMap = new ClassDEuropaMap();

    defaultMap.put("A", "1.8 l (gasoline, DOHC)");
    defaultMap.put("B", "2.0 l (gasoline, DOHC)");
    defaultMap.put("D", "2.4 l (gasoline, DOHC)");
    defaultMap.put("E", "2.5 l (gasoline, DOHC)");
    defaultMap.put("F", "2.7 liters (gasoline, DOHC)");
    defaultMap.put("H", "2.0 l (gasoline, DOHC)");
    defaultMap.put("M", "2.0 l (gasoline, DOHC)");

    return defaultMap;
  }

}
