package net.way2code.specification.controllers;

import lombok.RequiredArgsConstructor;
import net.way2code.specification.entities.Product;
import net.way2code.specification.repositories.ProductSpecificationBuilder;
import net.way2code.specification.services.ProductFinder;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("product")
@RequiredArgsConstructor
public class ProductController {
    private final ProductFinder productFinder;

    @GetMapping("{product}")
    public List<Product> getProductByName(@PathVariable("product") String product) {
        return productFinder.findProducts(product);
    }
}
