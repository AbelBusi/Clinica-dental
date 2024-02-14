package logica;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Paciente extends Persona implements Serializable {

    //private int id_paciente;
    private String razonSocial;
    private int tipoSangre;

    @OneToOne
    private Responsable unResponsable;
    @OneToMany(mappedBy = "pacien")
    private List<Turno> listaTurno;

    public Paciente() {
    }

    public Paciente(String razonSocial, int tipoSangre, Responsable unResponsable, List<Turno> listaTurno, int id_persona, String dni, String nombre, String apellido, Date fecha_nac, String sexo) {
        super(id_persona, dni, nombre, apellido, fecha_nac, sexo);
        this.razonSocial = razonSocial;
        this.tipoSangre = tipoSangre;
        this.unResponsable = unResponsable;
        this.listaTurno = listaTurno;
    }

    public String getRazonSocial() {
        return razonSocial;
    }

    public void setRazonSocial(String razonSocial) {
        this.razonSocial = razonSocial;
    }

    public int getTipoSangre() {
        return tipoSangre;
    }

    public void setTipoSangre(int tipoSangre) {
        this.tipoSangre = tipoSangre;
    }

    public Responsable getUnResponsable() {
        return unResponsable;
    }

    public void setUnResponsable(Responsable unResponsable) {
        this.unResponsable = unResponsable;
    }

    public List<Turno> getListaTurno() {
        return listaTurno;
    }

    public void setListaTurno(List<Turno> listaTurno) {
        this.listaTurno = listaTurno;
    }

}
