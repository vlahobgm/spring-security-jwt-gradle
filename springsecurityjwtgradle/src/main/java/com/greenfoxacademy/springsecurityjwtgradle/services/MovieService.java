package com.greenfoxacademy.springsecurityjwtgradle.services;

import com.greenfoxacademy.springsecurityjwtgradle.models.Movie;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public interface MovieService {
  void saveMovies(List<Movie> movies);
}
