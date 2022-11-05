/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.travelassistance;

/**
 *
 * @author hp
 */
public class UserInfo {
    public String userName;
    private String national_ID;
    private String email;
    private String password;
    private String phoneNumber;


    public UserInfo(String userName, String national_ID, String email, String phoneNumber) {
        this.userName = userName;
        this.national_ID = national_ID;
        this.email = email;
        this.phoneNumber = phoneNumber;
    
    }
    
    public String getNational_ID() {
        return national_ID;
    }

    public void setNational_ID(String national_ID) {
        this.national_ID = national_ID;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    
    
    @Override
    public String toString() {
        return "UserInfo{" + "userName=" + userName + ", national_ID=" + national_ID + ", email=" + email + ", password=" + password + ", phoneNumber=" + phoneNumber + '}';
    }

    
    }
    

