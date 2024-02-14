package logica;

import java.util.Date;
import javax.persistence.Entity;

@Entity
public class Responsable extends Persona {

    //private int id_responsable;
    private String tipo_respon;

    public Responsable(String tipo_respon, int id_persona, String dni, String nombre, String apellido, Date fecha_nac, String sexo) {
        super(id_persona, dni, nombre, apellido, fecha_nac, sexo);
        this.tipo_respon = tipo_respon;
    }

    public Responsable() {
    }

    public String getTipo_respon() {
        return tipo_respon;
    }

    public void setTipo_respon(String tipo_respon) {
        this.tipo_respon = tipo_respon;
    }

}
