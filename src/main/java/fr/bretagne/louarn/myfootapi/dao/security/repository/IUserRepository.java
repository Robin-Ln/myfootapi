package fr.bretagne.louarn.myfootapi.dao.security.repository;

import fr.bretagne.louarn.myfootapi.modele.security.MyUser;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface IUserRepository extends JpaRepository<MyUser, Integer> {

    Optional<MyUser> findUserByUsername(String username);

    boolean existsByUsername(String username);

}
