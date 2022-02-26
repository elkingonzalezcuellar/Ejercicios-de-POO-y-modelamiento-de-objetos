/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio_5;

import ejercicio_4.Vehicle;

/**
 *
 * @author PC
 */
public class Boat extends Vehicle {

    private boolean sailBoat;
    private int FrontWidth;
    private int backWidth;

    public Boat() {
    }

    public Boat(boolean sailBoat, int rontWidth, int backWidth, int numberOfPassengers, boolean crew, int numberOfWheels, int value, String brand, String enviroment1, String model, String energySource, String color) {
        super(numberOfPassengers, crew, numberOfWheels, value, brand, enviroment1, model, energySource, color);
        this.sailBoat = sailBoat;
        this.FrontWidth = FrontWidth;
        this.backWidth = backWidth;
    }

    @Override
    public void Move() {

        System.out.println("Lancha en movimiento...");

    }

    @Override
    public void Start() {

        System.out.println("Lancha encendida.");

    }


    public int getBackWidth() {
        return backWidth;
    }

    public void setBackWidth(int backWidth) {
        this.backWidth = backWidth;
    }

    public boolean isSailBoat() {
        return sailBoat;
    }

    public void setSailBoat(boolean sailBoat) {
        this.sailBoat = sailBoat;
    }

    public int getFrontWidth() {
        return FrontWidth;
    }

    public void setFrontWidth(int FrontWidth) {
        this.FrontWidth = FrontWidth;
    }

}
