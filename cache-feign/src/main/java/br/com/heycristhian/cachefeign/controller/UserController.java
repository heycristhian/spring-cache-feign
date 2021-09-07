package br.com.heycristhian.cachefeign.controller;

import br.com.heycristhian.cachefeign.client.UserClient;
import br.com.heycristhian.cachefeign.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/users")
public class UserController {

    @Autowired
    private UserClient client;

    @GetMapping
    private User findByName(@RequestParam String name) {
        return client.findByName(name);
    }
}
