/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.poli.appcursos.controller;


import co.com.poli.credito.modelo.Usuario;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author giovanny
 */
public class UsuariosServlet extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        HttpSession session = request.getSession();
        RequestDispatcher rd = null;
      //  UsuarioBusinessImpl uBusinessImpl = new UsuarioBusinessImpl();
        String accion = request.getParameter("accion");
        switch (accion) {
            case "crear":
                String Documento = request.getParameter("txtdocumento");
                String Nombre = request.getParameter("txtnombres");
                String Apellidos = request.getParameter("txtapellidos");
                String  Monto_aprestar= request.getParameter("txtMonto");
                String Tipo_trabajadores = request.getParameter("txtTipo_trabajo");
                String Tipo_credtio = request.getParameter("txtTipo_credito");
                String Trabaja_compañia = request.getParameter("txtTrabajo_compañia");
                
                //Boolean Tipo_trabajadores = Boolean.valueOf(request.getParameter("txtTipo_credito"));
                
                String rol = request.getParameter("txtTrabajo_compañia");
                Usuario usuario = new Usuario(Documento,  Nombre,  Monto_aprestar,  Tipo_trabajadores,  Tipo_credtio,  Trabaja_compañia);

         //       String mensaje = uBusinessImpl.crearUsuario(usuario);
              //  session.setAttribute("MENSAJE", mensaje);
               // rd = request.getRequestDispatcher("/mensaje.jsp");
                break;
            case "eliminar":
                break;
            case "actualizar":
                break;
            case "listar":
   
                break;
            default:
                break;
        }
        rd.forward(request, response);

    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
