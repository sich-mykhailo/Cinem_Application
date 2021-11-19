package cinema.shop.spring.service;

import cinema.shop.spring.model.Order;
import cinema.shop.spring.model.ShoppingCart;
import cinema.shop.spring.model.User;
import java.util.List;

public interface OrderService {
    Order completeOrder(ShoppingCart shoppingCart);

    List<Order> getOrdersHistory(User user);
}
