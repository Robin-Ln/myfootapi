package fr.bretagne.louarn.myfootapi.service.security.impl;

import fr.bretagne.louarn.myfootapi.dao.security.repository.IUserRepository;
import fr.bretagne.louarn.myfootapi.modele.security.MyUser;
import fr.bretagne.louarn.myfootapi.service.security.IUserDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class UserDetailsServiceImpl implements IUserDetailsService {

    private IUserRepository userRepository;

    @Autowired
    public UserDetailsServiceImpl(IUserRepository userRepository,
                                  PasswordEncoder passwordEncoder) {
        this.userRepository = userRepository;
    }

    @Override
    public UserDetails loadUserByUsername(String username) {

        MyUser myUser = userRepository.findUserByUsername(username)
                .orElseThrow(() -> {
                    String message = String.format("L'utilisateur %s n'existe pas", username);
                    return new UsernameNotFoundException(message);
                });
        return User.builder()
                .username(myUser.getUsername())
                .password(myUser.getPassword())
                .authorities(new ArrayList<>())
                .build();
    }

}
