package ma.simo.jpasimo.service;

import ma.simo.jpasimo.entities.Role;
import ma.simo.jpasimo.entities.User;

public interface UserService {
    User addNewUser(User user);
    Role addNewRole(Role role);
    User findUserByUserName(String userName);
    Role findRoleByRoleName(String roleName);
    void addRoleToUser(String username, String roleName);
}
