package com.greenfoxacademy.springsecurityjwtgradle.services;

import com.greenfoxacademy.springsecurityjwtgradle.models.Movie;
import com.greenfoxacademy.springsecurityjwtgradle.repositories.MovieRepository;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MovieServiceImpl implements MovieService{

  private MovieRepository movieRepository;

  @Autowired
  public MovieServiceImpl(MovieRepository movieRepository) {
    this.movieRepository = movieRepository;
  }

  @Override
  public void saveMovies(List<Movie> movies) {
    List<Movie> movieList = new ArrayList<>();
    for (int i = 0; i < movies.size(); i++) {
      movieList.add(movies.get(i));
    }
    for (int i = 0; i < movieList.size(); i++) {
      //movieRepository.save(movieList.get(i));
    }
  }
}
