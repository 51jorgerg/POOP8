/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package poop8;

/**
 * Clase principal
 * @author Rodrigo Ceron 
 */
public class POOP8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Triangulo
        System.out.println("### Triangulo ###");
        Poligono poligono1 = new Triangulo();
        Triangulo triangulo1 = new Triangulo(60,60,60,5,5,5,5,5);
        //Metodos de triangulo
        System.out.println(triangulo1);
        System.out.println( "Area =  "+ triangulo1.area());
        System.out.println("Perimetro = "+ triangulo1.perimetro());
        
        //Cuadrilatero
        System.out.println("### Cuadrilatero ###");
        Cuadrilatero cuadrilatero1 = new Cuadrilatero(90,90,5,5,5,5,5,5);
        //Metodos de cuadrilatero
        System.out.println(cuadrilatero1);
        System.out.println( "Area =  "+cuadrilatero1.area());
        System.out.println("Perimetro = "+cuadrilatero1.perimetro());
        
        //Referenciar un objeto mediante otro
        Poligono poligono2 = new Cuadrilatero();
        Triangulo triangulo2 = new Triangulo();
        System.out.println(triangulo2);
        poligono2 = triangulo2;
        System.out.println(poligono2);
        
        //Referenciar un objeto mediante otro
        Cuadrilatero cuadrilatero2 = new Cuadrilatero();
        System.out.println(cuadrilatero2);
        Object object1 = new Object();
        object1 = cuadrilatero2;
        System.out.println(object1);
        
        System.out.println("### Funcion identificar figuras ###");
        //Identificar el tipo de clase para poligono y poligono2
        identificarFiguras(poligono1);
        identificarFiguras(poligono2);
        
        //Flauta
        System.out.println("### Flauta ###");
        Flauta flauta = new Flauta();
        //Metodos de flauta
        flauta.tocar();
        flauta.afinar();
        flauta.tipodeInstrumento();
        
        //Ejemplo de una Interfaz
        System.out.println("### Interfaz math ###");
        System.out.println(Math.PI);
        
        //Uso de la interfaz Meses
        System.out.println("### Interfaz meses ###");
        System.out.println(Meses.UNO);
        System.out.println(Meses.MESES[Meses.TRES]);
        
    }
    
    /**
     * Funcion que identifica e imprime el tipo de clase de un poligono
     * @param poligono 
     */
    public static void identificarFiguras(Poligono poligono){
        if (poligono instanceof Triangulo) {
            System.out.println("Instancia de Triangulo");
        }
        else if (poligono instanceof Cuadrilatero){
            System.out.println("Instancia de Cuadrilatero");
        }
        else {
                System.out.println("Instancia de Poligono");
        }
            
    }
}
