/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CSDLAdmin;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Minh Dao
 */
public class tbChiTietHoaDon {

    public static int TongTienHoaDon(int idhd) {
        Connection conn = CSDLAdmin.database.ketnoi();
        if (conn == null) {
            return -1;
        }
        String sql = "SELECT SUM(soluong*giamua) AS tongtien FROM chitiethoadon WHERE id=?";
        try {
            PreparedStatement smt = conn.prepareStatement(sql);
            smt.setInt(1, idhd);
            ResultSet rs = smt.executeQuery();
            if (rs.next()) {
                return rs.getInt("tongtien");

            } else {
                return 0;
            }
        } catch (SQLException ex) {
            Logger.getLogger(tbChiTietHoaDon.class.getName()).log(Level.SEVERE, null, ex);
            return -2;
        }

    }
}