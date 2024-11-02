package com.truongdev.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.truongdev.model.User;

public interface UserRepository extends JpaRepository<User, Integer> {

}