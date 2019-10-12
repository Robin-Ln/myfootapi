package fr.bretagne.louarn.myfootapi.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.http.ResponseEntity;

import static fr.bretagne.louarn.myfootapi.constant.AppConstant.REST_PRODUCE_JSON;

@Api("Test Contreoller")
public interface ITestController {

    @ApiOperation(value = "Test", response = String.class, produces = REST_PRODUCE_JSON)
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Informations de retour en cas de succès"),
            @ApiResponse(code = 400, message = "En cas d'erreur fonctionnelle"),
            @ApiResponse(code = 500, message = "Erreur interne")
    })
    ResponseEntity<String> test();

}
