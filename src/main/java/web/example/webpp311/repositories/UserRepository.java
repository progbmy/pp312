package web.example.webpp311.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import web.example.webpp311.model.User;


@Repository
public interface UserRepository extends JpaRepository<User, Long> {

    User findByUsername(String username);

}
