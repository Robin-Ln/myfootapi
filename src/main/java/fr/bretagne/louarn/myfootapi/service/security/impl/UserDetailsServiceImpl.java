package fr.bretagne.louarn.myfootapi.service.security.impl;

import fr.bretagne.louarn.myfootapi.dto.request.AuthenticationRequest;
import fr.bretagne.louarn.myfootapi.dto.responce.AuthenticationResponse;
import fr.bretagne.louarn.myfootapi.service.security.IJwtservice;
import fr.bretagne.louarn.myfootapi.service.security.IUserDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class UserDetailsServiceImpl implements IUserDetailsService {


    @Override
    public UserDetails loadUserByUsername(String username) {
        return new User("test", "test", new ArrayList<>());
    }

}
