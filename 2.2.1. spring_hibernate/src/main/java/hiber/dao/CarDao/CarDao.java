package hiber.dao.CarDao;

import hiber.model.Car;
import hiber.model.User;

import java.util.List;

public interface CarDao {
    void add(Car car);

    List<Car> getListCars();

    User getUserByModelAndSeries(String model, int series);
}
