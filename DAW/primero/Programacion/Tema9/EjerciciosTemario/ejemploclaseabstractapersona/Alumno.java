/*
 * Clase Alumno.
 */
package ejemploclaseabstractapersona;

import java.util.*;
import java.text.*;

/**
 *
 * Clase Alumno
 */
public class Alumno extends Persona  {
        protected String grupo;
        protected double notaMedia; 
    
        
        // Constructor
        // -----------
        public Alumno (String nombre, String apellidos, GregorianCalendar fechaNacim, String grupo, double notaMedia) {
            super (nombre, apellidos, fechaNacim);
            this.grupo= grupo;
            this.notaMedia= notaMedia;            
        }
        
        
        // Método getGrupo
        public String getGrupo (){
            return grupo;
        }

        // Método getNotaMedia
        public double getNotaMedia (){
            return notaMedia;
        }



        // Método setGrupo
        public void setGrupo (String grupo){
            this.grupo= grupo;
        }
        
        // Método setNotaMedia
        public void setNotaMedia (double notaMedia){
            this.notaMedia= notaMedia;
        }
              
        // Redefinición de métodos abstractos heredados
        @Override
        public void mostrar () {
            SimpleDateFormat formatoFecha = new SimpleDateFormat("dd/MM/yyyy");
            String Stringfecha= formatoFecha.format(this.fechaNacim.getTime());

            System.out.printf ("Nombre: %s\n", this.nombre);
            System.out.printf ("Apellidos: %s\n", this.apellidos);
            System.out.printf ("Fecha de nacimiento: %s\n", Stringfecha);
            System.out.printf ("Grupo: %s\n", this.grupo);
            System.out.printf ("Nota media: %5.2f\n", this.notaMedia);            
        }
}
