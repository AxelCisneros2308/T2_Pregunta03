/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package principal;

import java.util.List;

/**
 *
 * @author cristhian.cisneros
 */
public class Estudiante extends Persona{

  
    private List<Estudiante> estudiantes;
    
    public Estudiante(){
        
    }
    public Estudiante(String nombre, String apellido, String asistencia) {
        super(nombre, apellido, asistencia);
    }

    public List<Estudiante> getEstudiantes() {
        return estudiantes;
    }

    public void setEstudiantes(List<Estudiante> estudiantes) {
        this.estudiantes = estudiantes;
    }
    
    public String getTexto(){
        return this.nombre+ " | " + this.apellido+ " | ";
    }
    
    public void agregarEstudiante(Estudiante estudiante){
        
        if (this.estudiantes!= null &&
                this.estudiantes.size()>=0){
            estudiantes.add(estudiante);
        }
    }
            
}
