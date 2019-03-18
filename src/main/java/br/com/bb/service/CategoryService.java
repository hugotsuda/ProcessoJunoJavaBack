package br.com.bb.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.bb.entity.CategoryEntity;
import br.com.bb.repository.CategoryRepository;

@Service
public class CategoryService {
	
	@Autowired
	private CategoryRepository categoryRepository;
	
	public List<CategoryEntity> findCategories() {

		//List<CategoryEntity> entities = (List<CategoryEntity>) categoryRepository.findAll();
//		return entities;
		
		List<CategoryEntity> categories = new ArrayList<CategoryEntity>();
		categoryRepository.findAll().forEach(category -> categories.add(category));
        return categories;
		
	}

}
