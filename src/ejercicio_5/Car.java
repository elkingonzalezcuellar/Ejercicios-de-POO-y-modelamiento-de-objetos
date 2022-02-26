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
public class Car extends Vehicle {

    private boolean carTrunk;
    private boolean tintedWindows;
    private boolean reverseCamera;
    private boolean convertible;

    public Car() {
    }

    public Car(boolean carTrunk, boolean tintedWindows, boolean reverseCamera, boolean convertible, int numberOfPassengers, boolean crew, int numberOfWheels, int value, String brand, String enviroment1, String model, String energySource, String color) {
        super(numberOfPassengers, crew, numberOfWheels, value, brand, enviroment1, model, energySource, color);
        this.carTrunk = carTrunk;
        this.tintedWindows = tintedWindows;
        this.reverseCamera = reverseCamera;
        this.convertible = convertible;
    }
    @Override
    public void Move() {
        System.out.println("Carro en movimiento");

    }
@Override
    public void Start() {
        
        System.out.println("Carro encendido");

    }

    public boolean isConvertible() {
        return convertible;
    }

    public void setConvertible(boolean convertible) {
        this.convertible = convertible;
    }

    public boolean isCarTrunk() {
        return carTrunk;
    }

    public void setCarTrunk(boolean carTrunk) {
        this.carTrunk = carTrunk;
    }

    public boolean isTintedWindows() {
        return tintedWindows;
    }

    public void setTintedWindows(boolean tintedWindows) {
        this.tintedWindows = tintedWindows;
    }

    public boolean isReverseCamera() {
        return reverseCamera;
    }

    public void setReverseCamera(boolean reverseCamera) {
        this.reverseCamera = reverseCamera;
    }

}
