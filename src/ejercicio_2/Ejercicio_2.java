/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio_2;

/**
 *
 * @author PC
 */
public class Ejercicio_2 {
    
    public static void main(String[] args) {
        System.out.println("Aqui inicia el programa");
        ClassOne First = new ClassOne();
        ClassTwo Second = new ClassTwo();
        ClassTwo.main(args);
    }
}

class ClassTwo {
    
    public static void main(String[] args) {
        System.out.println("Clase 2");
    }
}

class ClassThree {
    
    public static void main(String[] args) {
        System.out.println("Clase 3");
    }
}
