package com.uvd.service.hyundai.engine.model;

import java.util.HashMap;


/***
 * Veracruz
 */
public class ClassVeracruzMap extends HashMap<String, String> {

  public static ClassVeracruzMap getDefault() {
    ClassVeracruzMap defaultMap = new ClassVeracruzMap();

    defaultMap.put("C", "3.8 liter (gasoline, DOHC)");
    defaultMap.put("W", "3.0 l (diesel, TCI)");

    return defaultMap;
  }

}
