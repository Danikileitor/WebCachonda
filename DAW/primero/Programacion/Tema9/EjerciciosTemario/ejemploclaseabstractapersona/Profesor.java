/*
 * Clase Profesor
 */
package ejemploclaseabstractapersona;

/**

 */
import java.util.*;
import java.text.*;

/**
 *
 * Clase Profesor
 */
public class Profesor extends Persona {
	String especialidad;
	double salario; 
        
        // Constructor
        // -----------

        public Profesor (String nombre, String apellidos, GregorianCalendar fechaNacim, String especialidad, double salario) {
            super (nombre, apellidos, fechaNacim);
            this.especialidad= especialidad;
            this.salario= salario;            
        }
        
        
        // Método getEspecialidad
        public String getEspecialidad (){
            return especialidad;
        }

        // Método getSalario
        public double getSalario (){
            return salario;
        }


        // Método setSalario
        public void setSalario (double salario){
            this.salario= salario;
        }
        
        // Método setESpecialidad
        public void setESpecialidad (String especialidad){
            this.especialidad= especialidad;
        }
        
        // Redefinición de métodos abstractos heredados
        @Override
        public void mostrar () {
            SimpleDateFormat formatoFecha = new SimpleDateFormat("dd/MM/yyyy");
            String Stringfecha= formatoFecha.format(this.fechaNacim.getTime());

            System.out.printf ("Nombre: %s\n", this.nombre);
            System.out.printf ("Apellidos: %s\n", this.apellidos);
            System.out.printf ("Fecha de nacimiento: %s\n", Stringfecha);
            System.out.printf ("Especialidad: %s\n", this.especialidad);
            System.out.printf ("Salario: %7.2f euros\n", this.salario);                   
        }
}

