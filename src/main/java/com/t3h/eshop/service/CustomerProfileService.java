package com.t3h.eshop.service;

import com.t3h.eshop.storage.entity.CustomerProfileEntity;

import java.util.List;

public interface CustomerProfileService {
    List<CustomerProfileEntity> getAllCus();
}
