package com.uvd.service.hyundai.engine.model;

import java.util.HashMap;


/***
 * Trajet
 */
public class ClassTrajetMap extends HashMap<String, String> {

  public static ClassTrajetMap getDefault() {
    ClassTrajetMap defaultMap = new ClassTrajetMap();

    defaultMap.put("A", "2.0 l (gasoline, DOHC)");
    defaultMap.put("C", "2.7 liter (gasoline, DOHC)");
    defaultMap.put("N", "2.7 l (DOHC)");
    defaultMap.put("V", "v");

    return defaultMap;
  }

}
