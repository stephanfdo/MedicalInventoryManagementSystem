package com.nsbm.medicalinventorymanagementsystem.convertor;

import com.nsbm.medicalinventorymanagementsystem.Utilities.Helper;
import com.nsbm.medicalinventorymanagementsystem.dto.ItemIssuanceDto;
import com.nsbm.medicalinventorymanagementsystem.model.Loan;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class ItemIssuanceConvertor {

    public ItemIssuanceDto modelToDto(Loan loan) {
        ItemIssuanceDto dto = new ItemIssuanceDto();
        try {
            dto.setId(loan.getId());
            dto.setLoanDuration(loan.getLoanDuration());
            dto.setIssueDate(loan.getIssueDate());
            dto.setDueDate(Helper.getDueDate(loan.getIssueDate(), loan.getLoanDuration()));
            dto.setItemId(loan.getItem().getId());
            dto.setBorrowerId(loan.getBorrower().getId());
            dto.setFineAmount(loan.getTotalFine());
            dto.setReturnDate(loan.getReturnDate());
        } catch (NullPointerException e) {
            System.out.println("Null Pointer Exception Caught in Item Issuance Convertor.");
        }
        return dto;
    }

    public Loan dtoToModel(ItemIssuanceDto dto) {
        Loan loan = new Loan();
        loan.setLoanDuration(dto.getLoanDuration());
        loan.setIssueDate(Helper.getCurrentTime());
        loan.setTotalFine(dto.getFineAmount());
        loan.setReturnDate("");
        return loan;
    }

    public List<ItemIssuanceDto> modelToDto(List<Loan> loanList) {
        List<ItemIssuanceDto> DtoList = new ArrayList<>();
        int size = loanList.size();
        for (int i = 0; i < size; i++) {
            DtoList.add(modelToDto(loanList.get(i)));
        }
        return DtoList;
    }
}
