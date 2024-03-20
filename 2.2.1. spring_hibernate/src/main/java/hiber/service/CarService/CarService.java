package hiber.service.CarService;

import hiber.model.Car;
import hiber.model.User;

import java.util.List;

public interface CarService {
    void add(Car user);

    List<Car> listCars();

    User getUserByModelAndSeries(String model, int series);
}
