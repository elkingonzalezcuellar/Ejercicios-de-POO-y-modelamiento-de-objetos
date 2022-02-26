/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio_5;

import ejercicio_4.ValidateData;
import ejercicio_4.Vehicle;
import java.util.Date;

/**
 *
 * @author PC
 */
public class Bike extends Vehicle {

    private int currentChainring;
    private int currentBikeSprocket;
    private int rinSize;

    public Bike() {
    }

    public Bike(int currentChainring, int currentBikeSprocket, int numberOfPassengers, boolean crew, int numberOfWheels, int value, String brand, String enviroment1, String model, String energySource, String color) {
        super(numberOfPassengers, crew, numberOfWheels, value, brand, enviroment1, model, energySource, color);
        this.currentChainring = currentChainring;
        this.currentBikeSprocket = currentBikeSprocket;
    }

    @Override
    public void Move() {

        System.out.println("Bicicleta en movimiento");

    }

    @Override
    public void Start() {

        System.out.println("Pedaleando...");

    }

    public int getCurrentBikeSprocket() {
        return currentBikeSprocket;
    }

    public void setCurrentBikeSprocket(int currentBikeSprocket) {
        this.currentBikeSprocket = currentBikeSprocket;
    }

    public int getCurrentChainring() {
        return currentChainring;
    }

    public void setCurrentChainring(int currentChainring) {
        this.currentChainring = currentChainring;
    }

    public int getRinSize() {
        return rinSize;
    }

    public void setRinSize(int rinSize) {
        this.rinSize = rinSize;
    }


}
