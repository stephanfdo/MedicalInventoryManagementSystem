package com.nsbm.medicalinventorymanagementsystem.service.impl;

import com.nsbm.medicalinventorymanagementsystem.model.Borrower;
import com.nsbm.medicalinventorymanagementsystem.repository.BorrowerRepository;
import com.nsbm.medicalinventorymanagementsystem.service.BorrowerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BorrowerServiceImpl implements BorrowerService {

    @Autowired
    private BorrowerRepository borrowerRepository;

    @Override
    public Borrower getBorrowerById(long id) {
        return null;
    }

    @Override
    public List<Borrower> getAllBorrowers() {
        return null;
    }

    @Override
    public long getBorrowerIdByLoanId(long loanId) {
        return 0;
    }

    @Override
    public String validateBorrowerId(long borrowerId) {
        return null;
    }

    @Override
    public void updateBorrower(Borrower borrower) {

    }
}
