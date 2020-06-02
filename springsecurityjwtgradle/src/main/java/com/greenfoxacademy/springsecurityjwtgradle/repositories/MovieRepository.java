package com.greenfoxacademy.springsecurityjwtgradle.repositories;

import com.greenfoxacademy.springsecurityjwtgradle.models.dao.MovieDAO;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MovieRepository extends CrudRepository<MovieDAO, Long> {

}
