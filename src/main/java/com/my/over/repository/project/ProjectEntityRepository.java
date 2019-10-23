package com.my.over.repository.project;

import com.my.over.entity.project.ProjectEntity;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.Optional;

public interface ProjectEntityRepository extends MongoRepository<ProjectEntity,String> {
    Optional<ProjectEntity> findById(String id);
}
