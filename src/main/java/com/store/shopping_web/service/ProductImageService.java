package com.store.shopping_web.service;

import com.store.shopping_web.domain.ProductImage;
import com.store.shopping_web.repository.ProductImageRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductImageService {

    private final ProductImageRepository productImageRepository;

    public ProductImageService(ProductImageRepository productImageRepository) {
        this.productImageRepository = productImageRepository;
    }

    public List<ProductImage> getAllProductImages() {
        return productImageRepository.findAll();
    }

    public Optional<ProductImage> getProductImageById(Long id) {
        return productImageRepository.findById(id);
    }

    public ProductImage save(ProductImage productImage) {
        return productImageRepository.save(productImage);
    }

    public void delete(Long id) {
        productImageRepository.deleteById(id);
    }
}

