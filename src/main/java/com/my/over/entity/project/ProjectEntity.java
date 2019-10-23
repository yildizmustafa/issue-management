package com.my.over.entity.project;

import com.my.over.model.project.Project;
import org.springframework.data.mongodb.core.mapping.Document;

import java.io.Serializable;

@Document("PROJECT")

public class ProjectEntity extends Project implements Serializable {
    private final static long serialVersionUID = 1L;
}
