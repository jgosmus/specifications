package net.way2code.specification.controllers;

import lombok.RequiredArgsConstructor;
import net.way2code.specification.entities.User;
import net.way2code.specification.services.UserFinder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController("user")
@RequiredArgsConstructor
public class UserController {
    private final UserFinder userFinder;

    @GetMapping("{user}")
    public List<User> getUserByUsername(@PathVariable("user") String username) {
        return userFinder.findByUsername(username);
    }
}
