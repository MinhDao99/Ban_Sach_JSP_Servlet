/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ControllerAdmin;

import CSDLAdmin.tbUserAdmin;
import Controller.Tientich;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.cls_Account_Admin;
import org.apache.commons.fileupload.FileUploadException;
import org.apache.commons.fileupload.servlet.ServletFileUpload;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

/**
 *
 * @author Minh Dao
 */
@WebServlet(name = "importAccountAdmin", urlPatterns = {"/importAccountAdmin"})
public class importAccountAdmin extends HttpServlet {

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
                ServletFileUpload upload = UploadsExcel.getUploads(request);
                Connection con = CSDLAdmin.database.ketnoi();
                con.setAutoCommit(false);
                List fileItems = upload.parseRequest(request);
                String filename = Tientich.getInput(fileItems, "filename", UploadsExcel.filePath);
                File file = new File("E:/JAVAWEB/KetHopForm/Web_Product/Web_Product/Web_Product/build/web/Excel/" + filename);
                FileInputStream input = new FileInputStream(file);
                XSSFWorkbook workbook = new XSSFWorkbook(input);
                XSSFSheet sheet = workbook.getSheetAt(0);

//            Workbook workbook = new XSSFWorkbook(input);
//            Sheet sheet = workbook.getSheetAt(0);
                Row row;

                for (int i = 1; i <= sheet.getLastRowNum(); i++) {
                    row = sheet.getRow(i);
                    String Email = row.getCell(0).toString();
                    String Pass = row.getCell(1).toString();
                    String Hoten = row.getCell(2).toString();
                    String TenHienThi = row.getCell(3).toString();
                    String SDT = row.getCell(4).toString();
                    out.println("\n"+Email + ", " + Pass + "," + Hoten + "," + TenHienThi + "," + SDT);
                    cls_Account_Admin tk = new cls_Account_Admin(0, Email, Pass, Hoten, TenHienThi, SDT);
                    tbUserAdmin tb = new tbUserAdmin();
                    String sql = "INSERT INTO user(Email,Password,HoTen,TenHienThi,SoDienThoai) VALUES('" + Email + "','" + Pass + "','" + Hoten + "','" + TenHienThi + "','" + SDT + "')";
                    // out.println("Done");
                    int kq = tb.add(tk);
                }
                con.commit();
                // pstm.close();
                con.close();
                input.close();
                response.sendRedirect("admin.jsp?module=DSTKAdmin");
            }
        } catch (SQLException ex) {
            System.out.println(ex);
        } catch (IOException ioe) {
            System.out.println(ioe);
        } catch (FileUploadException ex) {
            Logger.getLogger(importAccountAdmin.class.getName()).log(Level.SEVERE, null, ex);
        } catch (Exception ex) {
            Logger.getLogger(importAccountAdmin.class.getName()).log(Level.SEVERE, null, ex);
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
