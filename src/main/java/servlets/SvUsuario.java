package servlets;

import cntrlPersis.controladora;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import logica.Usuario;

/**
 *
 * @author cesar
 */
@WebServlet(name = "SvUsuario", urlPatterns = {"/SvUsuario"})
public class SvUsuario extends HttpServlet {
    
    controladora control=new controladora();

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        List<Usuario> listaUsuarios = new ArrayList<Usuario>();
        
        listaUsuarios= (List<Usuario>) control.getUsuario();
        
        HttpSession misesion =request.getSession();
        
        misesion.setAttribute("listaUsuarios", listaUsuarios);
        
        System.out.println("hola jijijijjija"+listaUsuarios.get(0));
        
        response.sendRedirect("VerUsuarios.jsp");
        
    }


    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        String nombreUsuario=request.getParameter("nombreusu");
        String userUsuario=request.getParameter("password");
        String passUsuario=request.getParameter("roles");
        
        control.CrearUsuario(nombreUsuario, userUsuario,passUsuario);
        response.sendRedirect("index.jsp");
        
        
    }


    @Override
    public String getServletInfo() {
        return "Short description";
    }

}
