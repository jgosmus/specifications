package net.way2code.specification.services;

import lombok.RequiredArgsConstructor;
import net.way2code.specification.entities.User;
import net.way2code.specification.repositories.UserRepository;
import net.way2code.specification.repositories.UserSpecificationBuilder;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UserFinder {
    private final UserRepository userRepository;

    public List<User> findByUsername(String username) {
        Specification<User> userSpecification = UserSpecificationBuilder.byUsername(username);
        return userRepository.findAll(userSpecification);
    }
}
