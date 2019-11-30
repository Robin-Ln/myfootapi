package fr.bretagne.louarn.myfootapi.service.security;

import fr.bretagne.louarn.myfootapi.dto.request.AuthenticationRequest;
import fr.bretagne.louarn.myfootapi.dto.responce.AuthenticationResponse;

public interface IAuthenticateService {

    AuthenticationResponse createAuthenticationToken(AuthenticationRequest request);

}
