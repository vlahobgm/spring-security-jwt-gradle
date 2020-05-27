package com.greenfoxacademy.springsecurityjwtgradle.services;

import com.greenfoxacademy.springsecurityjwtgradle.models.MovieResults;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface ApiInterface {
  @GET("/3/movie/popular")
  Call<MovieResults> getPopularMovies(
      @Query("api_key") String apiKey,
      @Query("language") String language,
      @Query("page") int page
  );
}
