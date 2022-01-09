package movieBookingPortal.repository;

import movieBookingPortal.model.movie;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MovieRepository extends JpaRepository<movie, Long> {
}
