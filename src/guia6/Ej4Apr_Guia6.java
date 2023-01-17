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
public class Ej4Apr_Guia6 {
    public static void main(String[] args){
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese los grados");
        int gradosC = leer.nextInt();
        int gradosF = 32 + (9 * gradosC / 5);
        System.out.println("El equivalente en Fahrenheit es "+ gradosF);
    }
}

