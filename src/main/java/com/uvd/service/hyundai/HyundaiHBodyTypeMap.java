package com.uvd.service.hyundai;

import java.util.HashMap;


/***
 * Hyundai World Manufacture Identifier Map
 */
public class HyundaiHBodyTypeMap extends HashMap<String, String> {

  public static HyundaiHBodyTypeMap getDefault() {
    HyundaiHBodyTypeMap defaultMap = new HyundaiHBodyTypeMap();

    defaultMap.put("0", "pickup");
    defaultMap.put("1", "limousine / wagon (front wheel drive)");
    defaultMap.put("2", "compartment, two doors");
    defaultMap.put("3", "hatchback 3 door");
    defaultMap.put("4", "a sedan, 4 door");
    defaultMap.put("5", "hatchback, 5 doors");
    defaultMap.put("6", "compartment, two doors");
    defaultMap.put("7", "Convertible / touring (4x4)");
    defaultMap.put("8", "wagon");
    defaultMap.put("D", "double cab pickup (double cab)");

    return defaultMap;
  }

}
