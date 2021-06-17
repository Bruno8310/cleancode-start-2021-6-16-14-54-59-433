package com.tw.academy.basic.$5_data_clumps;

public class ParcelUser {
    private final String name;
    private final String phoneNumber;
    private final String address;

    public ParcelUser(String name, String phoneNumber, String address) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getAddress() {
        return address;
    }
}
