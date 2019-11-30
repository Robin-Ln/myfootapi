package fr.bretagne.louarn.myfootapi.service.security.impl;

import fr.bretagne.louarn.myfootapi.service.security.IUserDetailsService;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.crypto.factory.PasswordEncoderFactories;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class UserDetailsServiceImpl implements IUserDetailsService {


    @Override
    public UserDetails loadUserByUsername(String username) {
        PasswordEncoder passwordEncoder = PasswordEncoderFactories.createDelegatingPasswordEncoder();
        return new User("test", passwordEncoder.encode("test"), new ArrayList<>());
    }

}
