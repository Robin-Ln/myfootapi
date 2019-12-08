package fr.bretagne.louarn.myfootapi.dto.security.request;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
@Builder
public class AuthenticationRequest implements Serializable {
    private String username;
    private String password;
}
