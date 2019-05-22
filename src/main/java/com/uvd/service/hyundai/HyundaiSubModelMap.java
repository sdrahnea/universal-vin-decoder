package com.uvd.service.hyundai;

import java.util.HashMap;


/***
 * Hyundai World Manufacture Identifier Map
 */
public class HyundaiSubModelMap extends HashMap<String, String> {

  public static HyundaiSubModelMap getDefault() {
    HyundaiSubModelMap defaultMap = new HyundaiSubModelMap();

    defaultMap.put("A", "Atos / Santro / Visto / i10");
    defaultMap.put("B", "Click / Getz");
    defaultMap.put("C", "Accent / Verna / Solaris");
    defaultMap.put("D", "Elantra (XD) / Lantra (XD) / i30 / Avante");
    defaultMap.put("E", "Sonata (except for the North American market) / Sonata (pr-va India)");
    defaultMap.put("F", "Grandeur XG / Azera");
    defaultMap.put("G", "Genesis");
    defaultMap.put("H", "Coupe / Tuscani / Tiburon");
    defaultMap.put("J", "Tucson");
    defaultMap.put("K", "Galopper");
    defaultMap.put("M", "Carstar / Santamo / Trajet");
    defaultMap.put("N", "erracan / Veracruz");
    defaultMap.put("P", "Matrix");
    defaultMap.put("R", "Grace");
    defaultMap.put("S", "Fe Santa");
    defaultMap.put("W", "Starex / Sonata (North American market) / H1 / H100");

    return defaultMap;
  }

}
