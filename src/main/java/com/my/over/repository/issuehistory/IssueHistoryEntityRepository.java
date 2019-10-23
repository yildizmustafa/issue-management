package com.my.over.repository.issuehistory;

import com.my.over.entity.issuehistory.IssueHistoryEntity;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.Optional;

public interface IssueHistoryEntityRepository extends MongoRepository<IssueHistoryEntity,String> {
    Optional<IssueHistoryEntity> findById(String id);
}
