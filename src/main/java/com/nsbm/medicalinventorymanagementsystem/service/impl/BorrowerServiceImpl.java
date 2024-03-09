package com.nsbm.medicalinventorymanagementsystem.service.impl;

import com.nsbm.medicalinventorymanagementsystem.model.Borrower;
import com.nsbm.medicalinventorymanagementsystem.model.Loan;
import com.nsbm.medicalinventorymanagementsystem.repository.BorrowerRepository;
import com.nsbm.medicalinventorymanagementsystem.service.BorrowerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BorrowerServiceImpl implements BorrowerService {

    @Autowired
    private BorrowerRepository borrowerRepository;

    @Override
    public Borrower getBorrowerById(long id) {
        Optional<Borrower> optional = borrowerRepository.findById(id);
        Borrower borrower = null;
        if (optional.isPresent()) {
            borrower = optional.get();
        } else {
            // Exception
        }
        return borrower;
    }

    @Override
    public List<Borrower> getAllBorrowers() {
        return borrowerRepository.findAll();
    }

    @Override
    public long getBorrowerIdByLoanId(long loanId) {
        List<Borrower> borrowerList = getAllBorrowers();
        List<Loan> loanList;
        boolean found = false;
        long borrowerId = -1;
        for (Borrower borrower : borrowerList) {
            loanList = borrower.getLoan();
            for (Loan loan : loanList) {
                if (loan.getId() == loanId) {
                    borrowerId = borrower.getId();
                    found = true;
                    break;
                }
            }
            if (found) {
                break;
            }
        }
        return borrowerId;
    }

    @Override
    public String validateBorrowerId(long borrowerId) {
        String errorMessage = "";
        Borrower borrower = getBorrowerById(borrowerId);
        if (borrower == null) {
            errorMessage = "Borrower id does not exist.";
        }
        return errorMessage;
    }

    @Override
    public void updateBorrower(Borrower borrower) {
        borrowerRepository.save(borrower);

    }

}
