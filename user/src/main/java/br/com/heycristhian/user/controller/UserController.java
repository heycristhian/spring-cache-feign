package br.com.heycristhian.user.controller;

import br.com.heycristhian.user.domain.User;
import br.com.heycristhian.user.exception.UserNotFoundException;
import br.com.heycristhian.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/users")
public class UserController {

    @Autowired
    private UserService service;

    @GetMapping
    public User findUser(@RequestParam String name) {
        System.out.println("PASSOU NO FIND USER " + name);
        return service.findByName(name)
                .orElseThrow(UserNotFoundException::new);
    }
}
