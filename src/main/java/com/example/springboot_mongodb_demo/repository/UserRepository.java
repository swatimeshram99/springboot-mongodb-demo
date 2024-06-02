package com.example.springboot_mongodb_demo.repository;

import com.example.springboot_mongodb_demo.model.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository  extends MongoRepository<User , String> {
}
