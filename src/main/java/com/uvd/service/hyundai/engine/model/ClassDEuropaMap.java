package com.uvd.service.hyundai.engine.model;

import java.util.HashMap;

/***
 * Class C + (Elantra / Lantra / i30 / Avante)
 */
public class ClassCPlusMap extends HashMap<String, String> {

  public static ClassCPlusMap getDefault() {
    ClassCPlusMap defaultMap = new ClassCPlusMap();
    
    defaultMap.put("A", "1.5 l (gasoline, DOHC)");
    defaultMap.put("B", "1.6 l (gasoline, DOHC)");
    defaultMap.put("C", "1.4 liter (gasoline, DOHC) [i30]");
    defaultMap.put("D", "1.8 liter (gasoline, DOHC )");
    defaultMap.put("J", "2.0 l (gasoline, DOHC)");
    defaultMap.put("L", "1.5 l (gasoline)");
    defaultMap.put("M", "1.5 l (gasoline)");
    defaultMap.put("R", "1.8 l (gasoline)");
    defaultMap.put("T", "1.6 l (diesel, CRDI) [i30]");
    defaultMap.put("U", "2.0 l (diesel, CRDI) [i30]");
    defaultMap.put("V", "2.0 l (diesel, TCI)");

    return defaultMap;
  }

}
