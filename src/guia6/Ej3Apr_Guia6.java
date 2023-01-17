/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package guia6;

import static java.lang.Character.toUpperCase;
import static java.lang.System.console;
import java.util.Scanner;

/**
 *
 * @author camia
 */
public class Ej3Apr_Guia6 {
    public static void main (String[] args){
        Scanner leer = new Scanner(System.in);
        System.out.println("Escriba una frase");
        String frase = leer.nextLine();
        System.out.println( "La frase en mayusculas es: " + (frase.toUpperCase()));
        System.out.println("La frase en minusculas es: "+ (frase.toLowerCase()));
    }
}

