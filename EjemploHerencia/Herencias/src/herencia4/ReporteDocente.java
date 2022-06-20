/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencia4;

import herencia2.Docente;
import java.util.ArrayList;

/**
 *
 * @author reroes
 */
public class ReporteDocente extends Reporte{
    double promedioSueldos;
    ArrayList<Docente> lista;

    public ReporteDocente(String c) {
        super(c);
    }
    
    public void establecerPromedioSueldos(){
        double suma = 0;
        for(int i = 0; i < lista.size(); i++){
            suma = suma + lista.get(i).getSueldo();
        }
        promedioSueldos = suma / lista.size();
    }
    public void establecerLista(ArrayList<Docente> l){
        lista = l;
    }
    
    public double obtenerPromedioSueldos(){
        return promedioSueldos;
    }
    public ArrayList<Docente> obtenerLista(){
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
                + "Lista de docentes\n%s\n"
                + "Promedio de sueldos: %.2f\n"
                ,codigo
                ,cadena
                ,obtenerPromedioSueldos()
        );
        return c;
    }
}
