package com.my.over.rest;

import com.my.over.model.EventSubscription;
import com.my.over.model.EventSubscriptionInput;
import com.wordnik.swagger.annotations.*;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.validation.Valid;
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-07-11T10:56:31.784+03:00")

@Api(value = "hub", description = "the hub API")
public interface HubApi {

    @ApiOperation(value = "Register a listener", notes = "Sets the communication endpoint address the service instance must use to deliver information about its health state, execution state, failures and metrics.", response = EventSubscription.class, tags={ "events subscription", })
    @ApiResponses(value = {
            @ApiResponse(code = 201, message = "Subscribed", response = EventSubscription.class),
            @ApiResponse(code = 400, message = "Bad Request", response = Error.class),
            @ApiResponse(code = 500, message = "Internal Server Error", response = Error.class) })

    @RequestMapping(value = "/hub",
            produces = { "application/json" },
            consumes = { "application/json" },
            method = RequestMethod.POST)
    ResponseEntity<EventSubscription> registerListener(@ApiParam(value = "Data containing the callback endpoint to deliver the information" ,required=true )  @Valid @RequestBody EventSubscriptionInput data);


    @ApiOperation(value = "Unregister a listener", notes = "Resets the communication endpoint address the service instance must use to deliver information about its health state, execution state, failures and metrics.", response = Void.class, tags={ "events subscription", })
    @ApiResponses(value = {
            @ApiResponse(code = 201, message = "Unsubscribed", response = Void.class),
            @ApiResponse(code = 404, message = "Not Found", response = Error.class),
            @ApiResponse(code = 500, message = "Internal Server Error", response = Error.class) })

    @RequestMapping(value = "/hub/{id}",
            produces = { "application/json" },
            consumes = { "application/json" },
            method = RequestMethod.DELETE)
    ResponseEntity<Void> unregisterListener(@ApiParam(value = "The id of the registered listener",required=true ) @PathVariable("id") String id);

}
