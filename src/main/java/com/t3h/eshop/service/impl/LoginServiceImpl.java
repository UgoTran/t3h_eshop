package com.t3h.eshop.service.impl;

import com.t3h.eshop.detail.CustomUserDetails;
import com.t3h.eshop.service.LoginService;
import com.t3h.eshop.storage.entity.UserInfoEntity;
import com.t3h.eshop.storage.repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;

@Component
public class LoginServiceImpl implements LoginService {
    @Autowired private UserRepo repo;
    @Override
    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException{
        UserInfoEntity user = repo.findByEmail(email);
        if(user==null){
            throw new UsernameNotFoundException("No user found with the given email");
        }
        return new CustomUserDetails(user);
    }
}
