/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poop8;

/**
 * Clase abstracta poligono
 * @author Rodrigo Ceron 
 */
public abstract class Poligono {
    //Atributos
    public abstract float area();
    public abstract float perimetro();
    
    /**
     * Metodo que parsea un poligono a una cadena
     * @return String
     */
    @Override
    public String toString() {
        return "Poligono{" + '}';
    }
    
}
