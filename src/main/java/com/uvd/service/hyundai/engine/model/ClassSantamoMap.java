package com.uvd.service.hyundai.engine.model;

import java.util.HashMap;


/***
 * Santamo
 */
public class ClassSantamoMap extends HashMap<String, String> {

  public static ClassSantamoMap getDefault() {
    ClassSantamoMap defaultMap = new ClassSantamoMap();

    defaultMap.put("M", "2.0 l (gasoline, SOHC)");
    defaultMap.put("N", "2.0 l (gasoline, SOHC)");
    defaultMap.put("P", "2.0 l (gasoline, SOHC)");
    defaultMap.put("S", "L 2.0 l (gasoline, SOHC)");
    defaultMap.put("Z", "2.0 l (SOHC)");

    return defaultMap;
  }

}
