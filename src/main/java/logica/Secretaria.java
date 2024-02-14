package logica;

import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.OneToOne;

@Entity
public class Secretaria extends Persona {

    //private int id_secretaria;
    private String sector;
    @OneToOne
    private Usuario unUsuario;

    public Secretaria(String sector, Usuario unUsuario, int id_persona, String dni, String nombre, String apellido, Date fecha_nac, String sexo) {
        super(id_persona, dni, nombre, apellido, fecha_nac, sexo);
        this.sector = sector;
        this.unUsuario = unUsuario;
    }

    public Secretaria() {
    }

    public Usuario getUnUsuario() {
        return unUsuario;
    }

    public void setUnUsuario(Usuario unUsuario) {
        this.unUsuario = unUsuario;
    }

    public String getSector() {
        return sector;
    }

    public void setSector(String sector) {
        this.sector = sector;
    }

}
