package ma.simo.jpasimo.repositories;

import ma.simo.jpasimo.entities.Role;
import ma.simo.jpasimo.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepository extends JpaRepository<Role,Long > {
    Role finByRolename(String roleName);
}
