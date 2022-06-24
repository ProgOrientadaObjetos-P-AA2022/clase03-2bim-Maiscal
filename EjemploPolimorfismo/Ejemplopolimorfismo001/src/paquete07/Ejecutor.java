/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete07;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class Ejecutor {
    public static void main(String[] args) {
        /*
        clase uno abstracta llamada Figura; con atributos:
        características y área; la clase debe tener un método
        abstracto calcular_area.
        - clase llamada Triángulo (hereda de Figura); con
        atributos: base y altura.
        - clase llamada Rombo (hereda de Figura) con atributo: diagonal_menor y 
        diagonal mayor.
        - clase llamada Cuadrado (hereda Figura) con: atributos: lado.
        - clase Ejecutor, que permite generar:
            4 objetos de tipo Cuadrado
            3 objetos de tipo Rombo
            5 objeto de Triángulo 
            Comprobar el concepto del polimorfismo.
        */
        
        // inicio de la solución

        Cuadrado c1 = new Cuadrado(45);
        Cuadrado c2 = new Cuadrado(50);
        Cuadrado c3 = new Cuadrado(25);
        Cuadrado c4 = new Cuadrado(35);
        
        Rombo r1 = new Rombo(3.5, 5.5);
        Rombo r2 = new Rombo(22.6, 30);
        Rombo r3 = new Rombo(10.5, 15);
        
        Triangulo t1 = new Triangulo(50, 10);
        Triangulo t2 = new Triangulo(20, 15.6);
        Triangulo t3 = new Triangulo(25, 60.1);
        Triangulo t4 = new Triangulo(5.9, 9.5);
        Triangulo t5 = new Triangulo(6.66,9.45);
        
        ArrayList<Figura> figuras = new ArrayList<>();
        
        
        
        // proceso para comprobar el polimorfismo
        for (int i = 0; i < figuras.size(); i++) {
            // 1.  
            figuras.get(i).calcularArea();
            
            System.out.printf("Datos de Figura\n"
                        + "%s\n",                        
                  figuras.get(i));
        }
    }
}
