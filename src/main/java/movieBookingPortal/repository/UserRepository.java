package movieBookingPortal.repository;

import movieBookingPortal.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

    User findUserById(Long id);

    User findByEmailLikeIgnoreCase(String email);

    boolean existsByEmailIgnoreCaseAllIgnoreCase(String email);



}
