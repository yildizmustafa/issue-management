package com.my.over.entity.issuehistory;

import com.my.over.model.issuehistory.IssueHistory;
import org.springframework.data.mongodb.core.mapping.Document;

import java.io.Serializable;

@Document("ISSUE_HISTORY")

public class IssueHistoryEntity extends IssueHistory implements Serializable {
    private final static long serialVersionUID = 1L;

}
