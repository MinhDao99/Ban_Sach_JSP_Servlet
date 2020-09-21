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
import model.Taikhoan;
import model.TaikhoanAdmin;

/**
 *
 * @author Minh Dao
 */
public class tbUserAdmin {

    public static int kiemtra(String user, String pass) {
        Connection conn = database.ketnoi();
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

    public static int add(TaikhoanAdmin tk) {
        Connection conn = database.ketnoi();
        if (conn == null) {
            return -1;
        }
        String sql = "INSERT INTO user values(null,?,?,?,?)";
        //String sql="INSERT INTO taikhoan1(Username,Password,Email) values(?,?,?)";
        try {
            PreparedStatement smt = conn.prepareStatement(sql);
            smt.setString(1, tk.getEmail());
            smt.setString(2, tk.getPass());
            smt.setString(3, tk.getHoten());
            smt.setInt(4, tk.getSdt());
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

    public static int GetUserCus(Vector<Taikhoan> ds) {
        Connection conn = database.ketnoi();
        if (conn == null) {
            return -1;
        }
        String sql = "SELECT * FROM usercustomer";
        try {
            Statement smt = conn.createStatement();
            ResultSet rs = smt.executeQuery(sql);
            while (rs.next()) {
                Taikhoan tk = new Taikhoan();
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
     public static int GetUserAdmin(Vector<TaikhoanAdmin> ds) {
        Connection conn = database.ketnoi();
        if (conn == null) {
            return -1;
        }
        String sql = "SELECT * FROM user";
        try {
            Statement smt = conn.createStatement();
            ResultSet rs = smt.executeQuery(sql);
            while (rs.next()) {
                TaikhoanAdmin tk = new TaikhoanAdmin();
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
}
