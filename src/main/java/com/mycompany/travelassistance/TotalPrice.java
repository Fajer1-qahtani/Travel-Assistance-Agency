/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.travelassistance;

/**
 *
 * @author hp
 */
public class TotalPrice extends Payment {

    public double totalPrice;

    public double calcPrice(){
        double result;
        result = getHotelPrice() + getFlightTickets();
        
       return result;
    }
    public TotalPrice(double totalPrice, double hotelPrice, double flightTickets) {
        super(hotelPrice, flightTickets);
        this.totalPrice = totalPrice;
    }
   
}
