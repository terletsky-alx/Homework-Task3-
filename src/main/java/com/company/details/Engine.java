package com.company.details;

public class Engine {
    private int power;
    private String company;

    public Engine(){}
    public Engine(int power, String company){
        this.power = power;
        this.company = company;
    }

    public int getPower() {return power;}
    public String getCompany() {return company;}

    public void setPower(int power){
        this.power = power;
    }
    public void setCompany(){
        this.company =  company;
    }

    @Override
    public String toString(){
        return "Engine{power = " + power + " company = " + company + "}";
    }
}
