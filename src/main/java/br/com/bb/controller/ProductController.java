package br.com.bb.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.bb.entity.ProductEntity;
import br.com.bb.service.ProductService;



@Controller
@RequestMapping("/product")
public class ProductController {

	
	@Autowired
	private ProductService productService;
	
	@GetMapping (value = "/listByCategory/{categoryId}")
	public ResponseEntity<Object> getProduct(@PathVariable(required = true, value = "categoryId") Integer id) {
		List<ProductEntity> produtos = productService.findProductByCategory(id);
		return new ResponseEntity<>(produtos, HttpStatus.OK);
	}
	
	
	
	
}
