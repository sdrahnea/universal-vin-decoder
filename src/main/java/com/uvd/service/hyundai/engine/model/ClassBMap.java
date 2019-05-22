package com.uvd.service.hyundai.engine.model;

import java.util.HashMap;


/***
 * Class B (Getz / Click)
 */
public class ClassBMap extends HashMap<String, String> {

  public static ClassBMap getDefault() {
    ClassBMap defaultMap = new ClassBMap();

    defaultMap.put("A", "1.5 l (gasoline, DOHC)");
    defaultMap.put("B", "1.6 l (gasoline, DOHC)");
    defaultMap.put("C", "1.8 liter (gasoline, DOHC)");
    defaultMap.put("F", "1.0 liters (gasoline, SOHC)");
    defaultMap.put("G", "1.1 l (gasoline, SOHC)");
    defaultMap.put("H", "1.3 liters (gasoline, SOHC)");
    defaultMap.put("J", "1.5 l (gasoline, SOHC)");
    defaultMap.put("V", "1.1 l (diesel, TCI)");
    defaultMap.put("W", "1.5 l (diesel, TCI)");

    return defaultMap;
  }

}
