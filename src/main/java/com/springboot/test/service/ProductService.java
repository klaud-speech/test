package com.springboot.test.service;

import com.springboot.test.data.dto.ProductDto;
import com.springboot.test.data.dto.impl.ProductResponseDto;
import com.springboot.test.data.entity.Product;

public interface ProductService {

    ProductResponseDto getProduct(Long number );

    ProductResponseDto saveProduct(ProductDto productDto);

    ProductResponseDto changeProduct( Long number, String name) throws Exception;

    void deleteProduct( Long number ) throws Exception;

}
