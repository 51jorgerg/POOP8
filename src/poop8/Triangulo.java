/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poop8;

/**
 * Clase Triangulo
 * @author Rodrigo Ceron 
 */
public class Triangulo extends Poligono {
    
    //Atributos
    private int alfa;
    private int beta;
    private int gama;
    private float a;
    private float b;
    private float c;
    private float base;
    private float altura;

    /**
     * Constructor vacio
     */
    public Triangulo() {
    }

    /**
     * Constructor lleno
     * @param alfa
     * @param beta
     * @param gama
     * @param a
     * @param b
     * @param c
     * @param base
     * @param altura 
     */
    public Triangulo(int alfa, int beta, int gama, float a, float b, float c, float base, float altura) {
        this.alfa = alfa;
        this.beta = beta;
        this.gama = gama;
        this.a = a;
        this.b = b;
        this.c = c;
        this.base = base;
        this.altura = altura;
    }
    
    /**
     * Metodo que devuelve el angulo alfa
     * @return Alfa
     */
    public int getAlfa() {
        return alfa;
    }

    /**
     * Metodo que establece el angulo
     * @param alfa 
     */
    public void setAlfa(int alfa) {
        this.alfa = alfa;
    }

    /**
     * Metodo que devuelve el angulo Beta
     * @return Beta
     */
    public int getBeta() {
        return beta;
    }

    /**
     * Metodo que devuelve el angulo Beta
     * @param beta 
     */
    public void setBeta(int beta) {
        this.beta = beta;
    }

    /**
     * Metodo que devuelve el angulo Gama
     * @return Gama
     */
    public int getGama() {
        return gama;
    }

    /**
     * Metodo que establece Gama
     * @param gama 
     */
    public void setGama(int gama) {
        this.gama = gama;
    }

    /**
     * Metodo que devuelve el lado A
     * @return A
     */
    public float getA() {
        return a;
    }

    /**
     * Metodo que establece el lado A
     * @param a 
     */
    public void setA(float a) {
        this.a = a;
    }

    /**
     * Metodo que devuelve el lado B
     * @return B
     */
    public float getB() {
        return b;
    }

    /**
     * Metodo que establece el lado B
     * @param b 
     */
    public void setB(float b) {
        this.b = b;
    }

    /**
     * Metodo que devuelve el lado C
     * @return C
     */
    public float getC() {
        return c;
    }

    /**
     * Metodo que establece el lado C
     * @param c 
     */
    public void setC(float c) {
        this.c = c;
    }

    /**
     * Metodo que devuelve la base
     * @return base
     */
    public float getBase() {
        return base;
    }

    /**
     * Metodo que establece la base
     * @param base 
     */
    public void setBase(float base) {
        this.base = base;
    }

    /**
     * Metodo que devuelve la altura
     * @return altura
     */
    public float getAltura() {
        return altura;
    }

    /**
     * Metodo que establece la altura
     * @param altura 
     */
    public void setAltura(float altura) {
        this.altura = altura;
    }
    
    /**
     * Metodo que calcula y devuelve el area
     * @return area
     */
    @Override
    public float area(){
        return (base*altura)/2;
    }
    
    /**
     * Metodo que calcula y devuelve el perimetro
     * @return perimetro
     */
    @Override
    public float perimetro(){
        return a+b+c;
    }
    
    /**
     * Metodo que parsea un triangulo a una cadena
     * @return String
     */
    @Override
    public String toString() {
        return "Triangulo{" + "alfa=" + alfa + ", beta=" + beta + ", gama=" + gama + ", a=" + a + ", b=" + b + ", c=" + c + ", base=" + base + ", altura=" + altura + '}';
    }

}

