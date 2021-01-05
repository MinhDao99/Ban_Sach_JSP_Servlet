/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ControllerAdmin;

import CSDLAdmin.tbUserAdmin;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Vector;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.cls_Account_Admin;

/**
 *
 * @author Minh Dao
 */
@WebServlet(name = "XuLyThemTKAdmin", urlPatterns = {"/XuLyThemTKAdmin"})
public class XuLyThemTKAdmin extends HttpServlet {

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
        response.setContentType("text/html;charset=UTF-8");
        request.setCharacterEncoding("utf-8");
        try (PrintWriter out = response.getWriter()) {
            int flag=1;
            String Email = request.getParameter("email");
            String Pass = request.getParameter("Password");
            String Repass = request.getParameter("nhaplaimatkhau");
            String hoten = request.getParameter("hoten");
            String tenhienthi = request.getParameter("tenhienthi");
            String sdt = request.getParameter("sdt");
            tbUserAdmin tb = new tbUserAdmin();
            Vector<cls_Account_Admin> ds = new Vector<>();
            tb.GetUserAdmin(ds);
            for (cls_Account_Admin tk : ds) {
                if (tk.getEmail().equals(Email)) {
                    out.println("Tài khoản đã tồn tại");
                    flag=0;
                    break;
                }
            }

            if (Repass.equalsIgnoreCase(Pass) == false) {
                out.println("Không trùng password");
            }else if(flag==1) {
                cls_Account_Admin tk = new cls_Account_Admin(0, Email, Pass, hoten,tenhienthi, sdt);
                int kq = tb.add(tk);
                if (kq == -1) {
                    out.println("<h3> lỗi kết nối csdl</h3>");
                } else if (kq == -2) {
                    out.println("<h3> lỗi SQL</h3>");
                } else if (kq == 0) {
                    out.println("<h3> không thêm được</h3>");
                } else {
                    request.getRequestDispatcher("admin.jsp?module=DSTKAdmin").include(request, response);
                }
            }
        }
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
