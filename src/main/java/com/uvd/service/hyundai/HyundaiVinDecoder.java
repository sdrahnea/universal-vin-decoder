package com.uvd.service;

import com.uvd.model.Decoder;
import com.uvd.model.Vin;

import java.util.HashMap;
import java.util.Map;

public class HyundaiVinDecoder extends Vin implements Decoder {

  @Override
  public Map<String, String> decode(String value) {
    Map<String, String> result = new HashMap<>();
    for (int position = 0; position < value.length(); position++) {
      
    }
    return result;
  }

}
