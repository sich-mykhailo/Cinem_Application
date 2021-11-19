package cinema.shop.spring.dao.impl;

import cinema.shop.spring.dao.AbstractDao;
import cinema.shop.spring.dao.MovieDao;
import cinema.shop.spring.model.Movie;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

@Repository
public class MovieDaoImpl extends AbstractDao<Movie> implements MovieDao {
    public MovieDaoImpl(SessionFactory factory) {
        super(factory, Movie.class);
    }
}
