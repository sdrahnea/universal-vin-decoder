package com.uvd.service.hyundai;

import java.util.HashMap;


/***
 * Hyundai World Manufacture Identifier Map
 */
public class HyundaiCountryAssembledMap extends HashMap<String, String> {

  public static HyundaiCountryAssembledMap getDefault() {
    HyundaiCountryAssembledMap defaultMap = new HyundaiCountryAssembledMap();

    defaultMap.put("2", "Canada");
    defaultMap.put("3", "USA");
    defaultMap.put("K", "Korea");

    return defaultMap;
  }

}
