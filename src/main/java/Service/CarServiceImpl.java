package Service;

import Model.Car;

import java.util.ArrayList;
import java.util.List;

public class CarServiceImpl implements CarService {
    private static List<Car> cars = new ArrayList<>();

    public List<Car> getAllCars() {
        cars.add(new Car("Lada", 3, 2011));
        cars.add(new Car("BMW", 2, 2009));
        cars.add(new Car("Porsche", 4, 2020));
        cars.add(new Car("Kia", 1, 1998));
        cars.add(new Car("Reno", 1, 2001));
        return cars;
    }
}
