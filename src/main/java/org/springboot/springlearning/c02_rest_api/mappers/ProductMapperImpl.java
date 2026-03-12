package org.springboot.springlearning.c02_rest_api.mappers;

import org.springboot.springlearning.c02_rest_api.dto.mapstruct.MapStructProductDto;
import org.springboot.springlearning.c02_rest_api.entities.Product;
import org.springframework.stereotype.Component;

@Component
public class ProductMapperImpl implements ProductMapper {
	
	
	@Override
	public MapStructProductDto toDto(Product product) {
		if (product == null) {
			return null;
		}
		
		MapStructProductDto mapStructProductDto = new MapStructProductDto();
		
		mapStructProductDto.setName(product.getName());
		mapStructProductDto.setPrice(product.getPrice());
		
		return mapStructProductDto;
	}
	
	@Override
	public Product toEntity(MapStructProductDto productDto) {
		return null;
	}
}
