package com.my.over.service.issue;

import com.my.over.entity.issue.IssueEntity;
import com.my.over.model.others.FindAllAttributesObject;
import com.my.over.repository.issue.IssueEntityRepository;
import com.my.over.rest.issue.IssueController;
import com.my.over.util.Constants;
import com.my.over.util.RequestUtil;
import com.my.over.validation.issue.ValidationIssue;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.repository.support.PageableExecutionUtils;
import org.springframework.stereotype.Service;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;
import org.springframework.web.util.UriComponents;

import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.util.*;

@Service
public class IssueService {

//    @Autowired
//    IssueEntityRepository issueEntityRepository;
//
//    @Autowired
//    MongoOperations mongoOperations;
//
//    public Page<IssueEntity> findAll(Integer offset, Integer limit, String sortProperty, Optional<String> fields, HttpServletRequest request) throws Exception{
//
//        FindAllAttributesObject validatedParams = ValidationIssue.validateFindAll(offset, limit, sortProperty, fields);
//
//        PageRequest pageRequest = PageRequest.of(validatedParams.getOffset(), validatedParams.getLimit());
//        UriComponents uriComp = ServletUriComponentsBuilder.fromRequest(request).build();
//
//        Query query = RequestUtil.generateQuery(IssueEntity.class, uriComp.getQueryParams(), pageRequest, validatedParams.getSortProperty());
//        List<IssueEntity> documentList = mongoOperations.find(query, IssueEntity.class);
//
//        return PageableExecutionUtils.getPage(documentList, pageRequest, () -> mongoOperations.count(query, IssueEntity.class));
//    }
//
//    public IssueEntity findById(String id) throws Exception {
//
//        Query query = RequestUtil.generateQuery(IssueEntity.class, null, null, null);
//        query.addCriteria(Criteria.where(Constants.ID).is(id));
//
//        return mongoOperations.findOne(query, IssueEntity.class);
//    }
//
//    public IssueEntity create(IssueEntity entity) {
//        try {
//            ValidationIssue.validateCreate(entity);
//
//        } catch (IOException e) {
//            logger.error(e.getMessage());
//        }
//
//        IssueEntity savedDocument = issueEntityRepository.save(entity);
//        savedDocument.setHref(hrefUtil.getServiceHrefRoot(IssueController.class) + "/" + savedDocument.getId());
//
//        return issueEntityRepository.save(savedDocument);
//    }
//
//    public void deleteById(String id) {
//        issueEntityRepository.deleteById(id);
//    }
//
//    public IssueEntity update(IssueEntity entity) throws Exception {
//        ValidationIssue.validatePut(entity);
//        IssueEntity existingEntity = findById(entity.getId());
//
//        return issueEntityRepository.save(entity);
//    }
//

}