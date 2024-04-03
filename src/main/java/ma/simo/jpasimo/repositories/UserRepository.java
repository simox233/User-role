package ma.simo.jpasimo.repositories;

import ma.simo.jpasimo.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,String > {
    User finByUsername(String userName);
}
