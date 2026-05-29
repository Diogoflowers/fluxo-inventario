package com.fluxo_inventario.product.service;

import com.fluxo_inventario.product.dto.ProductRequestDTO;
import com.fluxo_inventario.product.dto.ProductResponseDTO;
import com.fluxo_inventario.product.entity.Product;
import com.fluxo_inventario.product.mapper.ProductMapper;
import com.fluxo_inventario.product.repository.ProductRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    private final ProductRepository productRepository;

    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public ProductResponseDTO createProduct(ProductRequestDTO dto) {

        Product product = ProductMapper.toEntity(dto);

        Product savedProduct = productRepository.save(product);

        return ProductMapper.toResponseDTO(savedProduct);
    }

    public List<ProductResponseDTO> getAllProducts() {

        return productRepository.findAll()
                .stream()
                .map(ProductMapper::toResponseDTO)
                .toList();
    }
}