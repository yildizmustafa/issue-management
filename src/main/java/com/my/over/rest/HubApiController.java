package com.my.over.rest;

import com.my.over.model.EventSubscription;
import com.my.over.model.EventSubscriptionInput;
import com.wordnik.swagger.annotations.ApiParam;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import javax.validation.Valid;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-10-23T10:56:31.784+03:00")

@Controller
public class HubApiController implements HubApi {

    public ResponseEntity<EventSubscription> registerListener(@ApiParam(value = "Data containing the callback endpoint to deliver the information" ,required=true )  @Valid @RequestBody EventSubscriptionInput data) {
        // do some magic!
        return new ResponseEntity<EventSubscription>(HttpStatus.OK);
    }

    public ResponseEntity<Void> unregisterListener(@ApiParam(value = "The id of the registered listener",required=true ) @PathVariable("id") String id) {
        // do some magic!
        return new ResponseEntity<Void>(HttpStatus.OK);
    }

}
