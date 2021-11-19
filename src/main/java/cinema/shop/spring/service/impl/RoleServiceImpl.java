package cinema.shop.spring.service.impl;

import cinema.shop.spring.dao.RoleDao;
import cinema.shop.spring.model.Role;
import cinema.shop.spring.service.RoleService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class RoleServiceImpl implements RoleService {
    private final RoleDao roleDao;

    public RoleServiceImpl(RoleDao roleDao) {
        this.roleDao = roleDao;
    }

    @Override
    public void add(Role role) {
        roleDao.add(role);
    }

    @Override
    public Role getRoleByName(String roleName) {
        return roleDao.getRoleByName(roleName).orElseThrow(() ->
                new UsernameNotFoundException("Can't find role by: " + roleName));
    }
}
