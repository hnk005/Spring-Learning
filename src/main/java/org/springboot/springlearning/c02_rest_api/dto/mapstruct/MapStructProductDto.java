package org.springboot.springlearning.c02_rest_api.dto.mapstruct;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
@RequiredArgsConstructor
@AllArgsConstructor
public class MapStructProductDto {
	@JsonProperty("product_name")
	private String name;
	
	@JsonProperty("product_price")
	private Double price;
}
