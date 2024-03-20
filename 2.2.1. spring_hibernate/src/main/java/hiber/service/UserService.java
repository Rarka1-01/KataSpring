package hiber.service;

import hiber.model.Car;
import hiber.model.User;

import java.util.List;

public interface UserService {
    void addUser(User user);

    void addCar(Car car);

    List<User> listUsers();

    List<Car> listCars();

    User getUserByModelAndSeries(String model, int series);
}
