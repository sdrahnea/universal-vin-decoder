package com.uvd.service.hyundai;

import java.util.HashMap;


/***
 * Model year map (1971 -> 2030)
 */
public class HyundaiModelYearMap extends HashMap<String, String> {

  public static HyundaiModelYearMap getDefault() {
    HyundaiModelYearMap defaultMap = new HyundaiModelYearMap();

    defaultMap.put("", "");

    return defaultMap;
  }

}
