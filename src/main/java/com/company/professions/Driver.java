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

    public int getExpierence() {
        return expierence;
    }
    public void setExpierence(int expierence){
        this.expierence = expierence;
    }

    @Override
    public String toString(){
        return "Driver{" + super.toString() + " + expierence = " + expierence + "}";
    }
}

