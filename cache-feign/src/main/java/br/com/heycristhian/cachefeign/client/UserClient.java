package br.com.heycristhian.cachefeign.client;

import br.com.heycristhian.cachefeign.domain.User;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "user", url = "http://localhost:8081/api")
public interface UserClient {

    @Cacheable("user")
    @GetMapping("/users")
    public User findUser();
}
