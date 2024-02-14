package cntrlPersis;

import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import logica.Responsable;
import logica.Usuario;
import persistencia.HorarioJpaController;
import persistencia.OdontologoJpaController;
import persistencia.PacienteJpaController;
import persistencia.PersonaJpaController;
import persistencia.ResponsableJpaController;
import persistencia.SecretariaJpaController;
import persistencia.TurnoJpaController;
import persistencia.UsuarioJpaController;
import persistencia.exceptions.NonexistentEntityException;

/**
 *
 * @author cesar
 */
public class ControladoraPersistencia {

    HorarioJpaController horaJPA = new HorarioJpaController();
    OdontologoJpaController odontoJPA = new OdontologoJpaController();
    PacienteJpaController pacienteJPA = new PacienteJpaController();
    PersonaJpaController personaJPA = new PersonaJpaController();
    SecretariaJpaController secretariaJPA = new SecretariaJpaController();
    TurnoJpaController turnoJPA = new TurnoJpaController();
    UsuarioJpaController usuarioJPA = new UsuarioJpaController();
    ResponsableJpaController responsableJPA = new ResponsableJpaController();

    public void CrearUsuario(Usuario usua) {
        
        usuarioJPA.create(usua);

    }

    public List<Usuario> getUsuarios() {
        
        return usuarioJPA.findUsuarioEntities();
        
    }


    public void borrarUser(int id) {
        
        try {
            usuarioJPA.destroy(id);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }

    public Usuario traerUsuario(int id) {
        
        return usuarioJPA.findUsuario(id);
        
    }

    public void editarUsuario(Usuario usu) {
        
        try {
            usuarioJPA.edit(usu);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void crearResposable(Responsable respon) {
        
       responsableJPA.create(respon);
    
        
    }

}
