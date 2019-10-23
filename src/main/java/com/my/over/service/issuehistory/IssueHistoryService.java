package com.my.over.service.issuehistory;

import com.my.over.repository.issuehistory.IssueHistoryEntityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class IssueHistoryService {
    @Autowired
    IssueHistoryEntityRepository issueHistoryEntityRepository;
}
