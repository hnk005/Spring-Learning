package org.springboot.springlearning.c02_rest_api.dto.record;

/**
 * Sử dụng record để tạo DTO, giúp giảm boilerplate code và tăng tính bất biến của đối tượng.
 * Record tự động tạo constructor, getter, equals, hashCode và toString.
 */
public record ProductDto(String name, Double price) {
}
