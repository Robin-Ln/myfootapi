package fr.bretagne.louarn.myfootapi.service.security.impl;

import fr.bretagne.louarn.myfootapi.dto.request.AuthenticationRequest;
import fr.bretagne.louarn.myfootapi.dto.responce.AuthenticationResponse;
import fr.bretagne.louarn.myfootapi.service.security.IAuthenticateService;
import fr.bretagne.louarn.myfootapi.service.security.IJwtservice;
import fr.bretagne.louarn.myfootapi.service.security.IUserDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Service;

@Service
public class AuthenticateServiceImpl implements IAuthenticateService {

    private AuthenticationManager authenticationManager;

    private IJwtservice jwtService;

    private IUserDetailsService userDetailsService;

    @Autowired
    public AuthenticateServiceImpl(AuthenticationManager authenticationManager,
                                   IJwtservice jwtService,
                                   IUserDetailsService userDetailsService) {
        this.authenticationManager = authenticationManager;
        this.jwtService = jwtService;
        this.userDetailsService = userDetailsService;
    }

    @Override
    public AuthenticationResponse createAuthenticationToken(AuthenticationRequest request) {
        try {
            authenticationManager.authenticate(
                    new UsernamePasswordAuthenticationToken(request.getUsername(), request.getPassword())
            );
        } catch (BadCredentialsException e) {
            throw new SecurityException("Incorrect username or password", e);
        }

        UserDetails userDetails = userDetailsService.loadUserByUsername(request.getUsername());

        String jwt = jwtService.generateToken(userDetails);

        return AuthenticationResponse
                .builder()
                .jwt(jwt)
                .build();
    }

}
