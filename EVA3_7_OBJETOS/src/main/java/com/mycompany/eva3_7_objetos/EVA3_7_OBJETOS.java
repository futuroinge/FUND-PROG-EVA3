/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva3_7_objetos;

/*
 * @author carlosce
 */
public class EVA3_7_OBJETOS {

    public static void main(String[] args) {
        //una plantilla sirve para crear multiples obj semejantes
        //como tal la plantilla no existe, el resultado si
        //una clase es una plantilla 
        //son codigo que no funciona
        
        Persona perso1= new Persona();
        System.out.println(perso1);
        perso1.apellido = "Juan";
        perso1.edad = 20;
        perso1.nombre = "Perez";
        imprimirPersonas(perso1);
        
        Persona perso2 = new Persona();
        perso2.apellido = "Carlos";
        perso2.edad = 30;
        perso2.nombre = "Santana";
        //System.out.println(perso2);
        imprimirPersonas(perso2);
        
    }
    
    public static void imprimirPersonas(Persona perso){
        System.out.println("Direccion: "+ perso);
        System.out.println("Nombre : " + perso.nombre + " "+ perso.apellido);
        System.out.println("Edad: " + perso.edad);
    
    }
}

//definen una plantilla para crear objetos 
//crean un nuevo tipo de dato
class Persona{
    String nombre;
    String apellido;
    int edad;

}