/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva3_3_factorial;

/*@author CARLOSCE
 */
public class EVA3_3_FACTORIAL {
    public static void main(String[] args) {
        int valor = 5;
        System.out.println("Factorial de 5 = " + calcularFAC(valor));
        //CREAR METODO CALCULAR POTENCIA --> ( INT BASE, INT POTENCIA) ---> INT
        System.out.println("Potencia de 5 elevado a la 5 " + calcularPotencia(5,5));
    }
    
    public static int calcularFAC(int valor){
        int guardar = 1;
        for (int i = 1; i <= valor; i++) {
            guardar *= i; // guardar = guardar * i
        }
        return guardar;
    }
    
    public static int calcularPotencia(int base, int potencia){
        int save = 1;
        for (int i = 1; i <= potencia ; i++) {
            save = base *save;
        }
        return save;
    }
    
}
