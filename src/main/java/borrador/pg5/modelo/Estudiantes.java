package borrador.pg5.modelo;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Column;


@Entity
@Table(name = "estudiantes")
public class Estudiantes {
    @Id
    @Column(name = "id_estudiante")
    private String idEstudiante;
    private String nombre;
    private String apellido;
    private String celular;
    private String tipo;

    public Estudiantes(){
        
    }
    public Estudiantes(String idEstudiante, String nombre, String apellido, String celular, String tipo) {
        this.idEstudiante = idEstudiante;
        this.nombre = nombre;
        this.apellido = apellido;
        this.celular = celular;
        this.tipo = tipo;
    }
    public String getIdEstudiante() {
        return idEstudiante;
    }
    public void setIdEstudiante(String idEstudiante) {
        this.idEstudiante = idEstudiante;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getApellido() {
        return apellido;
    }
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    public String getCelular() {
        return celular;
    }
    public void setCelular(String celular) {
        this.celular = celular;
    }
    public String getTipo() {
        return tipo;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    @Override
    public String toString() {
        return "Estudiantes [nombre=" + nombre +        
        ", apellido=" + apellido + 
        ", celular=" + celular + 
        ", idEstudiante=" + idEstudiante +        
        ", tipo=" + tipo + "]";
    }

    
    
}
