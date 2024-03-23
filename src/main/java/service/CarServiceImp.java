package service;

import dao.CarDao;
import dao.CarDaoImp;
import model.Car;

import java.util.LinkedList;
import java.util.List;

public class CarServiceImp implements CarService {

    private final CarDao carDao;

    public CarServiceImp() {
        this.carDao = new CarDaoImp();
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
