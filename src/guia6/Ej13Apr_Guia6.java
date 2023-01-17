/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package guia6;

import java.util.Scanner;

/**
 *
 * @author camia Dibujar un cuadrado de N elementos por lado utilizando el
 * carácter “*”. Por ejemplo, si el cuadrado tiene 4 elementos por lado se
 * deberá dibujar lo siguiente: * * * * * * * *
 */
public class Ej13Apr_Guia6 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int n;

        System.out.println("Ingrese cuantos elementos quiere utilizar");
        n = leer.nextInt();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == 0 || i == n - 1 || j == 0 || j == n - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }

    }
}
