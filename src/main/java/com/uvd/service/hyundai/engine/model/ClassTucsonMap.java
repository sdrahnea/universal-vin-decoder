package com.uvd.service.hyundai.engine.model;

import java.util.HashMap;


/***
 * Tucson
 */
public class ClassTucsonMap extends HashMap<String, String> {

  public static ClassTucsonMap getDefault() {
    ClassTucsonMap defaultMap = new ClassTucsonMap();

    defaultMap.put("B", "2.0 l (gasoline, DOHC)");
    defaultMap.put("D", "2.7 l (gasoline, DOHC)");
    defaultMap.put("P", "2.0 l (gasoline, DOHC)");
    defaultMap.put("V", "2.0 l (diesel, TCI)");

    return defaultMap;
  }

}
