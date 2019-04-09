package com.uvd.controller;

import com.uvd.model.ChartType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * Created by sdrahnea
 */
@RestController
@RequestMapping(value = "/chart-type")
public class ChartTypeController extends AbstractController<ChartType> {
}