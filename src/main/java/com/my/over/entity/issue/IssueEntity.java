package com.my.over.entity.issue;

import com.my.over.model.issue.Issue;
import org.springframework.data.mongodb.core.mapping.Document;

import java.io.Serializable;

@Document("ISSUE")

public class IssueEntity extends Issue implements Serializable {
    private final static long serialVersionUID = 1L;

}
