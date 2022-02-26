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
public class Motorcycle extends Vehicle {

    private boolean ABS;
    private boolean nonSlipTires;
    private int weight;

    public Motorcycle() {
    }

    public Motorcycle(boolean ABS, boolean nonSlipTires, int weight, int numberOfPassengers, boolean crew, int numberOfWheels, int value, String brand, String enviroment1, String model, String energySource, String color) {
        super(numberOfPassengers, crew, numberOfWheels, value, brand, enviroment1, model, energySource, color);
        this.ABS = ABS;
        this.nonSlipTires = nonSlipTires;
        this.weight = weight;
    }
    @Override
    public void Move() {
        System.out.println("Motocicleta en movimiento");

    }
@Override
    public void Start() {
        
        System.out.println("Moto encendida");

    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public boolean isABS() {
        return ABS;
    }

    public void setABS(boolean ABS) {
        this.ABS = ABS;
    }

    public boolean isNonSlipTires() {
        return nonSlipTires;
    }

    public void setNonSlipTires(boolean nonSlipTires) {
        this.nonSlipTires = nonSlipTires;
    }

}
