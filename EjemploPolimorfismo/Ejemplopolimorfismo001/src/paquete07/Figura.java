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
public abstract class Figura {
    protected String caracteristicas;
    protected double area;

    public void establecerCaracteristicas(String c) {
        caracteristicas = c;
    }

    public abstract void calcularArea();

    public String obtenerCaracteristicas() {
        return caracteristicas;
    }
    public double obtenerCalcularArea() {
        return area;
    }
}
