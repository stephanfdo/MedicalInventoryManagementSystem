package com.nsbm.medicalinventorymanagementsystem.service.impl;

import com.nsbm.medicalinventorymanagementsystem.model.Loan;
import com.nsbm.medicalinventorymanagementsystem.repository.ItemIssuanceRepository;
import com.nsbm.medicalinventorymanagementsystem.service.IItemIssuanceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ItemIssuanceServiceImpl implements IItemIssuanceService {

    @Autowired
    private ItemIssuanceRepository itemIssuanceRepository;

    @Override
    public void saveItemIssued(Loan loan) {

    }

    @Override
    public List<Loan> getAllIssuedItems() {
        return null;
    }

    @Override
    public List<Loan> getAllReturnedItem() {
        return null;
    }

    @Override
    public List<Loan> getItemsWithFine() {
        return null;
    }

    @Override
    public void deleteIssuedItemById(long id) {

    }

    @Override
    public Loan findItemIssuedById(long id) {
        return null;
    }

    @Override
    public String validateLoanId(long loanId) {
        return null;
    }

    @Override
    public Loan findItemIssued(long borrowerId, long itemId) {
        return null;
    }
}
