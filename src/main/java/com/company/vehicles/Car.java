package com.company.vehicles;

import com.company.details.Engine;
import com.company.professions.Driver;

public class Car {
    private String carClass;
    private Engine engine;
    private Driver driver;
    private String marka;

    public Car(){}

    public Car(String carClass, Engine engine, Driver driver, String marka){
        this.carClass = carClass;
        this.engine = engine;
        this.driver = driver;
        this.marka = marka;
    }
    public String getCarClass() {return carClass;}
    public Engine getEngine() {return engine;}
    public Driver getDriver() {return driver;}
    public String gerMarka() {return marka;}

    public void setCarClass(String carClass) {this.carClass = carClass;}
    public void setEngine(Engine engine) {this.engine = engine;}
    public void setDriver(Driver driver) {this.driver = driver;}
    public void setMarka(String marka) {this.marka = marka;}

    public void start(){
        System.out.println("Поехали!");
    }
    void stop(){
        System.out.println("Останавливаемся.");
    }
    void turnRight(){
        System.out.println("Поворот направо.");
    }
    void turnLeft(){
        System.out.println("Поворот налево.");
    }

    @Override
    public String toString(){
        return "Car{carClass = '" + carClass + "' engine = '" + engine + "' driver = '" + driver + "' marka = '" + marka + "}";
    }
}
