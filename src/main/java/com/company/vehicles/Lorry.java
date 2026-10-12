package com.company.vehicles;

import com.company.details.Engine;
import com.company.professions.Driver;

public class Lorry extends Car{
    private int carrying;

    public Lorry(){}
    public Lorry(String carClass, Engine engine, Driver driver, String marka, int carrying){
        super(carClass, engine, driver, marka);
        this.carrying = carrying;
    }

    public int getCarrying() {return carrying;}
    public void setCarrying(int carrying) {this.carrying = carrying;}

    @Override
    public String toString(){
        return "Lorry{" + super.toString() + "carrying = " + carrying + "}";
    }
}
