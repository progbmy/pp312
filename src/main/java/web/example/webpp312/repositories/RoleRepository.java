package web.example.webpp312.repositories;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import web.example.webpp312.model.Role;


@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {
}
