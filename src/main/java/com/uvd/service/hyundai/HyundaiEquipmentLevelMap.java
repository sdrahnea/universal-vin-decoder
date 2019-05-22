package com.uvd.service.hyundai;

import java.util.HashMap;


/***
 * Hyundai World Manufacture Identifier Map
 */
public class HyundaiEquipmentLevelMap extends HashMap<String, String> {

  public static HyundaiEquipmentLevelMap getDefault() {
    HyundaiEquipmentLevelMap defaultMap = new HyundaiEquipmentLevelMap();

    defaultMap.put("A", "L (Standart)");
    defaultMap.put("B", "GL (Deluxe)");
    defaultMap.put("C", "GLS (Super DeLuxe)");
    defaultMap.put("D", "GDS (High / Grand Salon)");
    defaultMap.put("E", "HGS (High / Super Grand Salon)");
    defaultMap.put("F", "L (Standart)");
    defaultMap.put("G", "GL (Deluxe)");
    defaultMap.put("H", "GLS (Super DeLuxe)");
    defaultMap.put("J", "GDS (High / Grand Salon)");
    defaultMap.put("K", "HGS (High / Super Grand Salon)");
    defaultMap.put("L", "L (Standart)");
    defaultMap.put("M", "GL (Deluxe)");
    defaultMap.put("N", "GLS (Super DeLuxe)");
    defaultMap.put("P", "GDS (High / Grand Salon)");
    defaultMap.put("R", "HGS (High / Super Grand Salon)");
    defaultMap.put("S", "L (Standart)");
    defaultMap.put("T", "GL (Deluxe)");
    defaultMap.put("U", "GLS (Super DeLuxe)");
    defaultMap.put("V", "GDS (High / Grand Salon )");
    defaultMap.put("W", "HGS (High / Super Grand Salon)");
    defaultMap.put("X", "L (Standart)");
    defaultMap.put("Y", "GL (Deluxe)");
    defaultMap.put("Z", "GLS (Super DeLuxe)");

    return defaultMap;
  }

}
