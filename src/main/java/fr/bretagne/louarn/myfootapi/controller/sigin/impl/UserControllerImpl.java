package fr.bretagne.louarn.myfootapi.controller.sigin.impl;

import fr.bretagne.louarn.myfootapi.controller.sigin.IUserController;
import fr.bretagne.louarn.myfootapi.dto.sigin.request.SiginRequest;
import fr.bretagne.louarn.myfootapi.service.sigin.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/sigin")
public class UserControllerImpl implements IUserController {

    private IUserService userService;

    @Autowired

    public UserControllerImpl(IUserService userService) {
        this.userService = userService;
    }

    @Override
    @PostMapping
    public ResponseEntity<Void> sigin(@RequestBody SiginRequest request) {
        userService.sigin(request);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
