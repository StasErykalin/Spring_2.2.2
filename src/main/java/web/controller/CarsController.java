package web.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.model.Car;
import web.service.CarService;

import java.util.List;

@Controller
public class CarsController {

    private final CarService carService;

    @Autowired
    public CarsController(CarService carService) {
        this.carService = carService;
    }

    @GetMapping(value = "/cars")
    public String getCars(@RequestParam(name = "count", required = false) Integer count, Model model) {
        if(count == null){
            List<Car> cars = carService.getAllCars();
            model.addAttribute("cars", cars);
            return "car";
        }else{
            List<Car> cars = carService.getCars(count);
            model.addAttribute("cars", cars);
            return "car";
        }
    }

}
