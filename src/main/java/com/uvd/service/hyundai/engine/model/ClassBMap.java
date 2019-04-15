package com.uvd.service.hyundai.engine.model;

import java.util.HashMap;


/***
 * Class A (Atos / Santo / Visto / i10)
 */
public class ClassAMap extends HashMap<String, String> {

  public static ClassAMap getDefault() {
    ClassAMap defaultMap = new ClassAMap();
    
    defaultMap.put("B", "1.1 l (gasoline, SOHC (3 valve per cylinder))");
    defaultMap.put("C", "1.2 (1.3) l (gasoline, DOHC)");
    defaultMap.put("F", "0.8 liters (gasoline, SOHC)");
    defaultMap.put("G", "1.0 l (gasoline, SOHC)");
    defaultMap.put("H", "1.1 liters (gasoline, SOHC)");
    defaultMap.put("J", "0.8 l (gasoline)");
    defaultMap.put("R", "0.8 l");

    return defaultMap;
  }

}
