package com.company.professions;

public class Driver extends Person {
    private int expierence;

    public Driver(){
        super();
    }

    public Driver(int age, String fullName, int experience){
        super(age, fullName);
        this.expierence = experience;
    }
    @Override
    public String toString(){
        return "Driver{" + super.toString() + " + expierence = " + expierence + "}";
    }
}
