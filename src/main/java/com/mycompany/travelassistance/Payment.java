/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.travelassistance;

/**
 *
 * @author hp
 */
public abstract class Payment {
    
    private double hotelPrice;
    private double flightTickets;
    
    
    public abstract double calcPrice();
    

    public Payment( double hotelPrice, double flightTickets) {
        this.hotelPrice = hotelPrice;
        this.flightTickets = flightTickets;
    }


    public double getHotelPrice() {
        return hotelPrice;
    }

    public void setHotelPrice(double hotelPrice) {
        this.hotelPrice = hotelPrice;
    }

    public double getFlightTickets() {
        return flightTickets;
    }

    public void setFlightTickets(double flightTickets) {
        this.flightTickets = flightTickets;
    }

    
}
