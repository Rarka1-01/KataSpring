package service;

import dao.CarDao;
import dao.CarDaoImp;
import model.Car;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.LinkedList;
import java.util.List;

@Component
public class CarServiceImp implements CarService {

    private final CarDao carDao;

    @Autowired
    public CarServiceImp(CarDao carDao) {
        this.carDao = carDao;
    }

    @Override
    public List<Car> getCars(int count) {

        if (count <= 0)
            return new LinkedList<>();

        if (count >= 5)
            return carDao.generateListCars();

        return carDao.generateListCars().stream().limit(count).toList();
    }
}
