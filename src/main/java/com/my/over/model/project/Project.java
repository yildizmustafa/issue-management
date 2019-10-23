package com.my.over.model.project;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.my.over.model.AbstractEntity;
import com.my.over.model.user.User;
import lombok.Data;
import org.springframework.data.annotation.Id;

import java.io.Serializable;
@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Project extends AbstractEntity implements Serializable {

    @Id
    @JsonProperty("id")
    private Long id;

    @JsonProperty("projectName")
    private String projectName;

    @JsonProperty("projectCode")
    private String projectCode;

    @JsonProperty("manager")
    private User manager;

}
