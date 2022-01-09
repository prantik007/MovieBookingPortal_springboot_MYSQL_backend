package movieBookingPortal.controller;

import movieBookingPortal.model.movie;
import movieBookingPortal.repository.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/api/movie")
public class MovieController {
    @Autowired
    private MovieRepository movieRepository;

    @PostMapping(path = "/addMovie")
    public @ResponseBody String addNewMovie(@RequestParam String movieName,String movieCaption,int price){
        movie mv=new movie();
        mv.setMovieName(movieName);
        mv.setMovieCaption(movieCaption);
        mv.setPrice(price);

        movieRepository.save(mv);
        return "Saved Movie";
    }

    @GetMapping(path = "/allMovies")
    public @ResponseBody Iterable<movie> getAllMovies(){
        return movieRepository.findAll();
    }

}
