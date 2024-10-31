package com.truongdev.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.truongdev.model.Category;
import com.truongdev.repository.CategoryReponsitory;
import com.truongdev.service.CategoryService;

@Service
public class CategoryServiceImpl implements CategoryService {

	@Autowired
	private CategoryReponsitory categoryReponsitory;
	
	@Override
	public Category saveCategory(Category category) {
		
		return categoryReponsitory.save(category);
	}

	@Override
	public Boolean existCategory(String name) {
		
		return categoryReponsitory.existsByName(name);
	}

	@Override
	public List<Category> getAllCategory() {
		
		return categoryReponsitory.findAll();
	}

	@Override
	public Boolean deleteCategory(int id) {
		
		return null;
	}

	@Override
	public Category getCategoryById(int id) {
		
		return null;
	}

}
