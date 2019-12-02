package fr.bretagne.louarn.myfootapi.dto.sigin.request;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class SiginRequest {
    private String username;
    private String password;
}
