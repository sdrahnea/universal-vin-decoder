package com.uvd.service.hyundai.engine.model;

import java.util.HashMap;


/***
 * Terracan
 */
public class ClassTerracanMap extends HashMap<String, String> {

  public static ClassTerracanMap getDefault() {
    ClassTerracanMap defaultMap = new ClassTerracanMap();

    defaultMap.put("C", "3.5 liter (gasoline, DOHC)");
    defaultMap.put("W", "2.5 l (TCI)");
    defaultMap.put("X", "2.9 l (TCI)");

    return defaultMap;
  }

}
