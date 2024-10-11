/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poop8;

/**
 * Clase Flauta dependiente de instrumento de viento
 * @author Rodrigo Ceron 
 */
public class Flauta extends instrumentoDeViento {

    /**
     * Constructor vacio
     */
    public Flauta() {
    }
    
    /**
     * Metodo que toca la flauta
     */
    public void tocar(){
        System.out.println("Tocando Flauta");
    }
    
    /**
     * Metodo que devuelve el tipo de instrumento
     * @return String
     */
    @Override 
    public String tipodeInstrumento() {
        System.out.println("Flauta");
        return "Flauta";
    }
    
    /**
     * Metodo que afina la flauta
     */
    @Override 
    public void afinar() {
        System.out.println("Afinando Flauta");
    } 

    /**
     * Metodo que parsea una flauta a una cadena
     * @return String
     */
    @Override
    public String toString() {  
        return "Flauta{" + '}';
    }

}
