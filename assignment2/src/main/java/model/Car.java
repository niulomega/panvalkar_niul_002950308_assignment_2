/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

//import java.security.Timestamp;
import java.sql.Timestamp;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;

/**
 *
 * @author niulp
 */
public class Car {

    private String model;
    private String manufacturedYear;
    private String carBrand;
    private int seats;
    private String serialNumber;
    private Date timestampAdded;
    private Date timestampUpdated;
    private String location;
    private boolean available;
    private boolean expiredCertificate;

    public String getCarBrand() {
        return carBrand;
    }

    public void setCarBrand(String carBrand) {
        this.carBrand = carBrand;
    }
    
    public boolean isExpiredCertificate() {
        return expiredCertificate;
    }

    public void setExpiredCertificate(boolean expiredCertificate) {
        this.expiredCertificate = expiredCertificate;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public Boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    public String getTimestampAdded() {
        SimpleDateFormat outputDate = new SimpleDateFormat("MM/dd/yyyy HH:mm:ss");
        return outputDate.format(timestampAdded);
    }

    public void setTimestampAdded(Timestamp timestampAdded) throws Exception {

        this.timestampAdded = timestampAdded;
    }

    public String getTimestampUpdated() {
        SimpleDateFormat outputDate = new SimpleDateFormat("MM/dd/yyyy HH:mm:ss");
        return outputDate.format(timestampUpdated);
    }

    public void setTimestampUpdated(Timestamp timestampUpdated) throws Exception {
        this.timestampUpdated = timestampUpdated;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getManufacturedYear() {
        return manufacturedYear;
    }

    public void setManufacturedYear(String manufacturedYear) {
        this.manufacturedYear = manufacturedYear;
    }

    public String getSeats() {
        return Integer.toString(seats);
    }

    public int getSeatCount() {
        return seats;
    }

    public void setSeats(int seats) {
        this.seats = seats;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    @Override
    public String toString() {
        return model;
    }

}
