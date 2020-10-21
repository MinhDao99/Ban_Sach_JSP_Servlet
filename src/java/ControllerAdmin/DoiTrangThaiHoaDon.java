/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ControllerAdmin;

import Controller.Tientich;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Minh Dao
 */
@WebServlet(name = "DoiTrangThaiHoaDon", urlPatterns = {"/DoiTrangThaiHoaDon"})
public class DoiTrangThaiHoaDon extends HttpServlet {

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
            int idhd = 0;
            int tthientai = -1;
            int ttmoi = -1;
            String sidhd = request.getParameter("mahd");
            String stthientai = request.getParameter("tthientai");
            String sttmoi = request.getParameter("ttmoi");
            if (sidhd.equals("") || sidhd == null || Tientich.isInteger(sidhd) == false
                    || stthientai.equals("") || stthientai == null || Tientich.isInteger(stthientai) == false
                    || sttmoi.equals("") || sttmoi == null || Tientich.isInteger(sttmoi) == false) {

                out.println("Lỗi đường link");
            } else {
                idhd = Integer.parseInt(sidhd);
                tthientai = Integer.parseInt(stthientai);
                ttmoi = Integer.parseInt(sttmoi);
                if ((tthientai == 0)
                        || (tthientai == 1 && (ttmoi == 2 || ttmoi == 3))
                        || (tthientai == 3 && (ttmoi == 1 || ttmoi == 2))) {

                    int kq = CSDLAdmin.tbhoaDon.DoiTrangThai(idhd, ttmoi);
                    if (kq != 1) {
                        out.println("Lỗi đổi trạng thái");
                    } else {
                        response.sendRedirect("admin.jsp?module=hoaDon");
                    }
                } else {
                    out.println("Trạng thái đổi mới không hợp lệ. Hóa đơn đã thanh toán không thể đổi trạng thái.\nXin kiểm tra lại");

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
