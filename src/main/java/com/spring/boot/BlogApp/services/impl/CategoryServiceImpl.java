package com.spring.boot.BlogApp.services.impl;

import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.boot.BlogApp.entities.Category;
import com.spring.boot.BlogApp.exceptions.ResourceNotFoundException;
import com.spring.boot.BlogApp.payloads.CategoryDto;
import com.spring.boot.BlogApp.repositories.CategoryRepo;
import com.spring.boot.BlogApp.service.CategoryService;

@Service
public class CategoryServiceImpl implements CategoryService{
	
	@Autowired
	private CategoryRepo categoryRepo;
	
	@Autowired
	private ModelMapper modelMapper;
	
	//create category 
	@Override
	public CategoryDto createCategory(CategoryDto categoryDto) {
		Category cat = this.modelMapper.map(categoryDto, Category.class);
		Category addedCat = this.categoryRepo.save(cat);
		return this.modelMapper.map(addedCat, CategoryDto.class);
	}
	
	//update category
	@Override
	public CategoryDto updateCategory(CategoryDto categoryDto, Integer categoryId) {
		Category cat = this.categoryRepo.findById(categoryId).orElseThrow(()-> new ResourceNotFoundException("Category","CategoryId",categoryId));
		cat.setCategoryTitle(categoryDto.getCategoryTitle());
		cat.setCategoryDescription(categoryDto.getCategoryDescription());
		Category updatedCat = this.categoryRepo.save(cat);
		return this.modelMapper.map(updatedCat, CategoryDto.class);
	}
	
	//delete category
	@Override
	public void deleteCategory(Integer categoryId) {
		Category cat =this.categoryRepo.findById(categoryId).orElseThrow(()-> new ResourceNotFoundException("Category","category id",categoryId));
		this.categoryRepo.delete(cat);
	}
	
	//get single category
	@Override
	public CategoryDto getCategory(Integer categoryId) {
		Category cat = this.categoryRepo.findById(categoryId).orElseThrow(()->new ResourceNotFoundException("Category","category id",categoryId));		
		return this.modelMapper.map(cat,CategoryDto.class);
	}
	
	//get all category
	@Override
	public List<CategoryDto> getCategories() {
		List<Category> categories = this.categoryRepo.findAll();
		List<CategoryDto> catDtos=categories.stream().map((cat)-> this.modelMapper.map(cat, CategoryDto.class)).collect(Collectors.toList());
		return catDtos;
	}
	
}
