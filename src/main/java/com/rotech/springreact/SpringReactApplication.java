package com.rotech.springreact;

import com.rotech.springreact.domain.Movie;
import com.rotech.springreact.repository.MovieRepository;
import com.rotech.springreact.service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.Arrays;

@SpringBootApplication
public class SpringReactApplication implements CommandLineRunner {

    public static void main(String[] args){
        SpringApplication.run(SpringReactApplication.class, args);
    }

     @Autowired
     MovieRepository movieRepository;

    @Override
    public void run(String... args) throws Exception {
        movieRepository.saveAll(
                Arrays.asList(
                        new Movie.Builder().withId(1).withMovieName("Solary").withReleaseYear("2020").build(),
                        new Movie.Builder().withId(2).withMovieName("Holay").withReleaseYear("2021").build(),
                        new Movie.Builder().withId(3).withMovieName("Polay").withReleaseYear("2022").build(),
                        new Movie.Builder().withId(4).withMovieName("Molay").withReleaseYear("2023").build(),
                        new Movie.Builder().withId(5).withMovieName("Kholay").withReleaseYear("2024").build(),
                        new Movie.Builder().withId(6).withMovieName("Dholay").withReleaseYear("2025").build()


                ));
    }
}
