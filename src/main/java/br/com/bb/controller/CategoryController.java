package br.com.bb.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.bb.entity.CategoryEntity;
import br.com.bb.service.CategoryService;

@Controller
@RequestMapping("/category")
public class CategoryController {
	
	@Autowired
	private CategoryService categoryService;
	
	@GetMapping (value = "/listAll")
	public ResponseEntity<Object> getCategory() {
		List<CategoryEntity> categorias = categoryService.findCategories();
		return new ResponseEntity<>(categorias, HttpStatus.OK);
	}

}
