package com.abcode.ecommerce.config;

import com.abcode.ecommerce.entity.Order;
import com.abcode.ecommerce.entity.User;
import com.abcode.ecommerce.repository.OrderRepository;
import com.abcode.ecommerce.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

import java.time.Instant;
import java.util.Arrays;

@Configuration
public class InitialData implements CommandLineRunner {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private OrderRepository orderRepository;

    @Override
    public void run(String... args) throws Exception {
        User user1 = new User(null, "Maria Brown", "maria@gmail.com", "9298888888", "123456", null);
        User user2 = new User(null, "Alex Green", "alex@gmail.com", "92981777777", "123456", null);

        Order o1 = new Order(null, Instant.parse("2020-10-20T19:53:07Z"), user1);
        Order o2 = new Order(null, Instant.parse("2020-10-21T09:53:07Z"), user2);
        Order o3 = new Order(null, Instant.parse("2020-10-20T19:53:07Z"), user1);

        userRepository.saveAll(Arrays.asList(user1, user2));
        orderRepository.saveAll(Arrays.asList(o1,o2,o3));
    }
}
