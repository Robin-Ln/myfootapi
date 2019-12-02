package fr.bretagne.louarn.myfootapi.service.security;

import fr.bretagne.louarn.myfootapi.dto.security.request.AuthenticationRequest;
import fr.bretagne.louarn.myfootapi.dto.security.responce.AuthenticationResponse;

public interface IAuthenticateService {

    AuthenticationResponse createAuthenticationToken(AuthenticationRequest request);

}
