package com.my.over.repository.issue;

import com.my.over.entity.issue.IssueEntity;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.Optional;

public interface IssueEntityRepository extends MongoRepository<IssueEntity,String> {

    Optional<IssueEntity> findById(String id);

}
