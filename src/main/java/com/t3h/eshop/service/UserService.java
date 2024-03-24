package com.t3h.eshop.service;

import com.t3h.eshop.storage.entiy.UserInfoEntity;

import java.util.List;

public interface UserService {
    List<UserInfoEntity> getAll();
    UserInfoEntity add(UserInfoEntity userInfoEntity);
    UserInfoEntity update(Integer id,UserInfoEntity userInfoEntity);
    UserInfoEntity detail(Integer id);
    Boolean delete(Integer id);
}
