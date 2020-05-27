package com.greenfoxacademy.springsecurityjwtgradle.controllers;

import com.greenfoxacademy.springsecurityjwtgradle.models.MovieResults;
import com.greenfoxacademy.springsecurityjwtgradle.services.ApiInterface;
import java.io.IOException;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import retrofit2.Call;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

@RestController
public class MovieDatabseApiController {

  public static String BASE_URL = "https://api.themoviedb.org";
  private String API_KEY = "9e94e1edcba91f1fdd9b8ee36869a03b";
  private String LANGUAGE = "en-US";
  private int PAGE = 1;

  @GetMapping("/popularmovies")
  public ResponseEntity getPopularMovies() throws IOException {
    Retrofit retrofit = new Retrofit.Builder()
        .baseUrl(BASE_URL)
        .addConverterFactory(GsonConverterFactory.create())
        .build();
    ApiInterface apiInterface = retrofit.create(ApiInterface.class);
    Call<MovieResults> call = apiInterface.getPopularMovies(API_KEY, LANGUAGE, PAGE);
    Response<MovieResults> response = call.execute();
    return ResponseEntity.ok(response.body());
  }

  @GetMapping("/toprated")
  public ResponseEntity getTopRatedMovies() throws IOException {
    Retrofit retrofit = new Retrofit.Builder()
        .baseUrl(BASE_URL)
        .addConverterFactory(GsonConverterFactory.create())
        .build();
    ApiInterface apiInterface = retrofit.create(ApiInterface.class);
    Call<MovieResults> call = apiInterface.getTopRatedMovies(API_KEY, LANGUAGE, PAGE);
    Response<MovieResults> response = call.execute();
    return ResponseEntity.ok(response.body());
  }
}
