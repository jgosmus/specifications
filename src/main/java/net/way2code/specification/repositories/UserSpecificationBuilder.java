package net.way2code.specification.repositories;

import net.way2code.specification.entities.User;
import org.springframework.data.jpa.domain.Specification;

public class UserSpecificationBuilder {
    public static Specification<User> byUsername(String username) {
        return ((root, query, criteriaBuilder) -> criteriaBuilder.equal(root.get("username"), username));
    }
}
