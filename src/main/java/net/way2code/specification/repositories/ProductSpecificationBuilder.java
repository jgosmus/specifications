package net.way2code.specification.repositories;

import net.way2code.specification.entities.Product;
import org.springframework.data.jpa.domain.Specification;

public class ProductSpecificationBuilder {
    public static Specification<Product> byProductName(String product) {
        return ((root, query, criteriaBuilder) -> criteriaBuilder.equal(root.get("name"), product));
    }
}
