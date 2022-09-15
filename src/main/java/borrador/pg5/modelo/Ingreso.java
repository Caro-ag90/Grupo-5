package borrador.pg5.modelo;

import java.sql.Date;

public class Ingreso {
    private String idEstudianteIngreso;
    private Date fecha;
    
    public Ingreso(){
        
    }

    public Ingreso(String idEstudianteIngreso, Date fecha) {
        this.idEstudianteIngreso = idEstudianteIngreso;
        this.fecha = fecha;
    }

    public String getIdEstudianteIngreso() {
        return idEstudianteIngreso;
    }

    public void setIdEstudianteIngreso(String idEstudianteIngreso) {
        this.idEstudianteIngreso = idEstudianteIngreso;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    

}
