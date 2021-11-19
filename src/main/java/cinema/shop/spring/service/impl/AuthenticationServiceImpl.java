package cinema.shop.spring.service.impl;

import cinema.shop.spring.model.Role;
import cinema.shop.spring.model.User;
import cinema.shop.spring.service.AuthenticationService;
import cinema.shop.spring.service.RoleService;
import cinema.shop.spring.service.ShoppingCartService;
import cinema.shop.spring.service.UserService;
import java.util.HashSet;
import java.util.Set;
import org.springframework.stereotype.Service;

@Service
public class AuthenticationServiceImpl implements AuthenticationService {
    private final UserService userService;
    private final ShoppingCartService shoppingCartService;
    private final RoleService roleService;

    public AuthenticationServiceImpl(UserService userService,
                                     ShoppingCartService shoppingCartService,
                                     RoleService roleService) {
        this.userService = userService;
        this.shoppingCartService = shoppingCartService;
        this.roleService = roleService;
    }

    @Override
    public User register(String email, String password) {
        User user = new User();
        user.setEmail(email);
        user.setPassword(password);
        user.setRoles(new HashSet<>());
        Role role = roleService.getRoleByName("USER");
        user.getRoles().add(role);
        userService.add(user);
        shoppingCartService.registerNewShoppingCart(user);
        return user;
    }
}
