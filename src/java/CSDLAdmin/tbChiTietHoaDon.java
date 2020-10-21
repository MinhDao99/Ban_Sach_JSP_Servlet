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
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.ChiTietHoaDon;

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

    public static int DanhSachChiTietHD(int mahd, Vector<ChiTietHoaDon> dhcthd) {
        Connection conn = CSDLAdmin.database.ketnoi();
        if (conn == null) {
            return -1;
        }
        String sql = "SELECT * FROM chitiethoadon WHERE idhd=?";
        try {
            PreparedStatement smt = conn.prepareStatement(sql);
            smt.setInt(1, mahd);
            ResultSet rs = smt.executeQuery();
            while (rs.next()) {
                ChiTietHoaDon cthd = new ChiTietHoaDon();
                cthd.setId(rs.getInt("id"));
                cthd.setIdhd(rs.getInt("idhd"));
                cthd.setidsp(rs.getInt("idsp"));
                cthd.setSoluong(rs.getInt("soluong"));
                cthd.setGiamua(rs.getString("giamua"));
                dhcthd.add(cthd);
            }
            return dhcthd.size();
        } catch (SQLException ex) {
            Logger.getLogger(tbChiTietHoaDon.class.getName()).log(Level.SEVERE, null, ex);
            return -2;
        }

    }
}
