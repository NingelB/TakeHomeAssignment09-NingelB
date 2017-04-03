package com.example.cmltdstudent.takehomeassignment09_ningelb;

/**
 * Created by cmltdstudent on 4/3/17.
 */

public class Vacation {

    private String destination;
    private int days;
    private boolean passport;

    public Vacation () { }

    public Vacation(String destination, int days, boolean passport) {
        this.destination = destination;
        this.days = days;
        this.passport = passport;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public int getDays() {
        return days;
    }

    public void setDays(int days) {
        this.days = days;
    }

    public boolean isPassport() {
        return passport;
    }

    public void setPassport(boolean passport) {
        this.passport = passport;
    }

    @Override
    public String toString() {
        return "Vacation: "+ destination + "\n" +
                "Number of Days: " + days + "\n"  +
                "Do you Need a Passport?" + passport + "\n" ;
    }
}