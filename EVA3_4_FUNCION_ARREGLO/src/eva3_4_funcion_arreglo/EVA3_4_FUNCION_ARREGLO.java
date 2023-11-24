/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva3_4_funcion_arreglo;

/* @author CARLOSCE
 */
public class EVA3_4_FUNCION_ARREGLO {
    public static void main(String[] args) {
        int[] arreglo;
        //al crear una variable solo existe dentro del bloque donde se creo
        arreglo = crearArreglo(10);
        for (int valor : arreglo) {
            System.out.println("["+ valor + "]");
        }

    }
    
    public static int[] crearArreglo(int tama){
    int[] arreglo = new int[tama];
        for (int i = 0; i < arreglo.length; i++) {
            arreglo[i] = (int)(Math.random() * 100);
        }
        return arreglo;
    }
}
