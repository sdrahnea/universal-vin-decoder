package com.uvd.controller;

import org.springframework.stereotype.Component;
import javax.faces.bean.SessionScoped;

/**
 * Created by sdrahnea
 */
@Component
@SessionScoped
public class LoginController {

  public String login() {
    return "main";
  }

}
