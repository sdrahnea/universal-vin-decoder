package com.uvd.configs;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

/**
 * Created by sdrahnea
 */
@Configuration
@EnableWebSecurity
@EnableGlobalMethodSecurity(securedEnabled = true)
public class SecurityConfig extends WebSecurityConfigurerAdapter {

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.authorizeRequests()
                .antMatchers("/login.xhtml").permitAll()
            .antMatchers("/main.xhtml").authenticated();
     //           .anyRequest().authenticated();
        http.formLogin().usernameParameter("form:username").passwordParameter("form:password").loginPage("/login.xhtml").permitAll()
            .loginProcessingUrl("/login.xhtml")
                .failureUrl("/login.xhtml?error=true").defaultSuccessUrl("/main.xhtml");
        http.logout().logoutSuccessUrl("/login.xhtml");
        http.csrf().disable();
    }

    @Bean
    public PasswordEncoder getPasswordEncoder(){
        return new BCryptPasswordEncoder();
    }

    public static void main(String[] args){
        System.out.printf(new BCryptPasswordEncoder().encode("123"));
    }

}
