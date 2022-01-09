package movieBookingPortal.controller;

import movieBookingPortal.model.Movie;
import movieBookingPortal.repository.MovieRepository;
import movieBookingPortal.service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/api/movie")
public class MovieController {
    @Autowired
    private MovieService movieService;

    @GetMapping(path = "/allMovies")
    public ResponseEntity<List<Movie>> getAllMovie(){
        List<Movie> movies=movieService.getAllMovie();
        return new ResponseEntity<> (movies, HttpStatus.OK);
    }

    @GetMapping(path = "/find/{id}")
    public ResponseEntity<Movie> findMovieById(@PathVariable("id") Long id){
        Movie movie=movieService.findMovieById(id);
        return new ResponseEntity<>(movie,HttpStatus.OK);
    }



}
