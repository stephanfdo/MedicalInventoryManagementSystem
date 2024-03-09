package com.nsbm.medicalinventorymanagementsystem.dto;

import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;

public class ItemReturnDto {

    @NotNull(message = "Item ID is mandatory")
    @Min(value = 1, message = "Item ID must be greater than 0")
    @Max(value = Long.MAX_VALUE, message = "Item ID must be lesser than " + Long.MAX_VALUE)
    private long itemId;

    @NotNull(message = "Borrower ID is mandatory")
    @Min(value = 1, message = "Borrower ID must be greater than 0")
    @Max(value = Long.MAX_VALUE, message = "Borrower ID must be lesser than " + Long.MAX_VALUE)
    private long borrowerId;

    private String returnDate;

    public ItemReturnDto() {

    }

    public ItemReturnDto(long itemId, long borrowerId, String returnDate) {
        super();
        this.itemId = itemId;
        this.borrowerId = borrowerId;
        this.returnDate = returnDate;
    }

    public long getItemId() {
        return itemId;
    }

    public void setItemId(long itemId) {
        this.itemId = itemId;
    }

    public long getBorrowerId() {
        return borrowerId;
    }

    public void setBorrowerId(long borrowerId) {
        this.borrowerId = borrowerId;
    }

    public String getReturnDate() {
        return returnDate;
    }

    public void setReturnDate(String returnDate) {
        this.returnDate = returnDate;
    }

}
