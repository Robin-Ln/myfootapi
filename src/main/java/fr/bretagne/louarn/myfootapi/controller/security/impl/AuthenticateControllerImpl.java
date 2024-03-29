package fr.bretagne.louarn.myfootapi.controller.security.impl;

import fr.bretagne.louarn.myfootapi.controller.security.IAuthenticateController;
import fr.bretagne.louarn.myfootapi.dto.security.request.AuthenticationRequest;
import fr.bretagne.louarn.myfootapi.dto.security.responce.AuthenticationResponse;
import fr.bretagne.louarn.myfootapi.service.security.IAuthenticateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/security")
public class AuthenticateControllerImpl implements IAuthenticateController {

    private IAuthenticateService authenticateService;

    @Autowired
    public AuthenticateControllerImpl(IAuthenticateService authenticateService) {
        this.authenticateService = authenticateService;
    }

    @Override
    @PostMapping(value = "/authenticate")
    public ResponseEntity<AuthenticationResponse> createAuthenticationToken(@RequestBody AuthenticationRequest request) {

        AuthenticationResponse response = authenticateService.createAuthenticationToken(request);

        return ResponseEntity.ok(response);
    }

}
