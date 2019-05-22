package com.uvd.service.hyundai.engine.model;

import java.util.HashMap;

/***
 * Class D (Sonata for the North American market)
 */
public class ClassDAmericaMap extends HashMap<String, String> {

  public static ClassDAmericaMap getDefault() {
    ClassDAmericaMap defaultMap = new ClassDAmericaMap();

    defaultMap.put("E", "3.3 l (gasoline)");
    defaultMap.put("F", "2.0 liters (petrol)");
    defaultMap.put("H", "2.7 liters (petrol)");
    defaultMap.put("N", "1.9 l (gasoline)");
    defaultMap.put("S", "2.4 l (gasoline)");
    defaultMap.put("V", "2.5 l (gasoline)");

    return defaultMap;
  }

}
