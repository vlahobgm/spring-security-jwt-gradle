package com.greenfoxacademy.springsecurityjwtgradle.repositories;

import com.greenfoxacademy.springsecurityjwtgradle.models.dao.Users;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsersRepository extends CrudRepository<Users,
    Long> {

  Users findByUsername(String userName);
}
