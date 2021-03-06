package com.sample.Demo1.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
@Configuration
@EnableWebSecurity
public class Config {
    @Configuration
    @EnableWebSecurity
    public class WebSecurityConfig extends WebSecurityConfigurerAdapter {
        private static final String ROLE_1 = "ADMIN";
        private static final String ROLE_2 = "USER";

        // In-memory users with roles
        @Override
        protected void configure(AuthenticationManagerBuilder authenticationManagerBuilder) throws Exception {
            authenticationManagerBuilder.inMemoryAuthentication()
                    .withUser("admin")
                    .password(passwordEncoder().encode("@123"))
                    .roles(ROLE_1)
                    .and()
                    .withUser("user")
                    .password(passwordEncoder().encode("123"))
                    .roles(ROLE_2);
        }
        @Bean
        public PasswordEncoder passwordEncoder() {
            return new BCryptPasswordEncoder();
        }
        @Override
        protected void configure(HttpSecurity http) throws Exception {
            http.authorizeRequests()
                    .antMatchers("/Doctor","/Doctor/*","/LabReport","/LabReport/*","/patient","/patient/*").hasRole(ROLE_1)
                    .antMatchers("/patient","/patient/*").hasAnyRole(ROLE_2, ROLE_1)
                    .and().formLogin();
        }
    }
}
