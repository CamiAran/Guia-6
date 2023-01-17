/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package guia6;

/**
 Realizar un programa que rellene un matriz de 4 x 4 de valores aleatorios y muestre la
traspuesta de la matriz. La matriz traspuesta de una matriz A se denota por B y se obtiene
cambiando sus filas por columnas (o viceversa).
 */
public class Ej18Apr_Guia6 {
    public static void main(String[] args){
       
        
        //declaro matriz
        int[][] matriz= new int [3][3];
        //declaro otra matriz
        int [][] matrizT= new int [3][3];
        
        //rellenamos matriz
        for(int i=0; i<3; i++){
            for (int j=0;j<3;j++){
                //llenamos matriz original
               matriz [i][j]= (int) (Math.random()*9+1);
              // trasponemos matriz
               matrizT[j][i]= matriz[i][j];
               
            }
        } System.out.println("Matriz");
        imprimimosMatriz(matriz);
        System.out.println("Matriz traspuesta");
        imprimimosMatriz(matrizT);
    }
    public static void imprimimosMatriz(int[][] matriz){
        for (int i=0; i<3; i++){
            for(int j=0;j<3;j++){
                System.out.print("| "+ matriz[i][j] + " |");
                
            }System.out.println(" ");
        }
    }
            
}
