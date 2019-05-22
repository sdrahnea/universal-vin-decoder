package com.uvd.controller;

import com.uvd.model.Constant;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by sdrahnea
 */
@RestController
@RequestMapping(value = "/constant")
public class ConstantController extends AbstractController<Constant> {
}