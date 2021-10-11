/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author niulp
 */
public class Utility {
    
    private static final String SEAT_REGEX = "^[1-9]?$|^10$";
    private static final String LOCATION_REGEX = "^[a-zA-Z ]*$";
    private static final String ALPHANUMERIC_REGEX = "^[a-zA-Z0-9_-]*$";
    private static final String YEAR_REGEX = "19[789]\\d|20[01]\\d|2020|2021";
    private static final String CAR_BRAND_REGEX = "^[a-zA-Z0-9_-]*$";
    
        public static boolean isValidSeatCount(int seats) {
        String inputSeats = Integer.toString(seats);
        return inputSeats.matches(SEAT_REGEX);
    }
    
    public static boolean isValidLocation(String location) {
        return location.matches(LOCATION_REGEX);
    }
    
    public static boolean isValidSerialNumber(String serialNumber) {
        return serialNumber.matches(ALPHANUMERIC_REGEX);
    }
    
    public static boolean isValidModel(String model) {
        return model.matches(ALPHANUMERIC_REGEX);
    }
    
    public static boolean isValidManufacturedYear(String year) {
        return year.matches(YEAR_REGEX);
    }  
    
    public static boolean isValidCarBrand(String carBrand) {
        return carBrand.matches(CAR_BRAND_REGEX);
    }
}
