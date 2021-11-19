package cinema.shop.spring.dao;

import cinema.shop.spring.model.Order;
import cinema.shop.spring.model.User;
import java.util.List;

public interface OrderDao {
    Order add(Order order);

    List<Order> getOrdersHistory(User user);
}
