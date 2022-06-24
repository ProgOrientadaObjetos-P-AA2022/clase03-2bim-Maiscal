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
public class Rombo extends Figura{
    private double diagonal_menor;
    private double diagonal_mayor;

    public Rombo(double dmenor, double dmayor) {
        diagonal_menor = dmenor;
        diagonal_mayor = dmayor;
    }
    
    public void establecerDiagonal_menor(double mn){
        diagonal_menor = mn;
    }
    public void establecerDiagonal_mayor(double my){
        diagonal_mayor = my;
    }
    @Override
    public void calcularArea(){
        area = (diagonal_mayor * diagonal_menor) / 2;
    }
    
    public double obtenerDiagonalMenor(){
        return diagonal_menor;
    }
    public double obtenerDiagonalMayor(){
        return diagonal_mayor;
    }
}
