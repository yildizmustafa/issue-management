package com.my.over.repository.user;

import com.my.over.entity.user.UserEntity;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.Optional;

public interface UserEntityRepository extends MongoRepository<UserEntity,String> {
    Optional<UserEntity> findById(String id);
}
