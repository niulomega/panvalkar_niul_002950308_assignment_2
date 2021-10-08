/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Predicate;
import static java.util.stream.Collectors.toList;
import model.Car;

/**
 *
 * @author niulp
 */
public class CarCatalog {

    private ArrayList<Car> cars;

    public CarCatalog() {
        this.cars = new ArrayList<Car>();
    }

    public ArrayList<Car> getCars() {
        return cars;
    }

    public void setCars(ArrayList<Car> cars) {
        this.cars = cars;
    }

    public Car addNewCar() {
        Car car = new Car();
        cars.add(car);
        return car; 
    }
 
    public void deleteCar(Car selectedCar) {
        cars.remove(selectedCar);
    }
    
    public List<Car> findCar(String model) {
        
        return cars.stream().filter(p-> p.getModel().equals(model)).collect(toList());
    }
    
    
}
