package web.dao;

import org.springframework.stereotype.Component;
import web.model.Car;
import web.service.CarService;

import java.util.ArrayList;
import java.util.List;
@Component
public class CarDao {
    private List<Car> cars;

    {
       cars = new ArrayList<>();
        cars.add(new Car("Hyundai", "Black", 2007));
        cars.add(new Car("BMW", "Grey", 2019));
        cars.add(new Car("Nissan", "Red", 1999));
        cars.add(new Car("Skoda", "Green", 2015));
        cars.add(new Car("Toyota", "White", 2023));
        cars.add(new Car("Nissan", "Red", 1999));
        cars.add(new Car("Skoda", "Green", 2015));
        cars.add(new Car("Toyota", "White", 2023));
    }

    public List<Car> getAllCars() {
        return cars;
    }
    public List<Car> getCars(int count) {
        List<Car> allCars = getAllCars();

        if (count >= allCars.size()) {
            return allCars;
        } else {
            return allCars.subList(0, count);
        }
    }
}
