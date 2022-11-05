/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.travelassistance;

/**
 *
 * @author hp
 */
public class EscortInfo extends UserInfo {
public int numOfEscorts;
public int age;

     
    

    public EscortInfo(int numOfEscorts, String userName, String national_ID, String email, String phoneNumber, int age) {
        super(userName, national_ID, email, phoneNumber);
        this.numOfEscorts = numOfEscorts;
    }

    @Override
    public String toString() {
        return "EscortInfo{" + "numOfEscorts=" + numOfEscorts + '}';
    }
   
    
    
}
