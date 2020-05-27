package com.greenfoxacademy.springsecurityjwtgradle.services;

import com.greenfoxacademy.springsecurityjwtgradle.models.AuthenticationRequest;
import com.greenfoxacademy.springsecurityjwtgradle.repositories.AuthenticationRequestRepository;
import java.util.Collections;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class MyUserDetailsService implements UserDetailsService {

  @Autowired
  private AuthenticationRequestRepository authenticationRequestRepository;

  @Override
  public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
    //return new User("foo", "foo", new ArrayList<>());
    AuthenticationRequest user = authenticationRequestRepository.findByUsername(username);
    if (user == null) {
      throw new UsernameNotFoundException(username);
    }
    return new User(user.getUsername(), user.getPassword(), Collections.emptyList());
  }
}
