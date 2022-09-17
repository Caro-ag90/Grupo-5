package borrador.pg5.controlador;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import borrador.pg5.modelo.Estudiantes;
import borrador.pg5.servicio.EstudiantesService;

@RestController
@RequestMapping("/estudiantes")
public class EstudiantesController {
  EstudiantesService servicio;    
    
    public EstudiantesController() {
      servicio= new EstudiantesService();

    }

        
@GetMapping     
public List<Estudiantes> obtenerEstudiantes(){
   return servicio.obtenerEstudiantes();
}



@GetMapping("/{id}")  
public Estudiantes getXid(@PathVariable(name="id") String id){
  return servicio.getXid(id);
}     

    
}
