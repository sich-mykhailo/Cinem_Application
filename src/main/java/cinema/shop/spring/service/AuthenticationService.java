package cinema.shop.spring.service;

import cinema.shop.spring.model.User;

public interface AuthenticationService {
    User register(String email, String password);
}
