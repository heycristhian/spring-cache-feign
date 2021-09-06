package br.com.heycristhian.user.controller;

import br.com.heycristhian.user.domain.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/users")
public class UserController {

    @GetMapping
    public User findUser() {
        System.out.println("PASSOU PELO CONTROLLER DE FIND USER");
        return User.builder()
                .name("CRISTHIAN")
                .lastName("DIAS")
                .city("ASSIS-SP")
                .build();
    }
}
