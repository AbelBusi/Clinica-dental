package servlets;

import cntrlPersis.controladora;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "SvElimUsuario", urlPatterns = {"/SvElimUsuario"})
public class SvElimUsuario extends HttpServlet {
    
     controladora control = new controladora();

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
      
    }
    
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
    }

   
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        int id = Integer.parseInt(request.getParameter("id"));
        control.BorrarUsuario(id);
        
        response.sendRedirect("SvUsuario");
    }

  
    @Override
    public String getServletInfo() {
        return "Short description";
    }

}
