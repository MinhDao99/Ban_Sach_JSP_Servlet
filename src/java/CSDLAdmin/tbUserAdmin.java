/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CSDLAdmin;

import CSDLCustomer.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.cls_Account_Customer;
import model.cls_Account_Admin;

/**
 *
 * @author Minh Dao
 */
public class tbUserAdmin {

    public static int kiemtra(String user, String pass) {
        Connection conn = CSDLAdmin.database.ketnoi();
        if (conn == null) {
            return -1;
        }
        String sql = "SELECT * FROM user WHERE Email=? and Password=?";
        try {
            PreparedStatement smt = conn.prepareCall(sql);
            smt.setString(1, user);
            smt.setString(2, pass);
            ResultSet rs = smt.executeQuery();
            if (rs.next()) {
                return 1;
            } else {
                return 0;
            }
        } catch (SQLException ex) {
            Logger.getLogger(tbUserAdmin.class.getName()).log(Level.SEVERE, null, ex);
            return -2;
        }
    }

    public static int add(cls_Account_Admin tk) {
        Connection conn = CSDLAdmin.database.ketnoi();
        if (conn == null) {
            return -1;
        }
        String sql = "INSERT INTO user VALUES(NULL,?,?,?,?,?)";
        //String sql="INSERT INTO taikhoan1(Username,Password,Email) values(?,?,?)";
        try {
            PreparedStatement smt = conn.prepareStatement(sql);
            smt.setString(1, tk.getEmail());
            smt.setString(2, tk.getPass());
            smt.setString(3, tk.getHoten());
            smt.setString(4, tk.getTenhienthi());
            smt.setString(5, tk.getSdt());
            int kq = smt.executeUpdate();
            if (kq > 0) {
                return 1;
            } else {
                return 0;
            }

        } catch (SQLException ex) {
            Logger.getLogger(tbUserAdmin.class.getName()).log(Level.SEVERE, null, ex);
            return -2;

        }

    }

    public static int GetUserCus(Vector<cls_Account_Customer> ds) {
        Connection conn = database.ketnoi();
        if (conn == null) {
            return -1;
        }
        String sql = "SELECT * FROM usercustomer";
        try {
            Statement smt = conn.createStatement();
            ResultSet rs = smt.executeQuery(sql);
            while (rs.next()) {
                cls_Account_Customer tk = new cls_Account_Customer();
                tk.setId(rs.getInt("id"));
                tk.setEmail(rs.getString("Email"));
                tk.setPass(rs.getString("Password"));
                tk.setHoten(rs.getString("HoTen"));
                tk.setSdt(rs.getInt("sodienthoai"));
                ds.add(tk);
            }
            return ds.size();
        } catch (SQLException ex) {
            Logger.getLogger(tbUserAdmin.class.getName()).log(Level.SEVERE, null, ex);
            return -2;
        }

    }

    public static int GetUserAdmin(Vector<cls_Account_Admin> ds) {
        Connection conn = database.ketnoi();
        if (conn == null) {
            return -1;
        }
        String sql = "SELECT * FROM user";
        try {
            Statement smt = conn.createStatement();
            ResultSet rs = smt.executeQuery(sql);
            while (rs.next()) {
                cls_Account_Admin tk = new cls_Account_Admin();
                tk.setId(rs.getInt("id"));
                tk.setEmail(rs.getString("Email"));
                tk.setPass(rs.getString("Password"));
                tk.setHoten(rs.getString("HoTen"));
                tk.setTenhienthi(rs.getString("TenHienThi"));
                tk.setSdt(rs.getString("SoDienThoai"));
                ds.add(tk);
            }
        } catch (SQLException ex) {
            Logger.getLogger(tbUserAdmin.class.getName()).log(Level.SEVERE, null, ex);
            return -2;
        }
            return ds.size();

    }

    public static int DeleteCus(int id) {
        Connection cnn = database.ketnoi();
        if (cnn == null) {
            return -1;//lỗi kết nối CSDL
        }
        String sql = "DELETE FROM usercustomer WHERE ID=?";
        try {
            PreparedStatement smt = cnn.prepareStatement(sql);
            smt.setInt(1, id);
            int kq = smt.executeUpdate();
            return kq;
        } catch (SQLException ex) {
            Logger.getLogger(tbProductAdmin.class.getName()).log(Level.SEVERE, null, ex);
            return -2;
        }

    }

    public static int DeleteAdmin(int id) {
        Connection cnn = database.ketnoi();
        if (cnn == null) {
            return -1;//lỗi kết nối CSDL
        }
        String sql = "DELETE FROM user WHERE ID=?";
        try {
            PreparedStatement smt = cnn.prepareStatement(sql);
            smt.setInt(1, id);
            int kq = smt.executeUpdate();
            return kq;
        } catch (SQLException ex) {
            Logger.getLogger(tbProductAdmin.class.getName()).log(Level.SEVERE, null, ex);
            return -2;
        }

    }

    public void insertListBooks(Vector<cls_Account_Admin> ds) {
        try {
            Connection conn = CSDLAdmin.database.ketnoi();
            // Sét tự động commit false, để chủ động điều khiển
            conn.setAutoCommit(false);

            String sql = "INSERT INTO user(Email, Password, HoTen,TenHienThi,SoDienThoai) VALUES (?, ?, ?,?,?)";
            PreparedStatement smt = conn.prepareStatement(sql);

            for (cls_Account_Admin p : ds) {
                smt.setString(1, p.getEmail());
                smt.setString(2, p.getPass());
                smt.setString(3, p.getHoten());
                smt.setString(4, p.getTenhienthi());
                smt.setString(5, p.getSdt());
                smt.addBatch();
            }

            smt.executeBatch();

            // Gọi commit() để commit giao dịch với DB
            conn.commit();

            System.out.println("Record is inserted into BOOK table!");

        } catch (Exception e) {

            e.printStackTrace();

        }
    }
}
