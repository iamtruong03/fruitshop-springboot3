package com.truongdev.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.truongdev.model.Category;

public interface CategoryReponsitory extends JpaRepository<Category, Integer>  {
	public Boolean existsByName(String name);
}
