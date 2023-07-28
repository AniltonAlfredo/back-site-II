package com.site.uma;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;


@Configuration
@EnableWebSecurity
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {
    @Override
    protected void configure(HttpSecurity http) throws Exception {
        /*http
                .requiresChannel() // Define as regras de canal (HTTP ou HTTPS)
                .anyRequest() // Aplica a regra a todas as solicitações
                .requiresSecure(); // Exige que as solicitações sejam feitas via HTTPS


        http
                .csrf().disable() // Desabilita a proteção CSRF (pode ser habilitado posteriormente de acordo com suas necessidades)
                .headers().frameOptions().disable(); // Permite o uso do H2 Console (caso esteja usando o H2 Database)
    */
    }
}
