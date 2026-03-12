package org.springboot.springlearning.c02_rest_api.services;

import org.springboot.springlearning.c02_rest_api.dto.mapstruct.MapStructProductDto;
import org.springboot.springlearning.c02_rest_api.dto.record.ProductDto;
import org.springboot.springlearning.c02_rest_api.entities.Product;
import org.springboot.springlearning.c02_rest_api.mappers.ProductMapper;
import org.springboot.springlearning.c02_rest_api.repository.ProductRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ProductService {
	
	private final ProductRepository productRepository;
	private final ProductMapper productMapper;
	
	public ProductService(ProductRepository productRepository, ProductMapper productMapper) {
		this.productRepository = productRepository;
		this.productMapper = productMapper;
	}
	
	public List<ProductDto> findAll() {
		return productRepository.findAll()
				.stream()
				.map((product) -> new ProductDto(product.getName(), product.getPrice()))
				.collect(Collectors.toList());
	}
	
	public List<MapStructProductDto> findAllWithMapStruct() {
		return productRepository.findAll()
				.stream()
				.map(productMapper::toDto)
				.collect(Collectors.toList());
	}
	
	public Product findById(Long id) {
		return productRepository.findById(id)
				.orElse(null);
	}
	
	public Product save(Product product) {
		return productRepository.save(product);
	}
	
	public Product update(Long id, Product product) {
		return productRepository.findById(id)
				.map(existingProduct -> {
					existingProduct.setName(product.getName() != null ? product.getName() : existingProduct.getName());
					existingProduct.setPrice(product.getPrice() != null ? product.getPrice() :
							existingProduct.getPrice());
					return productRepository.save(existingProduct);
				})
				.orElse(null);
	}
	
	public void deleteById(Long id) {
		productRepository.deleteById(id);
	}
}
