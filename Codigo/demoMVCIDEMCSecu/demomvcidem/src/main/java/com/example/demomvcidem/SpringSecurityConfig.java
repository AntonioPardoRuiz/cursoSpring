package com.example.demomvcidem;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfiguration;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class SpringSecurityConfig {

@Bean
public static BCryptPasswordEncoder passwordEncoder() {
    return new BCryptPasswordEncoder();
}

@Bean
public UserDetailsService userDetailsService()throws Exception{
    InMemoryUserDetailsManager manager = new InMemoryUserDetailsManager();
    manager.createUser(User
    .withUsername("Antonio")
    .password(passwordEncoder().encode("12345"))
    .roles("USER")
    .build());

    manager.createUser(User
    .withUsername("admin")
    .password(passwordEncoder().encode("admin"))
    .roles("ADMIN","USER")
    .build());
      return manager;
    
}

@Bean
public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
    http.authorizeHttpRequests((authz) -> {
        try {
            authz.requestMatchers("/","/login").permitAll()
            .requestMatchers("/consultas/**").hasAnyRole("ADMIN")
            .requestMatchers("/facturacion/**").hasRole("ADMIN")
            .requestMatchers("/menu/**").hasRole("ADMIN")
            .requestMatchers("/register/**").hasAnyRole("ADMIN","USER")
            .anyRequest().authenticated()
            .and()
//            .formLogin().permitAll()
            .formLogin().permitAll()
            .and()
            .logout().permitAll();
        } catch (Exception e) {
            e.printStackTrace();
        }
    });
    return http.build();
}

}
