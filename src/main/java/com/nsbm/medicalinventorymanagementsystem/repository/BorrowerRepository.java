package com.nsbm.medicalinventorymanagementsystem.repository;

import com.nsbm.medicalinventorymanagementsystem.model.Borrower;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BorrowerRepository extends JpaRepository<Borrower, Long> {

}
