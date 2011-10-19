/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package p640.herencia;


/**
 *
 * @author Gotcha
 */
public class Trabajador {
    protected int codigo;
    protected String nombre;
    protected char genero;
    protected static double TASA_RAP = 0.035;
    
    public Trabajador(int c,String n,char g){
        codigo = c;
        nombre = n;
        genero = g;
    }
 
}
