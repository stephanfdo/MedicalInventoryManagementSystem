package com.nsbm.medicalinventorymanagementsystem.repository;

import com.nsbm.medicalinventorymanagementsystem.model.Loan;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ItemIssuanceRepository extends JpaRepository<Loan, Long> {

}
