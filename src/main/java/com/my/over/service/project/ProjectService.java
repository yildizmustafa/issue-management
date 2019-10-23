package com.my.over.service.project;

import com.my.over.repository.project.ProjectEntityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProjectService {
    @Autowired
    ProjectEntityRepository projectEntityRepository;
}
