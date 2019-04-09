package com.uvd.controller;

import com.uvd.model.Dashboard;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import javax.faces.bean.ManagedBean;

/**
 * Created by sdrahnea
 */
@RestController
@RequestMapping(value = "/dashboard")
public class DashboardController extends AbstractController<Dashboard> {

}