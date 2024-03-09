package com.nsbm.medicalinventorymanagementsystem.service;

import com.nsbm.medicalinventorymanagementsystem.model.Loan;

import java.util.List;

public interface IItemIssuanceService {
    void saveItemIssued(Loan loan);

    List<Loan> getAllIssuedItems();

    List<Loan> getAllReturnedItem();

    List<Loan> getItemsWithFine();

    void deleteIssuedItemById(long id);

    Loan findItemIssuedById(long id);

    String validateLoanId(long loanId);

    Loan findItemIssued(long borrowerId, long itemId);
}
