package cinema.shop.spring.dao;

import cinema.shop.spring.model.Role;
import java.util.Optional;

public interface RoleDao {
    Role add(Role role);

    Optional<Role> getRoleByName(String roleName);
}
