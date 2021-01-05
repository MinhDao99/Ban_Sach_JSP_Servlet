/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import CSDLCustomer.tbHoaDon;
import java.io.IOException;
import java.io.PrintWriter;
import static java.lang.System.out;
import java.util.HashMap;
import java.util.Vector;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import model.clsChiTietHoaDon;
import model.clsHoaDon;
import model.clsProduct;

/**
 *
 * @author Minh Dao
 */
@WebServlet(name = "Cart_checkout", urlPatterns = {"/Cart_checkout"})
public class Cart_checkout extends HttpServlet {

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
            HttpSession session = request.getSession();
            HashMap<Integer, Integer> cart = null;

            if (session.getAttribute("cart") != null) {

                String FirstName = request.getParameter("FirstName");
                String LastName = request.getParameter("LastName");
                String Address = request.getParameter("Address");
                String Town = request.getParameter("Town");
                String Phone = request.getParameter("Phone");
                String Email = request.getParameter("Email");
                String Note = request.getParameter("Note");

                clsHoaDon hd = new clsHoaDon(0, FirstName, LastName, Address, Town, Phone, Email, Note, "", 0);
                int idhd = CSDLCustomer.tbHoaDon.ThemHD(hd);
                if (idhd <= 0) {
                    out.println("<h3>LỖI THÊM HÓA ĐƠN</h3>");
                } else {
                    out.println("<h3> THÊM HÓA ĐƠN</h3>");
                }

                cart = (HashMap<Integer, Integer>) session.getAttribute("cart");
                for (int idsp : cart.keySet()) {
                    int soluong = cart.get(idsp);
                    clsProduct sp = new clsProduct();
                    int kq = CSDLCustomer.tbProduct.GetOneProduct(idsp, sp);
                    if (kq <= 0) {
                        out.println("<h3>KHÔNG TÌM THẤY SẢN PHẨM</h3>");

                    } else {
                        String giamua = sp.getGiaSP();
                        clsChiTietHoaDon cthd = new clsChiTietHoaDon(0, idhd, idsp, soluong, giamua);
                        int kq1 = CSDLCustomer.tbchiTietHoaDon.ThemCTHD(cthd);
                        if (kq1 <= 0) {
                            out.println("<h3>Đặt hàng thất bại</h3>");
                        }
                    }
                }
                session.removeAttribute("cart");
                session.setAttribute("thongbao", "Thành công");
                response.sendRedirect("index.jsp");
            } else {
               // session.setAttribute("thongbao", "thất bại");
                response.sendRedirect("index.jsp");

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
