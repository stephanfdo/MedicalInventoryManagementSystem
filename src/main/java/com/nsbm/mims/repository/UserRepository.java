package com.nsbm.mims.repository;

import com.nsbm.mims.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
