package hiber.dao.CarDao;

import hiber.model.Car;
import hiber.model.User;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.TypedQuery;
import java.util.List;

@Repository
public class CarDaoImp implements CarDao {
    private final SessionFactory sessionFactory;

    @Autowired
    public CarDaoImp(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    @Override
    public void add(Car car) {
        sessionFactory.getCurrentSession().save(car);
    }

    @Override
    @SuppressWarnings("unchecked")
    public List<Car> getListCars() {
        TypedQuery<Car> query = sessionFactory.getCurrentSession().createQuery("from Car");
        return query.getResultList();
    }

    @Override
    @SuppressWarnings("uncheked")
    public User getUserByModelAndSeries(String model, int series) {
        String hql_request = "SELECT c.user FROM Car c WHERE c.model = :model AND c.series = :series";

        return (User) sessionFactory.getCurrentSession().createQuery(hql_request)
                .setParameter("model", model)
                .setParameter("series", series)
                .uniqueResult();
    }
}
