/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import CSDL.tbProduct;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.ListProduct;
import org.apache.commons.fileupload.FileUploadException;
import org.apache.commons.fileupload.servlet.ServletFileUpload;

/**
 *
 * @author Minh Dao
 */
@WebServlet(name = "XuLythemSach", urlPatterns = {"/XuLythemSach"})
public class XuLythemSach extends HttpServlet {

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
        String contentType = request.getContentType();
        try (PrintWriter out = response.getWriter()) {
            if (contentType.indexOf("multipart/form-data") >= 0) {
                ServletFileUpload upload = Uploads.getUploads(request);
                try {
                    List fileItems = upload.parseRequest(request);
                    String Tensach = Tientich.getInput(fileItems, "Ten", Uploads.filePath);
                    String GiaSach = Tientich.getInput(fileItems, "Gia", Uploads.filePath);
                    String HinhAnh = Tientich.getInput(fileItems, "HinhAnh", Uploads.filePath);
                    String MoTa = Tientich.getInput(fileItems, "MoTa", Uploads.filePath);
                    String NhomSach = Tientich.getInput(fileItems, "Nhom", Uploads.filePath);
                    String trangthai = Tientich.getInput(fileItems, "trangthai", HinhAnh);
                    boolean tbtrangthai;
                    if (trangthai == null) {
                        tbtrangthai = false;
                    } else {
                        tbtrangthai = true;
                    }
                    ListProduct pro = new ListProduct(0, Tensach, GiaSach, HinhAnh, MoTa, Integer.parseInt(NhomSach),tbtrangthai);
                    int ketqua = tbProduct.SetDataProductList(pro);
                    if (ketqua == -1) {
                        out.println("<h3>Lỗi kết nối CSDL</h3>");
                    } else if (ketqua == -2) {
                        out.println("<h3>Lỗi SQL</h3>");
                    } else if (ketqua == 0) {
                        out.println("<h3>Không cập nhật dữ liệu</h3>");
                    } else {
                        request.getRequestDispatcher("admin.jsp").include(request, response);
                    }
                } catch (FileUploadException ex) {
                    Logger.getLogger(XuLythemSach.class.getName()).log(Level.SEVERE, null, ex);
                } catch (Exception ex) {
                    Logger.getLogger(XuLythemSach.class.getName()).log(Level.SEVERE, null, ex);
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
