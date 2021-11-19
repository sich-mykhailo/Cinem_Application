package cinema.shop.spring.dao.impl;

import cinema.shop.spring.dao.AbstractDao;
import cinema.shop.spring.dao.CinemaHallDao;
import cinema.shop.spring.model.CinemaHall;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

@Repository
public class CinemaHallDaoImpl extends AbstractDao<CinemaHall> implements CinemaHallDao {
    public CinemaHallDaoImpl(SessionFactory factory) {
        super(factory, CinemaHall.class);
    }
}
