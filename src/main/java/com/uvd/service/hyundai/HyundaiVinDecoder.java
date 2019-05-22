package com.uvd.service.hyundai;

import com.uvd.model.Decoder;
import com.uvd.model.Position;
import com.uvd.model.Vin;

import java.util.HashMap;
import java.util.Map;

//  https://www.youcanic.com/guide/hyundai-vin-decoder

public class HyundaiVinDecoder extends Vin {

  private HyundaiCountryAssembledMap hyundaiCountryAssembledMap = HyundaiCountryAssembledMap.getDefault();
  private HyundaiWMIMap hyundaiWMIMap = HyundaiWMIMap.getDefault();

  public HyundaiVinDecoder(String value){
    super(value);
  }

  public Map<String, String> decode(String value) {
    Map<String, String> result = new HashMap<>();
    result.put(getPosition1().getName(), this.getPosition1().getValue());
    result.put(getPosition2().getName(), getPosition2().getValue());
    result.put(getPosition3().getName(), this.getPosition3().getValue());
    result.put(getPosition4().getName(), getPosition4().getValue());
    result.put(getPosition5().getName(), getPosition5().getValue());
    result.put(getPosition6().getName(), getPosition6().getValue());
    result.put(getPosition7().getName(), getPosition7().getValue());
    result.put(getPosition8().getName(), getPosition8().getValue());
    result.put(getPosition9().getName(), getPosition9().getValue());
    result.put(getPosition10().getName(), getPosition10().getValue());
    result.put(getPosition11().getName(), getPosition11().getValue());
    result.put(getPositionAfterEleven().getName(), getPositionAfterEleven().getValue());
    return result;
  }

  @Override
  public Position getPosition1(){
    String pos1Name = super.getPosition1().getValue();
    System.out.println(pos1Name + " -> " + hyundaiCountryAssembledMap.get(pos1Name));
    super.getPosition1().setValue(hyundaiCountryAssembledMap.get(pos1Name));
    return super.getPosition1();
  }

  @Override
  public Position getPosition3(){
    String wmi = super.getWmi();
    super.getPosition3().setValue(hyundaiWMIMap.get(wmi));
    return super.getPosition3();
  }

}
