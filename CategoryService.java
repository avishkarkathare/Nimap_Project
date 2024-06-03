package com.Nimap.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.data.domain.Page;

import com.Nimap.model.Category;
import com.Nimap.respority.CategoryRepository;

import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;

@Service
public class CategoryService  {
	  @Autowired
	    private CategoryRepository categoryRepository;

	    public List<Category> getAllCategories() {
	        return categoryRepository.findAll();
	    }

	    public Category getCategoryById(Long id) {
	        return categoryRepository.findById(id).orElse(null);
	    }

	    public Category createCategory(Category category) {
	        return categoryRepository.save(category);
	    }

	    public Category updateCategory(Category category) {
	        return categoryRepository.save(category);
	    }

	    public void deleteCategory(Long id) {
	        categoryRepository.deleteById(id);
	    }
	    public List<Category> getAllCategories(int page, int size) {
	        Pageable pageable = PageRequest.of(page, size);
	        Page<Category> categoryPage = categoryRepository.findAll(pageable);
	        return categoryPage.getContent();
	    }
	}