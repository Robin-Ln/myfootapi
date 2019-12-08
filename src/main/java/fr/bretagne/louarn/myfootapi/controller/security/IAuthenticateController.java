package fr.bretagne.louarn.myfootapi.controller.security;

import fr.bretagne.louarn.myfootapi.dto.security.request.AuthenticationRequest;
import fr.bretagne.louarn.myfootapi.dto.security.responce.AuthenticationResponse;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.http.ResponseEntity;

@Api("Controller d'authentification")
public interface IAuthenticateController {

    @ApiOperation(value = "tokken")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "tokken")
    })
    ResponseEntity<AuthenticationResponse> createAuthenticationToken(AuthenticationRequest request);
}
