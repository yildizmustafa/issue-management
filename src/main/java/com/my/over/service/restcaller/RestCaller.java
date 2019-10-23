package com.my.over.service.restcaller;


import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.my.over.exception.PortalException;
import com.my.over.model.others.ValidationParam;
import com.my.over.types.GeneralExceptionType;
import com.my.over.util.HashMapUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.*;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class RestCaller {
    private static final Logger LOGGER = LoggerFactory.getLogger(RestCaller.class);

    public RestCaller() {
    }

    public JsonNode makeExternalCall(String href, HttpMethod method, Object request) throws Exception {
        RestTemplate restTemplate = new RestTemplate();
        ObjectMapper mapper = new ObjectMapper();
        ResponseEntity<String> response = null;
        JsonNode node = null;
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);
        HttpEntity entity = new HttpEntity(request.toString(), headers);

        try {
            response = restTemplate.exchange(href, method, entity, String.class, new Object[0]);
        } catch (Exception var11) {
            LOGGER.error("RestTemplate Call Error: ", var11);
            throw new PortalException(GeneralExceptionType.COULD_NOT_MAKE_EXTERNAL_CALL_FOR_HREF, HashMapUtils.newMapOf("link", href), var11);
        }

        if (response.getBody() == null) {
            Map<String, Object> exceptionParams = new HashMap();
            exceptionParams.put("link", href);
            throw new PortalException(GeneralExceptionType.REST_CALL_BODY_NULL, exceptionParams);
        } else {
            node = mapper.readTree((String)response.getBody());
            return node;
        }
    }

    public void makeExternalCallValidation(String href, List<ValidationParam> invalidParams) throws Exception {
        RestTemplate restTemplate = new RestTemplate();
        ResponseEntity<String> response = null;
        boolean validUrl = true;

        try {
            response = restTemplate.getForEntity(href, String.class, new Object[0]);
        } catch (Exception var7) {
            invalidParams.add(new ValidationParam("href", href, GeneralExceptionType.COULD_NOT_MAKE_EXTERNAL_CALL_FOR_HREF, var7.getMessage()));
            validUrl = false;
            LOGGER.error("RestTemplate Call Error: ", var7);
        }

        if (validUrl && (response == null || response.getBody() == null)) {
            invalidParams.add(new ValidationParam("href", href, GeneralExceptionType.DATA_INCONSISTENCY_ITEM_HREF_DOES_NOT_EXIST));
        }

    }
}