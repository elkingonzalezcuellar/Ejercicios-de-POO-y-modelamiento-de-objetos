package ejercicio_4;

import ejercicio_5.Car;
import java.util.Date;
import java.util.Vector;

/**
 *
 * @author PC
 */
public class Ejercicio_4 {

    static Vector<Vehicle> list = new Vector<>();

    public static void main(String[] args) {
        CreatedVehicle();
        toList();
    }

    public static void CreatedVehicle() {

        for (int i = 1; i <= 10; i++) {

            System.out.println("Datos del vehiculo " + i);
            Vehicle e = new Car();
            e.RequestVehicleData(e);
            System.out.println("Vehiculo Creado!");
            setList(e);
        }
    }

    public static void toList() {
        System.out.println(list);
    }

    public static void setList(Vehicle name) {
        list.add(name);
    }

}
