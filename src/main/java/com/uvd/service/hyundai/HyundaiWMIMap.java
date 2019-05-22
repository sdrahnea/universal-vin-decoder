package com.uvd.service.hyundai;

import java.util.HashMap;


/***
 * Hyundai World Manufacture Identifier Map
 */
public class HyundaiWMIMap extends HashMap<String, String> {

  public static HyundaiWMIMap getDefault() {
    HyundaiWMIMap defaultMap = new HyundaiWMIMap();

    defaultMap.put("2HM", "Bromont Assy Plant (CAN)");
    defaultMap.put("3H3", "HYUNDAI (USA)");
    defaultMap.put("KM2", "HYUNDAI (KOR)");
    defaultMap.put("KM5", "HYUNDAI (KOR)");
    defaultMap.put("KM6", "HYUNDAI (KOR)");
    defaultMap.put("KM7", "HYUNDAI (KOR)");
    defaultMap.put("KM8", "HYUNDAI (KOR)");
    defaultMap.put("KMC", "HYUNDAI (KOR)");
    defaultMap.put("KME", "HYUNDAI (KOR)");
    defaultMap.put("KMF", "HYUNDAI (KOR)");
    defaultMap.put("KMH", "HYUNDAI (KOR)");
    defaultMap.put("KMJ", "HYUNDAI (KOR)");
    defaultMap.put("KML", "HYUNDAI (KOR)");
    defaultMap.put("KMM", "HYUNDAI (KOR)");
    defaultMap.put("KMN", "HYUNDAI (KOR)");
    defaultMap.put("KMP", "HYUNDAI (KOR)");
    defaultMap.put("KMR", "HYUNDAI (KOR)");
    defaultMap.put("KMX", "HYUNDAI (KOR)");
    defaultMap.put("KMY", "HYUNDAI (KOR)");
    defaultMap.put("KMZ", "HYUNDAI (KOR)");
    defaultMap.put("KN1", "HYUNDAI (KOR)");
    defaultMap.put("KN2", "HYUNDAI (KOR)");
    defaultMap.put("KNH", "HYUNDAI (KOR)");
    defaultMap.put("KNN", "Hyundai Motor Co (KOR)");
    defaultMap.put("KNV", "HYUNDAI (KOR)");
    defaultMap.put("KRT", "HYUNDAI (KOR)");
    defaultMap.put("KRV", "HYUNDAI (KOR)");
    defaultMap.put("MAL", "HYUNDAI (India)");
    defaultMap.put("MB2", "HYUNDAI (India)");
    defaultMap.put("MC3", "HYUNDAI (India)");
    defaultMap.put("NA6", "Rayen Vehicle Manufacturing Co (RVMCO) (Iran)");
    defaultMap.put("NLH", "HYUNDAI (Turkey)");
    defaultMap.put("NLJ", "HYUNDAI (Turkey)");
    defaultMap.put("X7M", "TagAZ (Russia)");
    defaultMap.put("X89", "KuzbassAvto Ltd. (Russia)");
    defaultMap.put("XU7", "Rostov plant lorries (RZGA) Russia");
    defaultMap.put("Y6L", "LuAZ SA (Ukraine)");
    defaultMap.put("Z94", "HYUNDAI MOTOR MANUFACTURING RUS LLC (Russia)");

    return defaultMap;
  }

}
