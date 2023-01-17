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
public class Ej5Apr_Guia6 {
    public static void main(String[] args){
    Scanner leer = new Scanner(System.in);
        System.out.println("Escribe un numero");
        int num = leer.nextInt();
        System.out.println( "El doble del numero ingresado es " + num *2+". El triple es "+ num * 3+ " y la raíz cuadrada es "+ Math.sqrt(num));
    }
    
}
