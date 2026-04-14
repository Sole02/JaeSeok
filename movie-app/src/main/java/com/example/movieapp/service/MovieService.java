package com.example.movieapp.service;

import com.example.movieapp.dto.*;
import com.example.movieapp.entity.Movie;
import com.example.movieapp.repository.MovieRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class MovieService {

    private final MovieRepository movieRepository;

    @Transactional
    public CreateMovieResponse save(CreateMovieRequest request) {
        Movie movie = new Movie(request.getTitle());
        Movie savedMovie = movieRepository.save(movie);
        return new CreateMovieResponse(savedMovie.getId(), savedMovie.getTitle(), savedMovie.getCreatedAt(), savedMovie.getModifiedAt());
    }

    @Transactional(readOnly = true)
    public GetMovieResponse findOne(Long movieId) {
        Movie movie = movieRepository.findById(movieId).orElseThrow(
                () -> new IllegalStateException("존재하지 않는 영화입니다.")
        );
        return new GetMovieResponse(movie.getId(), movie.getTitle(), movie.getCreatedAt(), movie.getModifiedAt());
    }

    @Transactional(readOnly = true)
    public List<GetMovieResponse> findAll() {
        List<Movie> movies = movieRepository.findAll();

        List<GetMovieResponse> dtos = new ArrayList<>();
        for (Movie movie : movies) {
            GetMovieResponse dto = new GetMovieResponse(movie.getId(), movie.getTitle(), movie.getCreatedAt(), movie.getModifiedAt());
            dtos.add(dto);
        }
        return dtos;
    }

    @Transactional
    public UpdateMovieResponse updateTitle(Long movieId, UpdateMovieRequest request) {
        Movie movie = movieRepository.findById(movieId).orElseThrow(
                () -> new IllegalMonitorStateException("존재하지 않는 영화입니다.")
        );
        movie.updateTitle(request.getTitle());
        return new UpdateMovieResponse(movie.getId());
    }

    @Transactional
    public void delete(Long movieId) {
        boolean exists = movieRepository.existsById(movieId);
        if (!exists) {
            throw new IllegalMonitorStateException("존재하지 않는 영화입니다.");
        }
        movieRepository.deleteById(movieId);
    }
}
