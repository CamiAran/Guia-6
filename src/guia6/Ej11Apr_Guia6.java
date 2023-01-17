/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package guia6;

import java.util.Scanner;

/**
 *
 * @author camia
 * Realizar un programa que pida dos números enteros positivos por teclado y muestre por
pantalla el siguiente menú:
* El usuario deberá elegir una opción y el programa deberá mostrar el resultado por pantalla
y luego volver al menú. El programa deberá ejecutarse hasta que se elija la opción 5.
Tener en cuenta que, si el usuario selecciona la opción 5, en vez de salir del programa
directamente, se debe mostrar el siguiente mensaje de confirmación: ¿Está seguro que
desea salir del programa (S/N)? Si el usuario selecciona el carácter ‘S’ se sale del
programa, caso contrario se vuelve a mostrar el menú.
 */
public class Ej11Apr_Guia6 {
    public static void main(String[] args){
        Scanner leer = new Scanner(System.in);
        int num1, num2, opcion, sum, res,mult;
        float div;
        String op;
        
        op = "n";
        
        
        System.out.println("Ingrese un numero");
         num1 = leer.nextInt();
         System.out.println("Ingrese otro numero");
         num2 = leer.nextInt();
         
         while(!op.equals("s")){
             System.out.println("MENU");
             System.out.println("1. Sumar");
             System.out.println("2. Restar");
             System.out.println("3. Multiplicar");
             System.out.println("4. Dividir");
             System.out.println("5. Salir");
             System.out.println("Elija opción:");
             
             opcion = leer.nextInt();
             
            switch (opcion){
                case 1: sum = num1 + num2;
                    System.out.println("La suma de ambos numeros es " + sum);
                    break;
                case 2: res = num1 - num2;
                    System.out.println("La resta de ambos numeros es " + res);
                    break;
                case 3: mult = num1 * num2;
                    System.out.println("La multiplicación de ambos numeros es " + mult);
                    break;
                case 4: div = num1/num2;
                    System.out.println("La división de ambos numeros es " + div);
                    break;
                case 5: 
                    System.out.println("Está seguro que desea salir? Indique s/n");
                    op = leer.next();
                            
            }
         }
         
    }
    
}
