/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package guia6;

import java.util.Scanner;

/**
 *
 * @author camia
 */
public class Ej6Apr_Guia6 {
    public static void main (String[] args){
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un numero");
        int num = leer.nextInt();
        if (num % 2 == 0) 
                {
        System.out.println("El numero ingresado es par");
       }
                else 
                {
        System.out.println("El numero ingresado es impar");
               }
    }

}