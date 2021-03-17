/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio8_java;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Victor Rosario
 */
public class Ejercicio8_Java {

   
    public static void main(String[] args) {
        
        Scanner read = new Scanner(System.in);
        
        ArrayList<Password> passwordArray = new ArrayList();
        int[] longitudes;
        boolean[] esFuerte;
        int numPasswords;
        
        System.out.print("\n* Cuantos passwords desea ingresar: ");
        numPasswords = read.nextInt();
        
        longitudes = new int[numPasswords];
        esFuerte = new boolean[numPasswords];
                
        for(int i = 0; i<longitudes.length; i++){
            System.out.print("\n Ingrese la longitud para el password numero [" + (i+1) + "]: ");
            longitudes[i] = read.nextInt();
            
            Password password = new Password(longitudes[i]);//creando el objeto pasandole por el constructor la longitud introducida
            passwordArray.add(password); //agregando el objeto al array de passwords
            
            esFuerte[i] = password.esFuerte(); //agregando el valor booleano al array que contiene la informacion acerca de si el password del objeto actual es fuerte
        }
        
       for(int j = 0; j < longitudes.length; j++){
           System.out.println("\n\t=> Contrasenia[" + j +"]: "+ passwordArray.get(j).getPassword() + ", Es fuerte: " + esFuerte[j]);
       }
    }  
}
