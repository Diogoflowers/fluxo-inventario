package com.fluxo_inventario.product.service;

import com.fluxo_inventario.product.dto.ProductRequestDTO;
import com.fluxo_inventario.product.dto.ProductResponseDTO;
import com.fluxo_inventario.product.entity.Product;
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

        Product product = new Product();

        product.setName(dto.name());
        product.setDescription(dto.description());
        product.setPrice(dto.price());
        product.setQuantity(dto.quantity());

        Product savedProduct = productRepository.save(product);

        return new ProductResponseDTO(
                savedProduct.getName(),
                savedProduct.getDescription(),
                savedProduct.getPrice(),
                savedProduct.getQuantity()
        );
    }

    public List<ProductResponseDTO> getAllProducts() {

        return productRepository.findAll()
                .stream()
                .map(product -> new ProductResponseDTO(
                        product.getName(),
                        product.getDescription(),
                        product.getPrice(),
                        product.getQuantity()
                ))
                .toList();
    }
}