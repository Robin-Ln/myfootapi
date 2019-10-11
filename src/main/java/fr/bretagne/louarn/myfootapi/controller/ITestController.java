package fr.bretagne.louarn.myfootapi.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.http.ResponseEntity;

@Api(value = "Test Contreoller", produces = "application/json")
public interface ITestController {

    @ApiOperation(value = "View a list of available employees", response = String.class)
    @ApiResponses({
            @ApiResponse(code = 200, message = "test", response = String.class)
    })
    ResponseEntity<String> test();

}
