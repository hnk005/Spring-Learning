package org.springboot.springlearning.c02_rest_api.controllers;

import org.springboot.springlearning.c02_rest_api.dto.mapstruct.MapStructProductDto;
import org.springboot.springlearning.c02_rest_api.entities.Product;
import org.springboot.springlearning.c02_rest_api.services.ProductService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductController {
	
	private final ProductService service;
	
	public ProductController(ProductService service) {
		this.service = service;
	}
	
	@GetMapping("/products")
	public List<MapStructProductDto> getAllProducts() {
		// service.findAll(), sử dụng record mapping
		// service.findAllWithMapStruct(), sử dụng MapStruct mapping
		return service.findAllWithMapStruct();
	}
	
	@GetMapping("/products/{id}")
	public Product getProductById(@PathVariable Long id) {
		return service.findById(id);
	}
	
	@PostMapping("/products")
	public Product addProduct(@RequestBody Product product) {
		return service.save(product);
	}
	
	@PutMapping("/products/{id}")
	public Product updateProduct(@PathVariable Long id,
	                             @RequestBody Product product) {
		return service.update(id, product);
	}
	
	@DeleteMapping("/products/{id}")
	public void deleteProduct(@PathVariable Long id) {
		service.deleteById(id);
	}
}
