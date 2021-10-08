/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.Date;

/**
 *
 * @author niulp
 */

public class Car {

    private String model;
//    private static Date manufacturedYear;
    private int seats;
//    private static Date timestampAdded ;
//    private static Date timestampUpdated;
    private String location;
//    private static Date certificateStartDate ;
//    private static Date certificateEndDate;
    private boolean available;

    public String isAvailable() {
        return String.valueOf(available);
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

//    public static Date getManufacturedYear() {
//        return manufacturedYear;
//    }
//
//    public static void setManufacturedYear(Date manufacturedYear) {
//        Car.manufacturedYear = manufacturedYear;
//    }
    public String getSeats() {
//        return seats;
        return Integer.toString(seats);
    }

    public void setSeats(int seats) {
        this.seats = seats;
    }

//    public static Date getTimestampAdded() {
//        return timestampAdded;
//    }
//
//    public static void setTimestampAdded(Date timestampAdded) {
//        Car.timestampAdded = timestampAdded;
//    }
//    public static Date getTimestampUpdated() {
//        return timestampUpdated;
//    }
//
//    public static void setTimestampUpdated(Date timestampUpdated) {
//        Car.timestampUpdated = timestampUpdated;
//    }
    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

//    public static Date getCertificateStartDate() {
//        return certificateStartDate;
//    }
//
//    public static void setCertificateStartDate(Date certificateStartDate) {
//        Car.certificateStartDate = certificateStartDate;
//    }
//    public static Date getCertificateEndDate() {
//        return certificateEndDate;
//    }
//
//    public static void setCertificateEndDate(Date certificateEndDate) {
//        Car.certificateEndDate = certificateEndDate;
//    }
    @Override
    public String toString() {
        return model;
    }

}
