package com.uvd.service.hyundai.engine.model;

import java.util.HashMap;


/***
 * Santa Fe
 */
public class ClassSantaFeMap extends HashMap<String, String> {

  public static ClassSantaFeMap getDefault() {
    ClassSantaFeMap defaultMap = new ClassSantaFeMap();

    defaultMap.put("A", "2.0 l (gasoline, DOHC)");
    defaultMap.put("B", "2.4 l (gasoline, DOHC)");
    defaultMap.put("D", "2.7 l (gasoline, DOHC)");
    defaultMap.put("E", "3.5 l (gasoline, DOHC)");
    defaultMap.put("P", "2.7 liter");
    defaultMap.put("V", "2.0 l (gasoline);2.7 l (diesel, TCI)");
    defaultMap.put("W", "2.2 l (diesel, TCI)");

    return defaultMap;
  }

}
