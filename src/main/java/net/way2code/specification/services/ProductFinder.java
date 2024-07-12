package net.way2code.specification.services;

import lombok.RequiredArgsConstructor;
import net.way2code.specification.entities.Product;
import net.way2code.specification.repositories.ProductRepository;
import net.way2code.specification.repositories.ProductSpecificationBuilder;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ProductFinder {

    private final ProductRepository repository;

    public List<Product> findProducts(String productName) {
        Specification<Product> spec = ProductSpecificationBuilder.byProductName(productName);
        return repository.findAll(spec);
    }
}
