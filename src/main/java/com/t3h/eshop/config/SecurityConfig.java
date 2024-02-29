package com.t3h.eshop.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.WebSecurityConfigurer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityCustomizer;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class SecurityConfig {

    /**
     * URL: /**
     *
     * @param http
     * @return
     * @throws Exception
     */
    @Bean
    SecurityFilterChain web(HttpSecurity http) throws Exception {
        http
                .authorizeHttpRequests(authorize -> authorize
                        .requestMatchers("/Hello", "Hello3").permitAll()// bỏ qua ko xác thực URLs
                        .requestMatchers("/css/**", "/js/**", "/images/**").permitAll()// bỏ qua ko xác thực URLs
                        .requestMatchers("/static").permitAll()// bỏ qua ko xác thực URLs
                        .anyRequest().authenticated()
                )
                .formLogin(Customizer.withDefaults()) // mặc định, /login
        ;

        return http.build();
    }

    /**
     * Cấu hình bỏ qua xác thực static resources static
     * @return
     */
    @Bean
    WebSecurityCustomizer webSecurityCustomizer(){
        return web -> web.ignoring()
                .requestMatchers("/css/**","/public/**", "/static/**", "*.html", "/js/**", "/libs/**", "/media/**");
    }
}
