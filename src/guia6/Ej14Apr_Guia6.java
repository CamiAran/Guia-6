/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package guia6;

import java.util.Scanner;

/**
 *
 * @author camia Crea una aplicación que a través de una función nos convierta
 * una cantidad de euros introducida por teclado a otra moneda, estas pueden ser
 * a dólares, yenes o libras. La función tendrá como parámetros, la cantidad de
 * euros y la moneda a converir que será una cadena, este no devolverá ningún
 * valor y mostrará un mensaje indicando el cambio (void). El cambio de divisas
 * es: 0.86 libras es un 1 € 1.28611 $ es un 1 € 129.852 yenes es un 1 €
 */
public class Ej14Apr_Guia6 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        double eur;
        int opcion;

        String tipomoneda;

        tipomoneda = " ";

      
        System.out.println("Ingrese la cantidad de euros");
        eur = leer.nextInt();

        do {
            System.out.println("Seleccione la moneda:");
            System.out.println("1. Libra");
            System.out.println("2. Dólares");
            System.out.println("3. Yenes");

            opcion = leer.nextInt();

            switch (opcion) {
                case 1:
                    tipomoneda = "Libra";
                    break;
                case 2:
                    tipomoneda = "Dolares";
                    break;
                case 3:
                    tipomoneda = "Yenes";
                    break;
                default:
                    System.out.println("Lea bien las intrucciones");
            }

        } while (opcion!=1&&opcion!=2&&opcion!=3);
        convertir(tipomoneda,eur);
        
    
                
    }
    public static void convertir (String tipomoneda, double eur){
        if (tipomoneda=="Libra"){
            eur= eur * 0.86;
            
        } if(tipomoneda=="Dolares"){
            eur= eur *1.28611;
           
        } if(tipomoneda=="Yenes") { 
            eur = eur *129.852;
        }
        System.out.println("El cambio realizado equivale a "+ eur + " "+ tipomoneda);
    }
}
