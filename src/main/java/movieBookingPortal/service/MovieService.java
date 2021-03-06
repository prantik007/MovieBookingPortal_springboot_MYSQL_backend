package movieBookingPortal.service;

import movieBookingPortal.model.Movie;
import movieBookingPortal.repository.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MovieService {

    @Autowired
    private MovieRepository movieRepository;

    public List<Movie> getAllMovie() {
        return movieRepository.findAll();
    }

    public Movie findMovieById(Long id) {
        return movieRepository.findMovieById(id);
    }

    public Movie addMovie(Movie movie) {
        return movieRepository.save(movie);
    }
}
