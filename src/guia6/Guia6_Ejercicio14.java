/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia6;

import java.util.Scanner;

/**
 *
 * @author camia
 */
public class Guia6_Ejercicio14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese la cantidad de moneda en Euros");
        
        Float euros = leer.nextFloat();
        int moneda;
        
        System.out.println("A qué moneda lo quieres convertir?");
        System.out.println("Las opciones son: ");
        System.out.println("1: Dólares");
        System.out.println("2: Yenes");
        System.out.println("3: Libras");
        
        do {
            moneda = leer.nextInt();
            if (moneda != 1 && moneda != 2 && moneda != 3) {
                System.out.println("Ingresó una opción errónea. REcuerde que las opciones son 1, 2 ó 3");
            }
        } while (moneda <1 || moneda >3);
        
        System.out.println("");
        convertirMoneda(euros, moneda);
        System.out.println("");
    }
public static void convertirMoneda(Float A, int B){

switch (B){
            case 1:
                System.out.println("Ud. ingresó Euros "+A+" y pidió pasarlos a Dólares");
                System.out.println("Recibirá: Dólares "+(A*1.28611));
                break;
            case 2:
                System.out.println("Ud. ingresó Euros "+A+" y pidió pasarlos a Yenes");
                System.out.println("Recibirá: Yenes "+(A*129.852));
                break;
            case 3:
                System.out.println("Ud. ingresó Euros "+A+" y pidió pasarlos a LIbras");
                System.out.println("Recibirá: Libras "+(A*0.86));
        }
}
}

