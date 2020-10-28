/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ControllerAdmin;

import CSDLAdmin.tbUserAdmin;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.TaikhoanAdmin;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.FormulaEvaluator;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
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
        try (PrintWriter out = response.getWriter()) {


            /* TODO output your page here. You may use following sample code. */
            Connection con = CSDLAdmin.database.ketnoi();
            con.setAutoCommit(false);
            File file = new File("D:/DuLieu.xlsx");
            FileInputStream input = new FileInputStream(file);
            XSSFWorkbook workbook = new XSSFWorkbook(input);
            XSSFSheet sheet = workbook.getSheetAt(0);
//            Workbook workbook = new XSSFWorkbook(input);
//            Sheet sheet = workbook.getSheetAt(0);
            Row row;
            for (int i = 1; i <= sheet.getLastRowNum(); i++) {
                out.println(sheet.getLastRowNum());
                row = sheet.getRow(i);
                String Email = row.getCell(0).toString();
                String Pass = row.getCell(1).toString();
                String Hoten = row.getCell(2).toString();
                String TenHienThi = row.getCell(3).toString();
                String SDT = row.getCell(4).toString();
                out.println(Email + ", " + Pass + "," + Hoten + "," + TenHienThi + "," + "," + SDT);
                TaikhoanAdmin tk = new TaikhoanAdmin(0, Email, Pass, Hoten, TenHienThi, SDT);
                tbUserAdmin tb = new tbUserAdmin();
                //String sql = "INSERT INTO user(Email,Password,HoTen,TenHienThi,SoDienThoai) VALUES('" + Email + "','" + Pass + "','" + Hoten + "','" + TenHienThi + "','" + Integer.parseInt(SDT) + "')";
                out.println("Done");
                int kq = tb.add(tk);

                //PreparedStatement smt=con.prepareStatement(sql);
                // smt.executeUpdate();
                out.println("Import rows " + i);

            }
            con.commit();
            //pstm.close();
            con.close();
            input.close();
            response.sendRedirect("admin.jsp?module=DSTKAdmin");
        } catch (SQLException ex) {
            System.out.println(ex);
        } catch (IOException ioe) {
            System.out.println(ioe);
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
