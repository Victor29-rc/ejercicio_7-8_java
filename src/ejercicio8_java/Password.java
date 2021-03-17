/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio8_java;

import java.util.Random;

/**
 *
 * @author Victor Rosario
 */
public class Password {
    private int longitud = 20;
    private String contrasenia = "";
    
    public Password(){
        
    }
    
    public Password(int longitud){
        this.longitud = longitud; 
        generarPassword();
    }
    
    public boolean esFuerte(){
        int mayusculas = 0;
        int minusculas = 0;
        int numericos = 0;
        
        for(int i = 0; i < contrasenia.length(); i++){
            
            if(Character.isUpperCase(contrasenia.charAt(i)))
                mayusculas++;
            else if(Character.isLowerCase(contrasenia.charAt(i)))
                minusculas++;
            else if(Character.isDigit(contrasenia.charAt(i)))
                numericos++;
        }
        
        if(mayusculas >= 2 && minusculas >= 1 && numericos >= 5)
            return true;
        
        return false;
    }
    
    public void generarPassword(){
        Random random = new Random();
        
        for(int i = 0; i < longitud; i++){           
            String abc = "AaBbCcDdEeFfGgHhIiJjKkLlMmNnOoPpQqRrSsTtUuVvWwXxYyZz12345647890123456789";
            char letter = abc.charAt(random.nextInt(abc.length()));    
            contrasenia += letter;            
        }    
    }
    
    public String getPassword(){
        return contrasenia;
    }
    
    public int getLongitud(){
        return longitud;
    }
    
    public void setLongitud(int longitud){
        this.longitud = longitud;
    }
}
