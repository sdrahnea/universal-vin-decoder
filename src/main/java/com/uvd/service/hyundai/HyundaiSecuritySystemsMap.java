package com.uvd.service.hyundai;

import java.util.HashMap;


/***
 * Hyundai World Manufacture Identifier Map
 */
public class HyundaiSecuritySystemsMap extends HashMap<String, String> {

  public static HyundaiSecuritySystemsMap getDefault() {
    HyundaiSecuritySystemsMap defaultMap = new HyundaiSecuritySystemsMap();

    defaultMap.put("1", "Inertial seat belts");
    defaultMap.put("2", "airbags");
    defaultMap.put("3", "pillow safety, driver");
    defaultMap.put("4", "pillow safety, driver and passenger");
    defaultMap.put("5", "switchable passenger airbag");

    return defaultMap;
  }

}
