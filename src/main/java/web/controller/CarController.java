package web.controller;

import Model.Car;
import Service.CarService;
import Service.CarServiceImpl;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;


@Controller
@RequestMapping("/cars")
public class CarController {

    @GetMapping
    public String getCars(@RequestParam(value = "count", defaultValue = "5") int allCars, ModelMap model) {
        CarService carService = new CarServiceImpl();
        List<Car> carList = carService.getAllCars().subList(0, allCars);
        model.addAttribute("cars", carList);
        return "cars";
    }
}
