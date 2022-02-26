/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio_3;

import java.util.Scanner;

/**
 *
 * @author PC
 */
public class Ejercicio_3 {

    private static Scanner in = new Scanner(System.in);
    private static int selection;

    public static void main(String[] args) {
        VectorAleatorio vec1 = new VectorAleatorio();
        vec1.GenerateArray();
        System.out.println("Hemos generado el vector : ");
        vec1.PrintArray();
        System.out.println("Selecciona una opción para ordenarlo ascendentemente :");
        System.out.println("  1.Metodo burbuja");
        System.out.println("  2.Metodo quicksort");
        selection = in.nextInt();

        if (selection == 1) {
            vec1.OrderBubble();
            vec1.PrintArray();
        } else if (selection == 2) {
            vec1.QuickSort(0, (vec1.getLength() - 1), vec1.getVector());
            vec1.PrintArray();

        } else {
            System.out.println("Opción  no valida");
        }

    }

}
