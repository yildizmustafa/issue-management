package com.my.over.model.issuehistory;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.my.over.model.AbstractEntity;
import com.my.over.model.issue.Issue;
import com.my.over.model.user.User;
import lombok.Data;
import org.springframework.data.annotation.Id;

import java.io.Serializable;
import java.util.Date;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class IssueHistory extends AbstractEntity implements Serializable {

    @Id
    @JsonProperty("id")
    private Long id;

    @JsonProperty("issue")
    private Issue issue;

    @JsonProperty("description")
    private String description;

    @JsonProperty("date")
    private Date date;

    @JsonProperty("details")
    private String details;

    @JsonProperty("assignee")
    private User assignee;
}
