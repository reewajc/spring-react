package com.rotech.springreact.service;

import com.rotech.springreact.domain.Movie;
import com.rotech.springreact.repository.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class MovieService {

    @Autowired
    MovieRepository movieRepository;

    public Movie getAllMovies(long id){
      return movieRepository.findById(id).orElse(null);
    }

    public List<Movie> getAll(){
      return   movieRepository.findAll();
    }

}
