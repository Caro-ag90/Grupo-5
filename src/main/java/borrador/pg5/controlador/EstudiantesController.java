package borrador.pg5.controlador;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import borrador.pg5.modelo.Estudiantes;

@RestController
@RequestMapping("/estudiantes")
public class EstudiantesController {
    private SessionFactory factory;
    
    public EstudiantesController() {
        factory = new Configuration().configure("cfg.xml").addAnnotatedClass(Estudiantes.class).buildSessionFactory();

    }

    public Session openSession() {
        Session session = factory.openSession();
        session.beginTransaction();
        return session;
      }      
@GetMapping     
public List<Estudiantes> obtenerEstudiantes(){
    List<Estudiantes> mascotas = new ArrayList<>();    
    Session session = openSession();
    try {
      mascotas = session.createQuery("from Estudiantes", Estudiantes.class).list();
    } catch (Exception e) {
      e.printStackTrace();
      
    }
    session.close();
    return mascotas;
}

public List<Estudiantes> obtenerXid(String id){
        List<Estudiantes> mascotas = new ArrayList<>();    
        Session session = openSession();
        try {
          mascotas = session.createQuery("from Estudiantes where idEstudiante = :param_id", Estudiantes.class).setParameter("param_id", id).list();
        } catch (Exception e) {
          e.printStackTrace();
          
        }
        session.close();
        return mascotas;
      }

      public Estudiantes getXid(String id){
        Estudiantes estu = new Estudiantes();    
        Session session = openSession();
        try {
          estu = session.createQuery("from Estudiantes where idEstudiante = :param_id", Estudiantes.class).setParameter("param_id", id).getSingleResult();
        } catch (Exception e) {
          e.printStackTrace();
          
        }
        session.close();
        return estu;
      }
    

    
}
