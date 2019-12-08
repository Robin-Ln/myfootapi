package fr.bretagne.louarn.myfootapi.service.sigin.impl;

import fr.bretagne.louarn.myfootapi.dao.security.repository.IUserRepository;
import fr.bretagne.louarn.myfootapi.dto.sigin.request.SiginRequest;
import fr.bretagne.louarn.myfootapi.exeption.sigin.SiginExecption;
import fr.bretagne.louarn.myfootapi.modele.security.MyUser;
import fr.bretagne.louarn.myfootapi.service.sigin.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements IUserService {

    private IUserRepository userRepository;
    private PasswordEncoder passwordEncoder;

    @Autowired
    public UserServiceImpl(IUserRepository userRepository, PasswordEncoder passwordEncoder) {
        this.userRepository = userRepository;
        this.passwordEncoder = passwordEncoder;
    }

    @Override
    public void sigin(SiginRequest request) {

        if (userRepository.existsByUsername(request.getUsername())){
            String message = String.format("L'utilisateur %s existe déjà", request.getUsername());
            throw new SiginExecption(message);
        }

        userRepository.save(MyUser.builder()
                .username(request.getUsername())
                .password(passwordEncoder.encode(request.getPassword()))
                .build());
    }
}
