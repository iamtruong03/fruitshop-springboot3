package com.truongdev.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.truongdev.model.UserDtls;

public interface UserRepository extends JpaRepository<UserDtls, Integer> {

}
