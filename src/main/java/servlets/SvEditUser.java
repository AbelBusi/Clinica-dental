package servlets;

import cntrlPersis.controladora;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import logica.Usuario;

@WebServlet(name = "SvEditUser", urlPatterns = {"/SvEditUser"})
public class SvEditUser extends HttpServlet {
    
    
    
    controladora control= new controladora();

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        int id = Integer.parseInt(request.getParameter("id"));
        Usuario user = control.traerUsuario(id);
        
        HttpSession missSession=request.getSession();
        
        missSession.setAttribute("editarUser", user);
        
        response.sendRedirect("EditarUsuario.jsp");
        
        System.out.println("hola"+missSession.getId());
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        String nombreUse = request.getParameter("nombreusu");
        String passUse = request.getParameter("password");
        String rolUse = request.getParameter("roles");
        
        Usuario usu = (Usuario) request.getSession().getAttribute("editarUser");
        
        usu.setUsuario(nombreUse);
        usu.setPassword(passUse);
        usu.setRol(rolUse);
        
        control.editarUsuario(usu);
        
        response.sendRedirect("SvUsuario");
        
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }

}
