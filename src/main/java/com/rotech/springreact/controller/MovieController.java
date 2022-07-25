package com.rotech.springreact.controller;

import com.rotech.springreact.domain.Movie;
import com.rotech.springreact.service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class MovieController {

    @Autowired
    MovieService movieService;

    @GetMapping("/movies")
    public List<Movie> getAll(){
       return movieService.getAll();
    }
}
