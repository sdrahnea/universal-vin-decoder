package com.uvd.service.hyundai.engine.model;

import java.util.HashMap;


/***
 * Coupe / Tuscani / Tiburon
 */
public class ClassCoupeMap extends HashMap<String, String> {

  public static ClassCoupeMap getDefault() {
    ClassCoupeMap defaultMap = new ClassCoupeMap();

    defaultMap.put("B", "1.6 l (gasoline, DOHC)");
    defaultMap.put("C", "1.6 liter (gasoline, DOHC)");
    defaultMap.put("D", "2.0 l (gasoline, DOHC)");
    defaultMap.put("F", "2.7 liters (gasoline, DOHC)");

    return defaultMap;
  }

}
