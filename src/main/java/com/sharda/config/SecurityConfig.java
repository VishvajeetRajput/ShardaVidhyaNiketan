  package com.sharda.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {

    @Autowired
    private CustomUserDetailsService userDetailsService;

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        
    	 http.csrf().disable();
         
         // Allow access to the home and login page
         http.authorizeRequests()
             .antMatchers("/", "/login").permitAll()
             .anyRequest().authenticated();
         
         // Use form-based login instead of basic authentication
         http.formLogin()
             .loginPage("/login")  // Specify custom login page
             .permitAll();  // Allow access to login page without authentication

         // Disable the default basic authentication
          http.httpBasic(); //- Removed to disable alert-style login prompt
    	
    }

    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth.userDetailsService(userDetailsService).passwordEncoder(NoOpPasswordEncoder.getInstance());
    }
    
    
}
