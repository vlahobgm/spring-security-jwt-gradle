package com.greenfoxacademy.springsecurityjwtgradle.repositories;

import com.greenfoxacademy.springsecurityjwtgradle.models.AuthenticationRequest;
import org.springframework.data.repository.CrudRepository;
import org.springframework.security.core.userdetails.User;
import org.springframework.stereotype.Repository;

@Repository
public interface AuthenticationRequestRepository extends CrudRepository<AuthenticationRequest,
    Long> {

  AuthenticationRequest findByUsername(String userName);
}
