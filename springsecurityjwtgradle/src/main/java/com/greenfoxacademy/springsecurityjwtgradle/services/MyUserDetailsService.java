package com.greenfoxacademy.springsecurityjwtgradle.services;

import com.greenfoxacademy.springsecurityjwtgradle.models.dao.Users;
import com.greenfoxacademy.springsecurityjwtgradle.repositories.UsersRepository;
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
  private UsersRepository usersRepository;

  @Override
  public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
    //return new User("foo", "foo", new ArrayList<>());
    Users user = usersRepository.findByUsername(username);
    if (user == null) {
      throw new UsernameNotFoundException(username);
    }
    return new User(user.getUsername(), user.getPassword(), Collections.emptyList());
  }
}
