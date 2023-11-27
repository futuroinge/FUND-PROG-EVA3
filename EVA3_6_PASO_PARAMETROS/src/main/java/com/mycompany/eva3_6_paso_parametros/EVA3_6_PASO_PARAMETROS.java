/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva3_6_paso_parametros;

/**
 *
 * @author carlosce
 */
public class EVA3_6_PASO_PARAMETROS {

    public static void main(String[] args) {
        int x = 5;
        System.out.println("EL valor de x en el main() es de " + x);
        pasoPorValor(x);
        System.out.println("El valor de x en el main() despues de la llamada es " + x);
    }
    
    //paso por valor de arguimentos, se envia una copa al metodo( es un duplicado)
    
    public static void pasoPorValor(int valor){
        System.out.println("El valor que recibo en el metodo es de " + valor);
        valor++;
        System.out.println("El valor que modifico en el metodo es de " + valor);
    }
    
    
}
