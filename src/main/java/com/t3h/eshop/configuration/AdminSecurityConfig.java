package com.t3h.eshop.configuration;

import com.t3h.eshop.service.LoginService;
import com.t3h.eshop.service.impl.LoginServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.annotation.Order;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;

import static com.t3h.eshop.configuration.RequestMatcher.PREMIT_URL;

@Configuration
@Order(2)
@EnableWebSecurity(debug = true)
public class AdminSecurityConfig{
    @Bean
    public LoginService loginService(){
        return new LoginServiceImpl();
    }

    @Bean
    public PasswordEncoder passwordEncoder() {
        return NoOpPasswordEncoder.getInstance();
    }

    @Bean
    SecurityFilterChain web2(HttpSecurity http) throws Exception {
        http
                .authorizeHttpRequests(authorize -> authorize
                        .requestMatchers(PREMIT_URL).permitAll()
                        .anyRequest().hasRole("ADMIN")
                )
                .formLogin(login -> login
                        .loginPage("/admin/login")
                        .usernameParameter("email")
                        .loginProcessingUrl("/admin/login")
                        .defaultSuccessUrl("/admin/home")
                        .permitAll()
                );

        return http.build();
    }

}
