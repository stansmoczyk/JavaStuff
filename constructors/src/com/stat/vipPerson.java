package com.stat;

public class vipPerson {

    private String name;
    private double creditLimit;
    private String emailAddress;

    public vipPerson(){
        this("Default name", 50000.00, "default@email.com");
    }


    public vipPerson(String name, double creditLimit) {
        this(name, creditLimit, "unknown@email.com");
    }

    public vipPerson(String name, double creditLimit, String emailAddress) {
        this.name = name;
        this.creditLimit = creditLimit;
        this.emailAddress = emailAddress;
    }

    public String getName() {
        return name;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public String getEmailAddress() {
        return emailAddress;
    }
}
