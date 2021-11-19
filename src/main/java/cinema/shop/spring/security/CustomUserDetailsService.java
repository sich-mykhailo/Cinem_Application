package cinema.shop.spring.security;

import cinema.shop.spring.model.Role;
import cinema.shop.spring.model.User;
import cinema.shop.spring.service.UserService;
import org.springframework.security.core.userdetails.User.UserBuilder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class CustomUserDetailsService implements UserDetailsService {
    private final UserService userService;

    public CustomUserDetailsService(UserService userService) {
        this.userService = userService;
    }

    @Override
    public UserDetails loadUserByUsername(String userName) throws UsernameNotFoundException {
        User user = userService.findByEmail(userName).orElseThrow(() ->
                new UsernameNotFoundException("User not found: " + userName));
        UserBuilder builder = org.springframework.security.core.userdetails.User
                .withUsername(userName);
        builder.password(user.getPassword());
        builder.authorities(user.getRoles()
                .stream()
                .map(Role::getRoleName)
                .toArray(String[]::new));
        return builder.build();
    }
}
