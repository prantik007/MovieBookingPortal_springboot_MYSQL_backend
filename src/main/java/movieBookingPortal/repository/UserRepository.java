package movieBookingPortal.repository;

import movieBookingPortal.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User,Long> {

    User findUserById(Long id);
}
