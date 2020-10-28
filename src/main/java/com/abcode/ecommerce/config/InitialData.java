package com.abcode.ecommerce.config;

import com.abcode.ecommerce.entity.User;
import com.abcode.ecommerce.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;

@Configuration
public class InitialData implements CommandLineRunner {

    @Autowired
    private UserRepository userRepository;

    @Override
    public void run(String... args) throws Exception {
        User user1 = new User(null, "Maria Brown", "maria@gmail.com", "9298888888", "123456");
        User user2 = new User(null, "Alex Green", "alex@gmail.com", "92981777777", "123456");

        userRepository.saveAll(Arrays.asList(user1, user2));
    }
}
