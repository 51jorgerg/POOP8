/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poop8;

/**
 * Clase Instrumento de viento dependiente de Instrumento musical
 * @author Rodrigo Ceron 
 */
public class instrumentoDeViento extends Object implements instrumentoMusical {

    /**
     * Constructor vacio
     */
    public instrumentoDeViento() {
    }
    
    /**
     * Metodo que que hace tocar al instrumento
     */
    @Override
    public void tocar() {
        System.out.println("Tocando Instrumento Musical");
    }
    
    /**
     * Metodo que devuelve el tipo de instrumento
     * @return String
     */
    @Override
    public String tipodeInstrumento() {
        System.out.println("Musical");
        return "musical";
    }

    /**
     * Metodo que afina el instrumento
     */
    @Override
    public void afinar() {
        System.out.println("Afinado");
    }

    /**
     * Metodo que parsea el instrumento a una cadena
     * @return String
     */
    @Override
    public String toString() {
        return "instrumentoDeViento{" + '}';
    }
    
}
