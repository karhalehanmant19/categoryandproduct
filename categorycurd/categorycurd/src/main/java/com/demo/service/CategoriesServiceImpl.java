package com.demo.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.demo.entites.Categories;

@Service
public class CategoriesServiceImpl implements CategoriesService {

	List<Categories> list;

	public CategoriesServiceImpl() {
		list = new ArrayList<>();
		list.add(new Categories(1, "Java", "This code contains basics of Java"));
		list.add(new Categories(2, "Spring Boot", "Spring Boot courses"));
	}

	@Override
	public List<Categories> getCategories() {
		return list;
	}

	@Override
	public Categories getCategory(long categoryId) {
		for (Categories category : list) {
			if (category.getId() == categoryId) {
				return category;
			}
		}
		return null; // Return null if category not found
	}

	@Override
	public Categories addCategory(Categories category) {

		// Assuming that the id for the new category is generated automatically
		list.add(category);
		return category;
	}

	@Override
	public Categories updateCategory(Categories category) {
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getId() == category.getId()) {
				list.set(i, category);
				return category;
			}
		}
		return null; // Return null if category not found
	}

	@Override
	public void deleteCategory(long categoryId) {
		// TODO Auto-generated method stub

	}
}
