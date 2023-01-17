/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia6;

/**
 *
 * @author camia
 */
public class Guia6_Ejercicio15 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       rellenarVector(100);

    }
    public static void rellenarVector(int qElementos){
        int[] miVector = new int[100];
        for (int i = 0; i < 100; i++) {
            
            miVector[i] = i+1;
        }
        
        for (int i = 99; i >= 0; i--) {
            System.out.print("["+miVector[i]+"]");
        }
        System.out.println("");
    }

}
