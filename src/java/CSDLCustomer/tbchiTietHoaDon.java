/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CSDLCustomer;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.clsChiTietHoaDon;

/**
 *
 * @author Minh Dao
 */
public class tbchiTietHoaDon {

    public static int ThemCTHD(clsChiTietHoaDon cthd) {
        Connection conn = database.ketnoi();
        if (conn == null) {
            return -1;
        } else {
            String sql = "INSERT INTO chitiethoadon VALUES(NULL,?,?,?,?)";
            try {
                PreparedStatement smt = conn.prepareStatement(sql);
                smt.setInt(1, cthd.getIdhd());
                smt.setInt(2, cthd.getidsp());
                smt.setInt(3, cthd.getSoluong());
                smt.setString(4, cthd.getGiamua());
                int kq= smt.executeUpdate();
                if(kq>0)
                {
                    return 1;
                }else
                    return 0;

            } catch (SQLException ex) {
                Logger.getLogger(tbchiTietHoaDon.class.getName()).log(Level.SEVERE, null, ex);
                return -2;
            }

        }
    }
}
