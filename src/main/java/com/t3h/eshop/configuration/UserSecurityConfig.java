package com.t3h.eshop.configuration;

import com.t3h.eshop.service.UserService;
import com.t3h.eshop.service.impl.UserServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.annotation.Order;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@Order(1)
@EnableWebSecurity
public class UserSecurityConfig {
//    @Bean
//    public SecurityFilterChain filterChain2(HttpSecurity http) throws Exception{
//        http
//                .authorizeHttpRequests(authorize -> authorize
//                        .requestMatchers("/user/login").hasRole("USER")// bỏ qua ko xác thực URLs
////                        .requestMatchers("/css/**", "/js/**", "/images/**").permitAll()// bỏ qua ko xác thực URLs
////                        .requestMatchers("/static").permitAll()// bỏ qua ko xác thực URLs
//                        .anyRequest().authenticated()
//                ).formLogin(login -> login.loginPage("/user/login").usernameParameter("email").loginProcessingUrl("/user/login").defaultSuccessUrl("/user/home").permitAll());
//        return http.build();
//    }
    @Bean
    SecurityFilterChain web1(HttpSecurity http) throws Exception {
        http
                .authorizeHttpRequests(authorize -> authorize
                        .requestMatchers("/user/login").permitAll()
                        .anyRequest().hasRole("USER")
                )
                .formLogin(login -> login
                        .loginPage("/user/login")
                        .usernameParameter("email")
                        .loginProcessingUrl("/user/login")
                        .defaultSuccessUrl("/user/home")
                        .permitAll()
                );

        return http.build();
    }
}
