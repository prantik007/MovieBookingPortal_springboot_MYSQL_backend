package movieBookingPortal.repository;

import movieBookingPortal.model.Movie;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface MovieRepository extends JpaRepository<Movie, Long> {
    Movie findMovieById(Long id);
}
