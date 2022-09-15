package borrador.pg5;

import java.util.List;

import borrador.pg5.controlador.EstudiantesController;
import borrador.pg5.modelo.Estudiantes;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );    
        
        /* List<Estudiantes> estudiante = new EstudiantesController().obtenerXid("001"); 
        for (int i = 0; i < estudiante.size(); i++) {
            System.out.println(estudiante.get(i));
        } */

        Estudiantes estudiante = new EstudiantesController().getXid("001"); 
        
        System.out.println(estudiante.toString());
        

        

    }
}
