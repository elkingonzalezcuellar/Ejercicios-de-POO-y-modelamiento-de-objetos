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
public class Truck extends Vehicle {

    private boolean load;
    private int loadWeight;

    public Truck() {
    }

    public Truck(boolean load, int loadWeight, int numberOfPassengers, boolean crew, int numberOfWheels, int value, String brand, String enviroment1, String model, String energySource, String color) {
        super(numberOfPassengers, crew, numberOfWheels, value, brand, enviroment1, model, energySource, color);
        this.load = load;
        this.loadWeight = loadWeight;
    }

    @Override
    public void Move() {
        System.out.println("Camión en movimiento");

    }

    @Override
    public void Start() {

        System.out.println("Camión encendido");

    }


    public int getLoadWeight() {
        return loadWeight;
    }

    public void setLoadWeight(int loadWeight) {
        this.loadWeight = loadWeight;
    }

    public boolean isLoad() {
        return load;
    }

    public void setLoad(boolean load) {
        this.load = load;
    }

}
