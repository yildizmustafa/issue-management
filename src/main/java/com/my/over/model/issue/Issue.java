package com.my.over.model.issue;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.my.over.model.AbstractEntity;
import com.my.over.model.project.Project;
import com.my.over.model.user.User;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;

import java.io.Serializable;
import java.util.Date;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Issue extends AbstractEntity implements Serializable {

    @Id
    @JsonProperty("id")
    private Long id;

    @JsonProperty("description")
    private String description;

    @JsonProperty("details")
    private String details;

    @JsonProperty("date")
    private Date date;

    @JsonProperty("assignee")
    private User assignee;

    @JsonProperty("project")
    private Project project;

}
