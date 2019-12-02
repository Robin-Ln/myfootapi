package fr.bretagne.louarn.myfootapi.modele.security;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;

import static fr.bretagne.louarn.myfootapi.constant.AppConstant.SEQUENCE;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity(name = "user")
public class MyUser implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.TABLE, generator = SEQUENCE)
    private Integer id;

    private String username;

    private String password;
}
