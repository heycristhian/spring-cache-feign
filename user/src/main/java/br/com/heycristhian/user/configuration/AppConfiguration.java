package br.com.heycristhian.user.configuration;

import br.com.heycristhian.user.domain.User;
import br.com.heycristhian.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfiguration implements CommandLineRunner {

    @Autowired
    private UserService service;

    @Override
    public void run(String... args) throws Exception {
        service.save(
                User.builder()
                        .name("Cristhian")
                        .lastName("Dias")
                        .city("Assis")
                        .build()
        );

        service.save(
                User.builder()
                        .name("Jose")
                        .lastName("Silva")
                        .city("Candido Mota")
                        .build()
        );
    }
}
