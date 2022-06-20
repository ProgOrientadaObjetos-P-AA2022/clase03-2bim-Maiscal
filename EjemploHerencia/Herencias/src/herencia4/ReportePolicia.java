/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencia4;

import herencia2.Policia;
import java.util.ArrayList;

/**
 *
 * @author reroes
 */
public class ReportePolicia extends Reporte {

    double promedioEdades;
    ArrayList<Policia> lista;

    public ReportePolicia(String c) {
        super(c);
    }

    public void establecerPromedioEdades() {
        double suma = 0;
        for (int i = 0; i < lista.size(); i++) {
            suma = suma + lista.get(i).getEdad();
        }
        promedioEdades = suma / lista.size();
    }

    public void establecerLista(ArrayList<Policia> p) {
        lista = p;
    }

    public double obtenerPromedioEdad() {
        return promedioEdades;
    }

    public ArrayList<Policia> obtenerLista() {
        return lista;
    }

    @Override
    public String toString() {
        String cadena = "";
        
        for(int i = 0; i < lista.size();i++){
            cadena = String.format("%s%s\n"
                    ,cadena,lista.get(i)
            );
        }
        
        String c = String.format("Codigo: %s\n"
                + "Lista de Policias\n%s\n"
                + "Promedio de edades: %.2f\n"
                ,codigo
                ,cadena
                ,obtenerPromedioEdad()
        );
        return c;
    }
}
