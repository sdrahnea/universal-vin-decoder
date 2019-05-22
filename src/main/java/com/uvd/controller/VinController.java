package com.uvd.controller;

import com.uvd.model.Constant;
import com.uvd.model.Vin;
import com.uvd.service.hyundai.HyundaiVinDecoder;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

/**
 * Created by sdrahnea
 */
@RestController
@RequestMapping(value = "/hyundai")
@CrossOrigin("*")
public class VinController {

  HyundaiVinDecoder decoder;

  @RequestMapping(value = "/{value}", method = RequestMethod.GET)
  public Map<String, String> decode(@PathVariable("value") String value) {
    decoder = new HyundaiVinDecoder(value);
    return decoder.decode(value);
  }

}