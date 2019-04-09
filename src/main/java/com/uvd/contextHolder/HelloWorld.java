package com.uvd.contextHolder;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.faces.bean.ManagedBean;

/**
 * Created by sdrahnea
 */
@ManagedBean
@Data
@NoArgsConstructor
@AllArgsConstructor
public class HelloWorld {

    private String firstName="";
    private String lastName="";

    public String showGreeting(){
        return "Hi "+firstName+" "+lastName;
    }
}
