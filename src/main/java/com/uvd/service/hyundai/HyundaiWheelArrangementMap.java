package com.uvd.service.hyundai;

import java.util.HashMap;


/***
 * Hyundai World Manufacture Identifier Map
 */
public class HyundaiBodyTypeMap extends HashMap<String, String> {

  public static HyundaiBodyTypeMap getDefault() {
    HyundaiBodyTypeMap defaultMap = new HyundaiBodyTypeMap();

    defaultMap.put("A", "hatchback, 5 doors");
    defaultMap.put("B", "pickup 2 doors");
    defaultMap.put("C", "convertible");
    defaultMap.put("D", "hatchback 3 doors");
    defaultMap.put("E", "compartment 2 doors");
    defaultMap.put("F", "sedan 4D");
    defaultMap.put("G", "compartment 2 doors");
    defaultMap.put("N", "Combi 3 door");
    defaultMap.put("P", "combi, doors 5");
    defaultMap.put("S", "wagon, 5 doors");
    defaultMap.put("T", "wagon door 5");
    defaultMap.put("V", "minivan");
    defaultMap.put("W", "wagon, 5 doors");

    return defaultMap;
  }

}
