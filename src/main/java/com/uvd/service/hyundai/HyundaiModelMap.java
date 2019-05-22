package com.uvd.service.hyundai;

import java.util.HashMap;


/***
 * Hyundai World Manufacture Identifier Map
 */
public class HyundaiModelMap extends HashMap<String, String> {

  public static HyundaiModelMap getDefault() {
    HyundaiModelMap defaultMap = new HyundaiModelMap();

    defaultMap.put("A", "Stellar (right wheel)");
    defaultMap.put("B", "Stellar (left wheel)");
    defaultMap.put("C", "Sonata II (left wheel)");
    defaultMap.put("D", "Sonata II (right wheel)");
    defaultMap.put("E", "Marcia (left wheel)");
    defaultMap.put("F", "Marcia (right wheel)");
    defaultMap.put("G", "Equus");
    defaultMap.put("J", "Elantra (left wheel)");
    defaultMap.put("K", "Elantra (right wheel)");
    defaultMap.put("L", "other models with left-hand steering");
    defaultMap.put("M", "Grandeur (left wheel)");
    defaultMap.put("P", "Pony (left wheel)");
    defaultMap.put("R", "Pony (right wheel)");
    defaultMap.put("S", "Stellar (left wheel)");
    defaultMap.put("T", "Stellar (right wheel)");
    defaultMap.put("U", "Pony / Accent / Lantra (all RHD)");
    defaultMap.put("V", "Pony / Accent / Excel / S-Coupe (all LHD)");
    defaultMap.put("X", "Dynasty");

    return defaultMap;
  }

}
