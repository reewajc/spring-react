package com.rotech.springreact.domain;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Movie {
    @Id
    private int id;
    private String movieName;
    private String releaseYear;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMovieName() {
        return movieName;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }

    public String getReleaseYear() {
        return releaseYear;
    }

    public void setReleaseYear(String releaseYear) {
        this.releaseYear = releaseYear;
    }

    /**
     * {@code Movie} builder static inner class.
     */
    public static final class Builder {
        private int id;
        private String movieName;
        private String releaseYear;


        /**
         * Sets the {@code id} and returns a reference to this Builder enabling method chaining.
         *
         * @param id the {@code id} to set
         * @return a reference to this Builder
         */
        public Builder withId(int id) {
            this.id = id;
            return this;
        }

        /**
         * Sets the {@code movieName} and returns a reference to this Builder enabling method chaining.
         *
         * @param movieName the {@code movieName} to set
         * @return a reference to this Builder
         */
        public Builder withMovieName(String movieName) {
            this.movieName = movieName;
            return this;
        }

        /**
         * Sets the {@code releaseYear} and returns a reference to this Builder enabling method chaining.
         *
         * @param releaseYear the {@code releaseYear} to set
         * @return a reference to this Builder
         */
        public Builder withReleaseYear(String releaseYear) {
            this.releaseYear = releaseYear;
            return this;
        }

        /**
         * Returns a {@code Movie} built from the parameters previously set.
         *
         * @return a {@code Movie} built with parameters of this {@code Movie.Builder}
         */
        public Movie build() {
            Movie movie = new Movie();
            movie.setMovieName(movieName);
            movie.setId(id);
            movie.setReleaseYear(releaseYear);
            return movie;
        }
    }
}
