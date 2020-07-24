package com.severocarlos.netflixremake.model;

import java.util.List;

public class MovieDetail {
    private final Movie movie;
    private final List<Movie> moviesSimilar;

    public MovieDetail(Movie movie, List<Movie> moviesSimilar){
        this.movie = movie;
        this.moviesSimilar = moviesSimilar;
    }

    public Movie getMovie() {
        return movie;
    }

    public List<Movie> getMoviesSimilar() {
        return moviesSimilar;
    }
}
