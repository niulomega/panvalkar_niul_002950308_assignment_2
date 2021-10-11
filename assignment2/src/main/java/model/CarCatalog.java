/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
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
    
    private Timestamp lastEvent;

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

    public List<Car> findCarByModel(String model) {
        return cars.stream().filter(p -> p.getModel().equals(model)).collect(toList());
    }

    public List<Car> findCarByLocation(String location) {
        return cars.stream().filter(p -> p.getLocation().equals(location)).collect(toList());
    }
        
    public List<Car> findCarBySeatCount(int minseats, int maxseats) {
        return cars.stream().filter(p -> (p.getSeatCount() >= minseats && p.getSeatCount() <= maxseats)).collect(toList());
    }
    
    public List<Car> findCarBySerialNumber(String serialNumber) {
        return cars.stream().filter(p -> p.getSerialNumber().equals(serialNumber)).collect(toList());
    }
    
    public String getLastUpdated() throws Exception{
         SimpleDateFormat outputDate = new SimpleDateFormat("MM/dd/yyyy HH:mm:ss");
         return outputDate.format(lastEvent);
    }
    
    public void setLastUpdated(Timestamp lastUpdated){
        lastEvent = lastUpdated;
    }

    public List<Car> findCarByAvailability(Boolean available) {
        return cars.stream().filter(p -> p.isAvailable() == available).collect(toList());
    }
    
     public List<Car> findCarByExpiredCertificate(Boolean certificateExpired) {
        return cars.stream().filter(p -> p.isExpiredCertificate()== certificateExpired).collect(toList());
    }

    public List<Car> findCarByCarBrand(String searchedCarBrand) {
        return cars.stream().filter(p -> p.getCarBrand().equals(searchedCarBrand)).collect(toList());
    }
    

}
