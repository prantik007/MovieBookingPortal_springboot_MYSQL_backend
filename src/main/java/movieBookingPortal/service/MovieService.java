package movieBookingPortal.service;

import movieBookingPortal.model.Movie;
import movieBookingPortal.repository.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Service
public class MovieService {

    @Autowired
    private MovieRepository movieRepository;

    @PostMapping(path = "/addMovie")
    public @ResponseBody
    String addNewMovie(@RequestParam String movieName, String movieCaption, int price){
        Movie mv=new Movie();
        mv.setMovieName(movieName);
        mv.setMovieCaption(movieCaption);
        mv.setPrice(price);

        movieRepository.save(mv);
        return "Saved Movie";
    }



    public List<Movie> getAllMovies(){
        return movieRepository.findAll();
    }
}
