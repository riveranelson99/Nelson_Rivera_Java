package com.company;

public class BillingInfo {

    private String street1;
    private String street2;
    private String city;
    private String state;
    private long zip;


    // Getters
    public String getStreet1() {
        return street1;
    }

    public String getStreet2() {
        return street2;
    }

    public String getCity() {
        return city;
    }

    public String getState() {
        return state;
    }

    public long getZip() {
        return zip;
    }


    // Setters
    public void setStreet1(String street1) {
        this.street1 = street1;
    }

    public void setStreet2(String street2) {
        this.street2 = street2;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setState(String state) {
        this.state = state;
    }

    public void setZip(long zip) {
        this.zip = zip;
    }
}
