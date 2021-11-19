package cinema.shop.spring.dao.impl;

import cinema.shop.spring.dao.AbstractDao;
import cinema.shop.spring.dao.TicketDao;
import cinema.shop.spring.model.Ticket;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

@Repository
public class TicketDaoImpl extends AbstractDao<Ticket> implements TicketDao {
    public TicketDaoImpl(SessionFactory factory) {
        super(factory, Ticket.class);
    }
}
