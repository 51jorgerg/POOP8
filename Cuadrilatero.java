/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poop8;

/**
 * Clase Cuadrilatero
 * @author Rodrigo Ceron 
 */
public class Cuadrilatero extends Poligono {
    //Atributos
    private int alfa;
    private int beta;
    private float a;
    private float b;
    private float c;
    private float d;
    private float base;
    private float altura;

    /**
     * Constructor vacio
     */
    public Cuadrilatero() {
    }

    /**
     * Constructor lleno
     * @param alfa
     * @param beta
     * @param a
     * @param b
     * @param c
     * @param d
     * @param base
     * @param altura 
     */
    public Cuadrilatero(int alfa, int beta, float a, float b, float c, float d, float base, float altura) {
        this.alfa = alfa;
        this.beta = beta;
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
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
     * Metodo que devuelve el lado D
     * @return D
     */
    public float getD() {
        return d;
    }

    /**
     * Metodo que establece el lado D
     * @param d 
     */
    public void setD(float d) {
        this.d = d;
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
     * Metodo que calcula y devuelve el perimetro
     * @return perimetro
     */
    @Override
    public float perimetro() {
        return a+b+c+d; // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    /**
     * Metodo que calcula y devuelve el area
     * @return area
     */
    @Override
    public float area() {
        return base*altura; // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    /**
     * Metodo que parsea un cuadrilatero a una cadena
     * @return String
     */
    @Override
    public String toString() {
        return "Cuadrilatero{" + "alfa=" + alfa + ", beta=" + beta + ", a=" + a + ", b=" + b + ", c=" + c + ", d=" + d + ", base=" + base + ", altura=" + altura + '}';
    }
}
