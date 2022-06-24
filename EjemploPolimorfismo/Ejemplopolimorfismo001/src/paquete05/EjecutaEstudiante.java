
package paquete05;

import java.util.ArrayList;
import java.util.Scanner;
import paquete04.*;

public class EjecutaEstudiante {

    public static void main(String[] args) {

        /*
        Generar un proceso que permita ingresar n número 
        de docentes. 
        El usuario decide de manera prevía cuantos objetos
        de tipo EstudiantePresencial y EstudianteDistancia
        quiere ingresar.
        
        */
        Scanner sc = new Scanner(System.in);
        
        String nombresEst;
        String apellidosEst;
        String identificacionEst;
        int edadEst;
        
        double costoCred;
        int numeroCreds;
        
        double costoAsig;
        int numeroAsigs;
        
        int tipoEstudiante;
        
        String salir;
        
        ArrayList<Estudiante> estudiantes = new ArrayList<>();
        
        // inicio de solución
        
        do {            
            System.out.println("Tipo de Estudiante a registrar..\n"
                    + "Estudiante Presencial     [1]\n"
                    + "Estudiante Distancia      [2]"); 
            tipoEstudiante = Integer.parseInt(sc.nextLine());
            
            System.out.println("Ingrese el nombre del estudiante");
            nombresEst = sc.nextLine();
            System.out.println("Ingrese el apellido del estudiante");
            apellidosEst = sc.nextLine();
            System.out.println("Ingrese la identificacion del estudiante");
            identificacionEst = sc.nextLine();
            System.out.println("Ingrese la edad del estudiante");
            edadEst = Integer.parseInt(sc.nextLine());
            
            if(tipoEstudiante == 1){
                EstudiantePresencial estP = new EstudiantePresencial();
                System.out.println("Ingrese el número de créditos");
                numeroCreds = Integer.parseInt(sc.nextLine());
                System.out.println("Ingrese el costo de cada créditos");
                costoCred = Double.parseDouble(sc.nextLine());
                
                estP.establecerNombresEstudiante(nombresEst);
                estP.establecerApellidoEstudiante(apellidosEst);
                estP.establecerIdentificacionEstudiante(identificacionEst);
                estP.establecerEdadEstudiante(edadEst);
                estP.establecerNumeroCreditos(numeroCreds);
                estP.establecerCostoCredito(costoCred);
                
                estudiantes.add(estP);
            } else{
                if(tipoEstudiante == 2){
                    EstudianteDistancia estD = new EstudianteDistancia();
                    
                    System.out.println("Ingrese el número de asignaturas");
                    numeroAsigs = Integer.parseInt(sc.nextLine());
                    System.out.println("Ingrese el costo de cada cada asignatura");
                    costoAsig = Double.parseDouble(sc.nextLine());
                    
                    estD.establecerNombresEstudiante(nombresEst);
                    estD.establecerApellidoEstudiante(apellidosEst);
                    estD.establecerIdentificacionEstudiante(identificacionEst);
                    estD.establecerEdadEstudiante(edadEst);
                    estD.establecerNumeroAsginaturas(numeroAsigs);
                    estD.establecerCostoAsignatura(costoAsig);
                    
                    estudiantes.add(estD);
                }else
                    System.out.println("Fuera de rango....");
            }
            
            System.out.println("Si desea seguir agragando otro estudiante."
                    + "Dijite la letra 'S' para continuar o dijite otra letra"
                    + " para salir del programa.");
            salir = sc.nextLine();
        } while (salir.equals("S"));
        
        EstudianteDistancia estD = new EstudianteDistancia();
        
        
        
        // ciclo que permite comprobar el polimorfismo
        // este código no debe ser modificado.
        for (int i = 0; i < estudiantes.size(); i++) {
            estudiantes.get(i).calcularMatricula();
            
            System.out.printf("Datos Estudiante\n%s\n",                        
                  estudiantes.get(i));
        }
    }

}