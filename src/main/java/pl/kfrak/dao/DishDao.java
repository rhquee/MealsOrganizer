package pl.kfrak.dao;

import org.hibernate.Session;
import org.hibernate.Transaction;

import pl.kfrak.HibernateUtil;
import pl.kfrak.domain.Dish;

import java.util.Optional;

public class DishDao implements Dao<Dish> {

    @Override
    public Optional<Dish> get(Integer id) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();

        Dish result = session.get(Dish.class, id);

        transaction.commit();
        session.close();
        return Optional.ofNullable(result);
    }

    @Override
    public String getAll() {
        //
        return null;
    }


    @Override
    public void insert(Dish dish) {
        //
    }

    @Override
    public void delete(int id) {
        //
    }

}
