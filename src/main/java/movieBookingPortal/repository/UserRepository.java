package movieBookingPortal.repository;

import movieBookingPortal.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;

public interface UserRepository extends JpaRepository<User, Long> {

    User findUserById(Long id);

    User findByEmailLikeIgnoreCase(String email);

    boolean existsByEmailIgnoreCaseAllIgnoreCase(String email);



}
