package fr.bretagne.louarn.myfootapi.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.http.ResponseEntity;

@Api("Test Controller")
public interface ITestController {

    @ApiOperation(value = "Test")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Informations de retour en cas de succès")
    })
    ResponseEntity<String> test();

}
