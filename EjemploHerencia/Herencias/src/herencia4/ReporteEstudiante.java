/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencia4;

import java.util.ArrayList;
import herencia2.Estudiante;

/**
 *
 * @author reroes
 */
public class ReporteEstudiante extends Reporte {

    double promedioMatriculas;
    ArrayList<Estudiante> lista;

    public ReporteEstudiante(String c) {
        super(c);
    }

    public void establecerPromedioMatricula() {
        double suma = 0;
        for (int i = 0; i < lista.size(); i++) {
            suma = suma + lista.get(i).getMatricula();
        }
        promedioMatriculas = suma / lista.size();
    }

    public void establecerLista(ArrayList<Estudiante> l) {
        lista = l;
    }

    public double obtenerPromedioMatricula() {
        return promedioMatriculas;
    }

    public ArrayList<Estudiante> obtenerLista() {
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
                + "Lista de Estudiantes\n%s\n"
                + "Promedio de Matriculas: %.2f\n"
                ,codigo
                ,cadena
                ,obtenerPromedioMatricula()
        );
        return c;
    }
}
