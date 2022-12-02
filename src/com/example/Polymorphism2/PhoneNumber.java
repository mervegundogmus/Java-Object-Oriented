package com.example.Polymorphism2;

public class PhoneNumber {
    private int countryCode;
    private String phoneNumber;

    public PhoneNumber(String phoneNumber) {

    }

    public PhoneNumber(int countryCode, String phoneNumber) {
        this.countryCode = countryCode;
        this.phoneNumber = phoneNumber;
    }
}
