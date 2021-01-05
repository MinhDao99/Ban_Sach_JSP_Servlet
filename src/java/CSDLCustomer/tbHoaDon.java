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
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.clsHoaDon;

/**
 *
 * @author Minh Dao
 */
public class tbHoaDon {

    public static int ThemHD(clsHoaDon hd) {
        Connection conn = CSDLCustomer.database.ketnoi();
        if (conn == null) {
            return -1;
        } else {
            String sql = "INSERT INTO hoadon(FirstName,LastName,Address,Town,Phone,Email,OrderNote) VALUES(?,?,?,?,?,?,?)";
            try {
                PreparedStatement smt = conn.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
                smt.setString(1, hd.getFirstName());
                smt.setString(2, hd.getLastName());
                smt.setString(3, hd.getAddress());
                smt.setString(4, hd.getTown());
                smt.setString(5, hd.getPhone());
                smt.setString(6, hd.getEmail());
                smt.setString(7, hd.getOrderNote());
                int kq = smt.executeUpdate();
                if (kq <= 0) {
                    return 0;
                } else {
                    ResultSet rs = smt.getGeneratedKeys();
                    if (rs.next()) {
                        return rs.getInt(1);
                    } else {
                        return 0;
                    }
                }
            } catch (SQLException ex) {
                Logger.getLogger(tbHoaDon.class.getName()).log(Level.SEVERE, null, ex);
                return -2;
            }
        }
    }
}
