/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete07;

/**
 *
 * @author reroes
 */
public class Cuadrado extends Figura {

    private double lado;

    public Cuadrado(double la){
        lado = la;
    }

    public void establecerLado(double l) {
        lado = l;
    }

    @Override
    public void calcularArea() {
        area = lado * lado;
    }

    public double obtenerLado() {
        return lado;
    }
}
