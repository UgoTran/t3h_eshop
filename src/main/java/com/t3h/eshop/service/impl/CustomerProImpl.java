package com.t3h.eshop.service.impl;

import com.t3h.eshop.service.CustomerProfileService;
import com.t3h.eshop.storage.entity.CustomerProfileEntity;
import com.t3h.eshop.storage.repository.CustomerRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerProImpl implements CustomerProfileService {
    @Autowired
    private CustomerRepo customerRepo;

    @Override
    public List<CustomerProfileEntity> getAllCus() {
        return (List<CustomerProfileEntity>) customerRepo.findAll();
    }
}
