package fr.bretagne.louarn.myfootapi.controller.impl;

import fr.bretagne.louarn.myfootapi.controller.ITestController;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/test")
public class TestControllerImpl implements ITestController {

    @GetMapping
    @Override
    public ResponseEntity<String> test() {
        return new ResponseEntity<>("test", HttpStatus.OK);
    }
}
