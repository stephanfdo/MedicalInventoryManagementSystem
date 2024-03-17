package com.nsbm.mims.service;

import com.nsbm.mims.model.Supplier;

public interface SupplierService {
    Supplier createSupplier(Supplier supplier);

    Supplier getSupplier(Long supplierId);

    Supplier updateSupplier(Long supplierId, Supplier supplierDetails);

    void deleteSupplier(Long supplierId);
}