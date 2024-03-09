package com.nsbm.medicalinventorymanagementsystem.service.impl;

import com.nsbm.medicalinventorymanagementsystem.model.Vendor;
import com.nsbm.medicalinventorymanagementsystem.repository.VendorRepository;
import com.nsbm.medicalinventorymanagementsystem.service.VendorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class VendorServiceImpl implements VendorService {

    @Autowired
    private VendorRepository vendorRepository;


    @Override
    public Vendor getVendorById(long id) {
        return null;
    }

    @Override
    public Vendor getVendorByName(String name) {
        return null;
    }

    @Override
    public String validateVendorId(long id) {
        return null;
    }

    @Override
    public String validateVendorName(String vendorName) {
        return null;
    }
}
