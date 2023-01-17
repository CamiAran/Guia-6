/*


{_* Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package guia6;

import java.util.Scanner;

/**
 *Realizar un algoritmo que rellene un vector de tamaño N con valores aleatorios y le pida al
usuario un numero a buscar en el vector. El programa mostrará donde se encuentra el
numero y si se encuentra repetido
 */
public class Ej16Apr_Guia6 {
    public static void main(String[] args){
        Scanner leer = new Scanner(System.in);
        int n, buscado, contador;
        
        contador = 0;
        int [] numeros, posiciones;
        System.out.println("Ingrese el tamaño del vector");
        n = leer.nextInt();
        
        numeros = new int [n];
        posiciones = new int [n];
        
        for (int i=0; i < n; i++){
        numeros[i]= (int) (Math.random()*9 + 1);
            System.out.println(numeros[i]);
        }
        System.out.println("Ingrese el valor buscado");
        buscado = leer.nextInt();
        
        for (int i =0; i< n; i++){
            if (buscado==numeros[i]){
                posiciones[contador] = i;
                contador++;
               // System.out.println(contador + "" + posiciones [i]);
                
            }
        }
        System.out.println("El valor buscado se encontró " + contador + " veces");
        System.out.println(" ");
        System.out.println("en las posiciones ");
        for(int i=0;i<contador;i++){
            System.out.println(posiciones[i] + ",");
        }
    }
}

