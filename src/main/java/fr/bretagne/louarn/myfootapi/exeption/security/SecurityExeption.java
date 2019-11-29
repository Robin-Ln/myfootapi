package fr.bretagne.louarn.myfootapi.exeption.security;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import org.springframework.security.authentication.BadCredentialsException;

@Getter
@Setter
@AllArgsConstructor
public class SecurityExeption extends RuntimeException {

}
