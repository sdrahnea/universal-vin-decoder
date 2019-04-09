package com.uvd.converter.ui;

import org.omnifaces.util.selectitems.SelectItemsUtils;

import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.ConverterException;

/**
 *
 * @author sdrahnea
 */
public abstract class UIAbstractConverter<T> implements Converter {

  @Override
  public Object getAsObject(FacesContext fc, UIComponent uic, String value) {
    if (value != null && value.trim().length() > 0) {
      try {
        return SelectItemsUtils.findValueByStringConversion(fc, uic, value, this);
      } catch (NumberFormatException e) {
        throw new ConverterException(new FacesMessage(FacesMessage.SEVERITY_ERROR, "Conversion Error", "Not a valid object."));
      }
    } else {
      return null;
    }
  }

  @Override
  public String getAsString(FacesContext fc, UIComponent uic, Object object) {
    if (object != null) {
      return String.valueOf((T) object);
    } else {
      return null;
    }
  }

}
