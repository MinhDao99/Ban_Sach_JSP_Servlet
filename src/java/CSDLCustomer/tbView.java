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

/**
 *
 * @author Minh Dao
 */
public class tbView {

    public static int getView() {
        Connection conn = database.ketnoi();
        if (conn == null) {
            return -1;
        }
        String sql = "SELECT * FROM view";
        PreparedStatement smt;
        int count=0;
        try {
            smt = conn.prepareStatement(sql);
            ResultSet rs = smt.executeQuery();
            if (rs.next()) {
                count= rs.getInt(1);
            }
            return count;
        } catch (SQLException ex) {
            Logger.getLogger(tbView.class.getName()).log(Level.SEVERE, null, ex);
            return -2;
        }

    }
    public static void updateView() {
        Connection conn = database.ketnoi();
        String sql = "UPDATE view SET viewed=viewed+1";
        PreparedStatement smt;
        int count=0;
        try {
            smt = conn.prepareStatement(sql);
            smt.executeUpdate();
           
           
        } catch (SQLException ex) {
            Logger.getLogger(tbView.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
}
