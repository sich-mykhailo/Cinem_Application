package cinema.shop.spring.service;

import cinema.shop.spring.model.MovieSession;
import cinema.shop.spring.model.ShoppingCart;
import cinema.shop.spring.model.User;

public interface ShoppingCartService {
    void addSession(MovieSession movieSession, User user);

    ShoppingCart getByUser(User user);

    void registerNewShoppingCart(User user);

    void clear(ShoppingCart shoppingCart);
}
