package cntrlPersis;

import java.util.Date;
import java.util.List;
import logica.Responsable;
import logica.Usuario;

public class controladora {

    ControladoraPersistencia controlPersis = new ControladoraPersistencia();

    public void CrearUsuario(String usuario, String password, String rol) {

        Usuario usua = new Usuario();

        usua.setUsuario(usuario);
        usua.setPassword(password);
        usua.setRol(rol);
        controlPersis.CrearUsuario(usua);

    }

    public List<Usuario> getUsuario() {

        return controlPersis.getUsuarios();

    }

    public void BorrarUsuario(int id) {

        controlPersis.borrarUser(id);

    }

    public Usuario traerUsuario(int id) {

        return controlPersis.traerUsuario(id);

    }

    public void editarUsuario(Usuario usu) {

        controlPersis.editarUsuario(usu);

    }

    public void crearResponsable(String nombre, String apellido, String dni, String sexo, Date fecha, String responsable ) {

        Responsable res = new Responsable();
        res.setNombre(nombre);
        res.setApellido(apellido);
        res.setDni(dni);
        res.setSexo(sexo);
        res.setFecha_nac(fecha);
        res.setTipo_respon(responsable);
        controlPersis.crearResposable(res);

    }

}
