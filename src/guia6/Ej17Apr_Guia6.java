/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package guia6;



/**
 Recorrer un vector de N enteros contabilizando cuántos números son de 1 dígito, cuántos
de 2 dígitos, etcétera (hasta 5 dígitos).
 */
public class Ej17Apr_Guia6 {
    public static void main (String[] args){
        
        
        int[] vEnteros= new int[100000];
        int[] vContadordeDigitos= new int[5];
        int digitos = 0;
        
        for (int i=0; i<100000; i++){
            vEnteros[i] = (int) (Math.random()*99999+1);
            digitos = (int) Math.log10(vEnteros[i])+1;
            vContadordeDigitos[digitos - 1] = vContadordeDigitos[digitos - 1] + 1;
        }
         System.out.println("");
         for(int i= 0; i<5;i++){
             System.out.println("Hay " + vContadordeDigitos[i] + " numeros de " + (i + 1)+ " digitos" );
         }
    }
}
