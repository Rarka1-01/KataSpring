package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import model.Car;
import org.springframework.web.bind.annotation.RequestParam;
import service.CarService;
import service.CarServiceImp;

import java.util.List;

@Controller
public class CarController {
    @GetMapping(value = "/cars")
    public String printListCars(@RequestParam(value = "count", defaultValue = "3") int count, ModelMap model) {
        CarService carService = new CarServiceImp();
        List<Car> cars = carService.getCars(count);

        model.addAttribute("cars", cars);
        return "car";
    }

}
