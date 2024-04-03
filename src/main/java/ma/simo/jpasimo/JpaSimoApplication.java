package ma.simo.jpasimo;

import ma.simo.jpasimo.entities.Role;
import ma.simo.jpasimo.entities.User;
import ma.simo.jpasimo.service.UserService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.stream.Stream;

@SpringBootApplication
public class JpaSimoApplication {

    public static void main(String[] args) {
        SpringApplication.run(JpaSimoApplication.class, args);
    }
    @Bean
CommandLineRunner start(UserService userService){
        return args -> {
            User u=new User();
            u.setUsername("USER1");
            u.setPassword("123456");
            userService.addNewUser(u);

            User u2=new User();
            u.setUsername("USER2");
            u.setPassword("123456789");
            userService.addNewUser(u2);

            Stream.of("STUDENT","USER","ADMIN").forEach(r->{
                Role role1=new Role();
                role1.setRoleName(r);
                userService.addNewRole(role1);
            });

            userService.addRoleToUser("user1","STUDENT");
            userService.addRoleToUser("user1","USER");
            userService.addRoleToUser("admin","USERT");
            userService.addRoleToUser("admin","ADMIN");


        };
}
}
