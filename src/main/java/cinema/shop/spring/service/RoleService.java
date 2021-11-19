package cinema.shop.spring.service;

import cinema.shop.spring.model.Role;

public interface RoleService {
    void add(Role role);

    Role getRoleByName(String roleName);
}
