package com.nsbm.medicalinventorymanagementsystem.service;

import com.nsbm.medicalinventorymanagementsystem.model.Vendor;

public interface VendorService {
    Vendor getVendorById(long id);

    Vendor getVendorByName(String name);

    String validateVendorId(long id);

    String validateVendorName(String vendorName);
}
