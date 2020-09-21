/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CSDLCustomer;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Taikhoan;

/**
 *
 * @author Minh Dao
 */
public class tbUser {

    public static int kiemtra(String user, String pass) {
        Connection conn = database.ketnoi();
        if (conn == null) {
            return -1;
        }
        String sql = "SELECT * FROM usercustomer WHERE Email=? and Password=?";
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
            Logger.getLogger(tbUser.class.getName()).log(Level.SEVERE, null, ex);
            return -2;
        }
    }

    public static int add(Taikhoan tk) {
        Connection conn = database.ketnoi();
        if (conn == null) {
            return -1;
        }
        String sql = "INSERT INTO usercustomer values(null,?,?,?,?)";
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
            Logger.getLogger(tbUser.class.getName()).log(Level.SEVERE, null, ex);
            return -2;

        }

    }
}
