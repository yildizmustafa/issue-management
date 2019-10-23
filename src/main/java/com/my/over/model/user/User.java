package com.my.over.model.user;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.my.over.model.AbstractEntity;
import com.my.over.model.issue.Issue;
import lombok.Data;
import org.springframework.data.annotation.Id;

import javax.validation.Valid;
import java.io.Serializable;
import java.util.List;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class User extends AbstractEntity implements Serializable {

    @Id
    @JsonProperty("id")
    private Long id;

    @JsonProperty("username")
    private String username;

    @JsonProperty("password")
    private String password;

    @JsonProperty("nameSurname")
    private String nameSurname;

    @JsonProperty("email")
    private String email;

    @JsonProperty("issues")
    @Valid
    private List<Issue> issues;

}
