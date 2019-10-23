package com.my.over.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public abstract class AbstractEntity implements Serializable {

    private static final long serialVersionUID = 1L;

    @JsonProperty("createdAt")
    private Date createdAt;

    @JsonProperty("createdBy")
    private String createdBy;

    @JsonProperty("updatedAt")
    private Date updatedAt;

    @JsonProperty("updatedBy")
    private String updatedBy;

    @JsonProperty("status")
    Boolean status;

}
