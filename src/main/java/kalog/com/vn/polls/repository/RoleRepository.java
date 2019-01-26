package kalog.com.vn.polls.repository;

import kalog.com.vn.polls.models.Role;
import kalog.com.vn.polls.models.RoleName;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;
@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {

    Optional<Role> findByName(RoleName roleName);
}
