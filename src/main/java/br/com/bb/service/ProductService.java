package br.com.bb.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.bb.entity.CategoryEntity;
import br.com.bb.entity.ProductEntity;
import br.com.bb.repository.CategoryRepository;
import br.com.bb.repository.ProductRepository;



@Service
public class ProductService {

	@Autowired
	private ProductRepository productRepository;
	
	@Autowired
	private CategoryRepository categoryRepository;
	
	public List<ProductEntity> findProducties() {

		List<ProductEntity> entities = (List<ProductEntity>) productRepository.findAll();
		return entities;
	}
	
	public List<ProductEntity> findProductByCategory(Integer categoryId) {
		CategoryEntity category = categoryRepository.findOne(categoryId);
		List<ProductEntity> entities = productRepository.findByCategory(category);
		return entities;
	}
}
