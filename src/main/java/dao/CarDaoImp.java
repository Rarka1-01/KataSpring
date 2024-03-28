package dao;

import model.Car;
import org.springframework.stereotype.Component;

import java.util.LinkedList;
import java.util.List;

@Component(value = "carDaoImp")
public class CarDaoImp implements CarDao {

    @Override
    public List<Car> generateListCars() {
        List<Car> cars = new LinkedList<>();
        cars.add(new Car("Грузовая", 1, "Жигули"));
        cars.add(new Car("Легковая", 121, "Хонда"));
        cars.add(new Car("Без подвески", 33, "Бентли"));
        cars.add(new Car("Батина", 51, "Газель"));
        cars.add(new Car("Криминальная", 123, "Таота"));
        cars.add(new Car("Полицейская", 61, "Таота"));
        cars.add(new Car("С прицепом", 666, "Таота"));
        cars.add(new Car("Детская", 16, "Таота"));

        return cars;
    }
}
