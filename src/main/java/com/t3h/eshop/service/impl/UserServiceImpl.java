package com.t3h.eshop.service.impl;

import com.t3h.eshop.service.UserService;
import com.t3h.eshop.storage.entiy.UserInfoEntity;
import com.t3h.eshop.storage.repository.UserInfoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserInfoRepository userInfoRepository;
    @Override
    public List<UserInfoEntity> getAll() {
        return userInfoRepository.findAll();
    }

    @Override
    public UserInfoEntity add(UserInfoEntity userInfoEntity) {
        return userInfoRepository.save(userInfoEntity);
    }

    @Override
    public UserInfoEntity update(Integer id, UserInfoEntity userInfoEntity) {
        UserInfoEntity userInfoEntity1=userInfoRepository.findById(id).orElse(null);
        userInfoEntity1.setUserId(userInfoEntity.getUserId());
        userInfoEntity1.setEmail(userInfoEntity.getEmail());
        userInfoEntity1.setImage(userInfoEntity.getImage());
        userInfoEntity1.setName(userInfoEntity.getName());
        userInfoEntity1.setPhoneNumber(userInfoEntity.getPhoneNumber());
        userInfoEntity1.setCreatedAt(userInfoEntity.getCreatedAt());
        return  userInfoRepository.save(userInfoEntity1);
    }

    @Override
    public UserInfoEntity detail(Integer id) {
        return userInfoRepository.findById(id).orElse(null);
    }

    @Override
    public Boolean delete(Integer id) {
        this.userInfoRepository.deleteById(id);
        return true;
    }
}
