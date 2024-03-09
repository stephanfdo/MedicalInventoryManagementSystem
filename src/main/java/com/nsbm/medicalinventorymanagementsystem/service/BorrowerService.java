package com.nsbm.medicalinventorymanagementsystem.service;

import com.nsbm.medicalinventorymanagementsystem.model.Borrower;

import java.util.List;

public interface BorrowerService {
    Borrower getBorrowerById(long id);

    List<Borrower> getAllBorrowers();

    long getBorrowerIdByLoanId(long loanId);

    String validateBorrowerId(long borrowerId);

    void updateBorrower(Borrower borrower);
}
