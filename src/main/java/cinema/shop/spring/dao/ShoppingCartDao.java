package cinema.shop.spring.dao;

import cinema.shop.spring.model.ShoppingCart;
import cinema.shop.spring.model.User;

public interface ShoppingCartDao {
    ShoppingCart add(ShoppingCart shoppingCart);

    ShoppingCart getByUser(User user);

    ShoppingCart update(ShoppingCart shoppingCart);
}
