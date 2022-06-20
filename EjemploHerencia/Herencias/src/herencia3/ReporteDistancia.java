/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencia3;

import java.util.ArrayList;

public class ReporteDistancia extends Reporte{
    
    private ArrayList<EstudianteDistancia> lista;
    private double totalMatriculaDistancia;
    
    public ReporteDistancia(String nombre, String carrera, String ciclo){
        super(nombre, carrera, ciclo);
    }
    
    public void establecerLista(ArrayList<EstudianteDistancia> listado){
        lista = listado;
    }
    
    public void establecerTotalMatriculasDistancia(){
        
        for (int i = 0; i < lista.size(); i++) {
            totalMatriculaDistancia = totalMatriculaDistancia + 
                    lista.get(i).obtenerMatriculaDistancia();
        }
    }
    
    public ArrayList<EstudianteDistancia> obtenerLista(){
        return lista;
    }
    
    public double obtenerTotalMatriculasDistancia(){
        return totalMatriculaDistancia;
    }
    
    @Override
    public String toString(){
        
        String cadena1 = "";
        String cadena;
        
        /*for (int i = 0; i < lista.size(); i++) {
            cadena1 = String.format("%s\nNombre: %s\n"
                    + "Apellidos: %s\n"
                    + "Identificación: %s\n"
                    + "Edad: %d\n"
                    + "Costo Asignatura: %.2f\n"
                    + "Numero de Asignatura: %d\n"
                    + "Total Matricula: %.2f\n"
                    ,cadena1
                    ,obtenerLista().get(i).obtenerNombresEstudiante()
                    ,obtenerLista().get(i).obtenerApellidoEstudiante()
                    ,obtenerLista().get(i).obtenerIdentificacionEstudiante()
                    ,obtenerLista().get(i).obtenerEdadEstudiante()
                    ,obtenerLista().get(i).obtenerCostoAsignatura()
                    ,obtenerLista().get(i).obtenerNumeroAsignaturas()
                    ,obtenerLista().get(i).obtenerMatriculaDistancia()
            );
        }*/
        for (int i = 0; i < lista.size(); i++) {
            cadena1 = String.format("%s%s\n"
                    ,cadena1,lista.get(i)
            );
        }
        
        cadena = String.format("%s\nCarrera: %s \n"
                + "Ciclo: %s\n\n"
                + "Lista de Estudiantes\n\n%s\n"
                + "El total de matriculas es: %.2f\n", 
                nombre,
                carrera,
                ciclo,
                cadena1,
                obtenerTotalMatriculasDistancia());
        return cadena;
    }
    
}
