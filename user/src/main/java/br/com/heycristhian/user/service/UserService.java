package br.com.heycristhian.user.service;

import br.com.heycristhian.user.domain.User;
import br.com.heycristhian.user.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private UserRepository repository;

    public Optional<User> findByName(String name) {
        return repository.findByNameIgnoreCase(name);
    }

    public User save(User user) {
        return repository.save(user);
    }
}
