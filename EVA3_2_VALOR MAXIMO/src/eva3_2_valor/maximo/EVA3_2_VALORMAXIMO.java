/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva3_2_valor.maximo;

import java.util.Scanner;

/*@author CARLOSCE
 */
public class EVA3_2_VALORMAXIMO {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num1, num2;
        System.out.println("Que numeros tienes ?");
        System.out.print("Numero 1:");
        num1 = input.nextInt();
        System.out.println("Numero 2:");
        num2 = input.nextInt();

        System.out.println("El numero mas grande es: " + buscarMAX(num1, num2));
        //guardar el valor para usarlo despues
        int resu = buscarMAX(num1, num2);
        System.out.println(resu); //este metodo le da velocidad al codigo
        
        buscarMAX(num1, num2); //no dara nigun resultado 
    }

    public static int buscarMAX(int num1, int num2) {
        if (num1 > num2) {
            return num1;
        } else {
            return num2;
        }
    }
}
