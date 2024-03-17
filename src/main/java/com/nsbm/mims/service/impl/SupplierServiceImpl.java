package com.nsbm.mims.service.impl;

import com.nsbm.mims.model.Supplier;
import com.nsbm.mims.repository.SupplierRepository;
import com.nsbm.mims.service.SupplierService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SupplierServiceImpl implements SupplierService {

    @Autowired
    private SupplierRepository supplierRepository;

    @Override
    public Supplier createSupplier(Supplier supplier) {
        return supplierRepository.save(supplier);
    }

    @Override
    public Supplier getSupplier(Long supplierId) {
        return supplierRepository.findById(supplierId).orElse(null);
    }

    @Override
    public Supplier updateSupplier(Long supplierId, Supplier supplierDetails) {
        Supplier supplier = getSupplier(supplierId);
        if (supplier == null)
            return null;

        // Update supplier details
        supplier.setName(supplierDetails.getName());
        supplier.setContactNumber(supplierDetails.getContactNumber());
        // Update other fields as needed

        return supplierRepository.save(supplier);
    }

    @Override
    public void deleteSupplier(Long supplierId) {
        supplierRepository.deleteById(supplierId);
    }
}