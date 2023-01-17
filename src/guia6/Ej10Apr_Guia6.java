/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package guia6;

import java.util.Scanner;

/**
 *
 * @author camia Escriba un programa en el cual se ingrese un valor límite
 * positivo, y a continuación solicite números al usuario hasta que la suma de
 * los números introducidos supere el límite inicial.
 */
public class Ej10Apr_Guia6 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int tope, suma, num;
        suma = 0;

        System.out.println("Escriba una un numero");
        tope = leer.nextInt();

        if (tope < suma) {
            System.out.println("El numero ingresado es negativo");
        } else {
            while (suma <= tope) {
                System.out.println("Ingrese otro numero");
                num = leer.nextInt();
                suma = suma + num;
                System.out.println("El valor sumado es " + suma);
            }
        }
    }
}
