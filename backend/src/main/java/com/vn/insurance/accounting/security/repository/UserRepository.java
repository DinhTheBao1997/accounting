package com.vn.insurance.accounting.security.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vn.insurance.accounting.security.model.User;

public interface UserRepository extends JpaRepository<User, Long> {

	User findByUsername(String username);

	boolean existsByEmail(String email);

	boolean existsByUsername(String username);

}

