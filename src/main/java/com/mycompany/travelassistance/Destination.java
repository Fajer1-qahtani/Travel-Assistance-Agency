/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.travelassistance;

/**
 *
 * @author hp
 */
public class Destination {
    public String Country;
    public String city;
    public String hotel;
    public String landMarks;
    
    TotalPrice price;

    public Destination(String Country, String city, String hotel, String landMarks,double totalPrice, double hotelPrice, double flightTickets) {
        this.Country = Country;
        this.city = city;
        this.hotel = hotel;
        this.landMarks = landMarks;
        price = new TotalPrice( totalPrice,  hotelPrice,  flightTickets);
    }

    public String getCountry() {
        return Country;
    }

    public String getCity() {
        return city;
    }

    public String getHotel() {
        return hotel;
    }

    public String getLandMarks() {
        return landMarks;
    }
    
}     
        
        
        
        
       