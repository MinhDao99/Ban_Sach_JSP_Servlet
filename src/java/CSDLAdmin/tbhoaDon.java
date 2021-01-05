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
import model.clsHoaDon;

/**
 *
 * @author Minh Dao
 */
public class tbhoaDon {

    public static int GetData(Vector<clsHoaDon> dshd) {
        Connection conn = CSDLAdmin.database.ketnoi();
        if (conn == null) {
            return -1;
        }

        String sql = "SELECT * FROM hoadon order by id DESC";
        try {
            PreparedStatement smt = conn.prepareStatement(sql);
            ResultSet rs = smt.executeQuery();
            while (rs.next()) {
                clsHoaDon hd = new clsHoaDon();
                hd.setId(rs.getInt("id"));
                hd.setFirstName(rs.getString("FirstName"));
                hd.setLastName(rs.getString("LastName"));
                hd.setAddress(rs.getString("Address"));
                hd.setTown(rs.getString("Town"));
                hd.setPhone(rs.getString("Phone"));
                hd.setEmail(rs.getString("Email"));
                hd.setOrderNote(rs.getString("OrderNote"));
                hd.setOderDate(rs.getString("DateOrder"));
                hd.setStatus(rs.getInt("status"));
                dshd.add(hd);
            }
            return dshd.size();
        } catch (SQLException ex) {
            Logger.getLogger(tbhoaDon.class.getName()).log(Level.SEVERE, null, ex);
            return -2;
        }

    }

    public static int GetDataByIdHD(int mahd, Vector<clsHoaDon> dshd) {
        Connection conn = CSDLAdmin.database.ketnoi();
        if (conn == null) {
            return -1;
        }

        String sql = "SELECT * FROM hoadon WHERE id=?";
        try {
            PreparedStatement smt = conn.prepareStatement(sql);
            smt.setInt(1,mahd);
            ResultSet rs = smt.executeQuery();
            while (rs.next()) {
                clsHoaDon hd = new clsHoaDon();
                hd.setId(rs.getInt("id"));
                hd.setFirstName(rs.getString("FirstName"));
                hd.setLastName(rs.getString("LastName"));
                hd.setAddress(rs.getString("Address"));
                hd.setTown(rs.getString("Town"));
                hd.setPhone(rs.getString("Phone"));
                hd.setEmail(rs.getString("Email"));
                hd.setOrderNote(rs.getString("OrderNote"));
                hd.setOderDate(rs.getString("DateOrder"));
                hd.setStatus(rs.getInt("status"));
                dshd.add(hd);
            }
            return dshd.size();
        } catch (SQLException ex) {
            Logger.getLogger(tbhoaDon.class.getName()).log(Level.SEVERE, null, ex);
            return -2;
        }

    }

    public static int DoiTrangThai(int idhd, int ttmoi) {
        Connection conn = CSDLAdmin.database.ketnoi();
        if (conn == null) {
            return -1;
        }
        String sql = "UPDATE hoadon SET status=? WHERE id=?";
        try {
            PreparedStatement smt = conn.prepareStatement(sql);
            smt.setInt(1, ttmoi);
            smt.setInt(2, idhd);
            int kq = smt.executeUpdate();
            return kq;
        } catch (SQLException ex) {
            Logger.getLogger(tbhoaDon.class.getName()).log(Level.SEVERE, null, ex);
            return -2;
        }

    }
}
