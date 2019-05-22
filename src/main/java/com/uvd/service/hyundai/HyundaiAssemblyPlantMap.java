package com.uvd.service.hyundai;

import java.util.HashMap;


/***
 * Hyundai Assembly Plant map
 */
public class HyundaiAssemblyPlantMap extends HashMap<String, String> {

  public static HyundaiAssemblyPlantMap getDefault() {
    HyundaiAssemblyPlantMap defaultMap = new HyundaiAssemblyPlantMap();

    defaultMap.put("A", "A-San (Korea)");
    defaultMap.put("C", "Cheon-Ju (Korea)");
    defaultMap.put("M", "Chennnai (Madras) (India), TagAz (Russia)");
    defaultMap.put("U", "Ul-San (Korea)");
    defaultMap.put("Z", "Izmit (Turkey)");

    return defaultMap;
  }

}