package fr.bretagne.louarn.myfootapi.dto.responce;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
@AllArgsConstructor
@Builder
public class AuthenticationResponse implements Serializable {

    private String jwt;

}
