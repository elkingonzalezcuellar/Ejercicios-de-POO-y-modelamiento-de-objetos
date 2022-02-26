package ejercicio_4;

import java.util.Date;

/**
 *
 * @author PC
 */
public abstract class Vehicle {

    private int numberOfPassengers;
    private boolean crew;
    private int numberOfWheels;
    private Date matriculationDate = new Date();
    private int value;
    private String brand;
    private String enviroment1;
    private String model;
    private String energySource;
    private String color;

    public Vehicle() {
    }

    public Vehicle(int numberOfPassengers, boolean crew, int numberOfWheels, int value, String brand, String enviroment1, String model, String energySource, String color) {
        this.numberOfPassengers = numberOfPassengers;
        this.crew = crew;
        this.numberOfWheels = numberOfWheels;
        this.value = value;
        this.brand = brand;
        this.enviroment1 = enviroment1;
        this.model = model;
        this.energySource = energySource;
        this.color = color;

    }

    public int getNumberOfPassengers() {
        return numberOfPassengers;
    }

    public void setNumberOfPassengers(int numberOfPassengers) {
        this.numberOfPassengers = numberOfPassengers;
    }

    public boolean isCrew() {
        return crew;
    }

    public void setCrew(boolean crew) {
        this.crew = crew;
    }

    public int getNumberOfWheels() {
        return numberOfWheels;
    }

    public void setNumberOfWheels(int numberOfWheels) {
        this.numberOfWheels = numberOfWheels;
    }

    public Date getMatriculationDate() {
        return matriculationDate;
    }

    public void setMatriculationDate(Date matriculationDate) {
        this.matriculationDate = matriculationDate;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getEnviroment1() {
        return enviroment1;
    }

    public void setEnviroment1(String enviroment1) {
        this.enviroment1 = enviroment1;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getEnergySource() {
        return energySource;
    }

    public void setEnergySource(String energySource) {
        this.energySource = energySource;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String toString() {
        return "\n" + "Numero de pasajeros: " + numberOfPassengers
                + " | Presencia de tripulación: " + crew
                + " | Numero de ruedas: " + numberOfWheels
                + " | Precio: $" + value
                + " | Marca: " + brand
                + " | Medio : " + enviroment1
                + " | Modelo: " + model
                + " | Fuente de energia: " + energySource
                + " | Color: " + color
                + " | Fecha de creación: " + matriculationDate
                + "\n";
    }

    public void SpeedUp() {
        System.out.println("Acelerando...");
    }

    public void Brake() {
        System.out.println("Frenando...");
    }

    public abstract void Move();

    public abstract void Start();

    public Vehicle RequestVehicleData(Vehicle next) {

        System.out.print("Marca: ");
        next.setBrand(ValidateData.Data());
        System.out.print("Modelo: ");
        next.setModel(ValidateData.Data());
        System.out.print("Color: ");
        next.setColor(ValidateData.Data());
        System.out.print("Fuente de energia: ");
        next.setEnergySource(ValidateData.Data());
        System.out.print("Medio en que se desplaza: ");
        next.setEnviroment1(ValidateData.Data());
        System.out.print("Numero de pasajeros: ");
        next.setNumberOfPassengers(ValidateData.DataInt());
        System.out.print("Numero de ruedas: ");
        next.setNumberOfPassengers(ValidateData.DataInt());
        System.out.print("Valor: ");
        next.setValue(ValidateData.DataInt());
        next.setMatriculationDate(new Date());
        return next;

    }
}
