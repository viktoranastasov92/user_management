package com.test.example.repository;

import com.test.example.entity.User;
// import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
// another approach - can also have an annotation - to also include an embedded rest controller
public interface UserRepository extends MongoRepository<User, String> {
}
