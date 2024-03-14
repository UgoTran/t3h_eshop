package com.t3h.eshop.configuration;

import com.t3h.eshop.storage.Role;
import com.t3h.eshop.storage.entity.UserInfoEntity;
import com.t3h.eshop.storage.repository.UserRepo;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;

import java.util.List;

public class DatabaseLoader {
    private UserRepo repo;
    public DatabaseLoader(UserRepo repo){
        this.repo=repo;
    }
    @Bean
    public CommandLineRunner Database(){
        return args -> {
            UserInfoEntity user1 = new UserInfoEntity("vinh@gmail.com","vinh123",Role.ADMIN);
            UserInfoEntity user2 = new UserInfoEntity("vinh2805@gmail.com","vinh2805",Role.USER);
            repo.saveAll(List.of(user1,user2));
            System.out.println("Database");
        };
    }
}
