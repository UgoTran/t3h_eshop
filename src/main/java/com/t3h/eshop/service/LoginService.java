package com.t3h.eshop.service;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

public interface LoginService {
    UserDetails loadUserByUsername(String email) throws UsernameNotFoundException;
}
