package com.uvd.service.hyundai.engine.model;

import java.util.HashMap;


/***
 * Class C (Accent / Verna / Matrix / Lavita)
 */
public class ClassCMap extends HashMap<String, String> {

  public static ClassCMap getDefault() {
    ClassCMap defaultMap = new ClassCMap();

    defaultMap.put("B", "1.5 l (gasoline, DOHC)");
    defaultMap.put("C", "1.6 liter (gasoline, DOHC)");
    defaultMap.put("D", "1.8 l (gasoline, DOHC)");
    defaultMap.put("F", "1.0 / 1.3 liters (gasoline, SOHC)");
    defaultMap.put("G", "1.5 l (gasoline, SOHC)");
    defaultMap.put("V", "1.5 l (diesel, TCI)");
    defaultMap.put("W", "2.0 l (diesel, TCI)");

    return defaultMap;
  }

}
