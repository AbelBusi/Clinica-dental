package servlets;

import cntrlPersis.controladora;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet(name = "SvAgregarResponsable", urlPatterns = {"/SvAgregarResponsable"})
public class SvAgregarResponsable extends HttpServlet {

    controladora control = new controladora();

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        HttpSession miSession = request.getSession();

        response.sendRedirect("index.jsp");

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.sendRedirect("AgregarResponsable.jsp");
        String nombreRes = request.getParameter("nombre");
        String apellidoRes = request.getParameter("apellido");
        String dniRes = request.getParameter("dni");
        String sexoRes = request.getParameter("sexo");
        String fechaRespon = request.getParameter("fecha_naci");
        // Convertir la fecha de cadena a Date
        Date fecha = null;

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        try {
            fecha = sdf.parse(fechaRespon);
        } catch (ParseException ex) {
            Logger.getLogger(SvAgregarResponsable.class.getName()).log(Level.SEVERE, null, ex);
        }

        String responsaRes = request.getParameter("responsabilidad");

        control.crearResponsable(nombreRes, apellidoRes, dniRes, sexoRes, fecha, responsaRes);

        
        

    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }

}
