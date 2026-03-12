package org.springboot.springlearning.c02_rest_api.mappers;

import org.mapstruct.Mapper;
import org.springboot.springlearning.c02_rest_api.dto.mapstruct.MapStructProductDto;
import org.springboot.springlearning.c02_rest_api.entities.Product;

@Mapper
public interface ProductMapper {
	MapStructProductDto toDto(Product product);
	
	Product toEntity(MapStructProductDto productDto);
}
