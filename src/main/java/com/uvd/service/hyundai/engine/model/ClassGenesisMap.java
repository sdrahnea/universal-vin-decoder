package com.uvd.service.hyundai.engine.model;

import java.util.HashMap;


/***
 * Genesis
 */
public class ClassGenesisMap extends HashMap<String, String> {

  public static ClassGenesisMap getDefault() {
    ClassGenesisMap defaultMap = new ClassGenesisMap();

    defaultMap.put("E", "3.8 l (gasoline, DOHC, V6)");

    return defaultMap;
  }

}
