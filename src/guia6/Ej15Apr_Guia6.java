/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package guia6;

/**
 Realizar un algoritmo que rellene un vector con los 100 primeros números enteros y los
muestre por pantalla en orden descendente.
 */
public class Ej15Apr_Guia6 {
    public static void main(String[] args){
        imprimirvector();
        
    }
    
    public static void imprimirvector(){
        int[] nume = new int[101];
        for (int i = 100; i > 0; i--) {
            nume[i] = i;
            System.out.println("[" + nume[i] + "]");
        }
                  
    }
    
            
            }
