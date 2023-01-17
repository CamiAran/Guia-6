/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia6;

import java.util.Scanner;

public class Guia6_Ejercicio6 {
  /* public static void main(String[] args){
    int num1 = 5;
    int num2 = 7;
    if (num1 < num2) {
            System.out.println("La variable num1 aloja un numero menor a la variable num2");
            
}else {
            System.out.println("La variable num1 aloja un numero mayor a la variable num2");
}
}
}
*/
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese un numero");
        int num1 = leer.nextInt();
        
        System.out.println("Ingrese otro numero");
        int num2 = leer.nextInt();  
        if (num1> 25 && num2 > 25){
            System.out.println("Ambos numeros son mayores a 25");}
        else if (num1 > 25 || num2 > 25){
                    System.out.println("Uno de los numeros es mayor a 25");}
        else {
                System.out.println("Ninguno de los numeros ingresados es mayor a 25");
                    }
            
    }
    }

