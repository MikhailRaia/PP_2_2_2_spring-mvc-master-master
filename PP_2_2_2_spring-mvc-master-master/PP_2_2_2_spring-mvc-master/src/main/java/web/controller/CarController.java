package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.model.Car;
import web.service.CarServiceImp;

import java.util.ArrayList;
import java.util.List;

@Controller

public class CarController {

    @GetMapping(value = "/cars")
    public String printCars(@RequestParam(value = "count", defaultValue = "5") int nCar, ModelMap model) {
        CarServiceImp carSI = new CarServiceImp();
        List<Car> carList = new ArrayList<>();
        carList.add(new Car("Tesla", "V8", 500));
        carList.add(new Car("BMW", "V8", 550));
        carList.add(new Car("Mersedes", "V12", 600));
        carList.add(new Car("Ferrari", "V12", 1000));
        carList.add(new Car("Aston Martin", "V12", 800));
        carList = carSI.getSomeCar(carList, nCar);
        model.addAttribute("list", carList);
        return "car";
    }
}
