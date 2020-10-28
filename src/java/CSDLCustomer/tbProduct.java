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
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.ImageSlide;
import model.ListProduct;
import model.Product;

/**
 *
 * @author Minh Dao
 */
public class tbProduct {

    public static int GetProduct(Vector<Product> ds) {
        Connection conn = CSDLCustomer.database.ketnoi();
        if (conn == null) {
            return -1;
        }
        String sql = "SELECT * FROM products WHERE status=1";
        try {
            Statement smt = conn.createStatement();
            ResultSet rs = smt.executeQuery(sql);
            while (rs.next()) {
                Product pro = new Product();
                pro.setId(rs.getInt("id"));
                pro.setTen(rs.getString("TenSanPham"));
                ds.add(pro);
            }
            return ds.size();
        } catch (SQLException ex) {
            Logger.getLogger(tbProduct.class.getName()).log(Level.SEVERE, null, ex);
            return -2;
        }

    }

    public static int LayDuLieu(int id, Vector<ListProduct> dssp) {
        Connection conn = CSDLCustomer.database.ketnoi();

        String sql = "SELECT * FROM listsanpham WHERE idproducts='" + id + "'AND status=1";
        try {
            PreparedStatement smt = conn.prepareStatement(sql);
            ResultSet rs = smt.executeQuery();
            while (rs.next()) {//duyệt từng bản ghi kết quả select
                ListProduct sp = new ListProduct();
                sp.setId(rs.getInt("ID"));
                sp.setTensp(rs.getString("TenSP"));
                sp.setGiaSP(rs.getString("GiaSP"));
                sp.setHinhAnh(rs.getString("HinhAnh"));
                sp.setIdproducts(rs.getInt("idproducts"));
                dssp.add(sp);
            }
//

        } catch (SQLException ex) {
            Logger.getLogger(tbProduct.class.getName()).log(Level.SEVERE, null, ex);

        }
        return dssp.size();
    }

    public static int GetAllProduct(Vector<ImageSlide> ds) {
        Connection conn = CSDLCustomer.database.ketnoi();
        if (conn == null) {
            return -1;
        }
        String sql = "SELECT * FROM slidepicture";
        try {
            Statement smt = conn.createStatement();
            ResultSet rs = smt.executeQuery(sql);
            while (rs.next()) {
                ImageSlide pro = new ImageSlide();
                pro.setId(rs.getInt("id"));
                pro.setHinhAnh(rs.getString("HinhAnh"));
                ds.add(pro);
            }
            return ds.size();
        } catch (SQLException ex) {
            Logger.getLogger(tbProduct.class.getName()).log(Level.SEVERE, null, ex);
            return -2;
        }

    }

    public static int GetDetail(int id, Vector<ListProduct> dssp) {
        Connection conn = CSDLCustomer.database.ketnoi();

        String sql = "SELECT * FROM listsanpham WHERE ID='" + id + "'";
        try {
            PreparedStatement smt = conn.prepareStatement(sql);
            ResultSet rs = smt.executeQuery();
            while (rs.next()) {//duyệt từng bản ghi kết quả select
                ListProduct sp = new ListProduct();
                sp.setTensp(rs.getString("TenSP"));
                sp.setGiaSP(rs.getString("GiaSP"));
                sp.setHinhAnh(rs.getString("HinhAnh"));
                sp.setMoTa(rs.getString("MoTa"));
                dssp.add(sp);
            }
//

        } catch (SQLException ex) {
            Logger.getLogger(tbProduct.class.getName()).log(Level.SEVERE, null, ex);

        }
        return dssp.size();
    }

    public static int Search(String name, Vector<ListProduct> ds) {

        Connection conn = database.ketnoi();
        if (conn == null) {
            return -1;
        } else {
            String sql = "SELECT * FROM listsanpham WHERE TenSP LIKE '%" + name + "%'";
            try {

                PreparedStatement smt = conn.prepareStatement(sql);
                ResultSet rs = smt.executeQuery();
                while (rs.next()) {
                    ListProduct sp = new ListProduct();
                    sp.setId(rs.getInt("ID"));
                    sp.setTensp(rs.getString("TenSP"));
                    sp.setGiaSP(rs.getString("GiaSP"));
                    sp.setHinhAnh(rs.getString("HinhAnh"));
                    sp.setIdproducts(rs.getInt("idproducts"));
                    ds.add(sp);
                }

            } catch (SQLException ex) {
                Logger.getLogger(tbProduct.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return ds.size();

    }

    public static int GetOneProduct(int id, ListProduct sp) {
        Connection conn = database.ketnoi();

        String sql = "SELECT * FROM listsanpham WHERE id=?";
        try {
            PreparedStatement smt = conn.prepareStatement(sql);
            smt.setInt(1, id);
            ResultSet rs = smt.executeQuery();
            while (rs.next()) {
                sp.setId(rs.getInt("ID"));
                sp.setTensp(rs.getString("TenSP"));
                sp.setGiaSP(rs.getString("GiaSP"));
                sp.setHinhAnh(rs.getString("HinhAnh"));
                sp.setMoTa(rs.getString("MoTa"));
                sp.setIdproducts(rs.getInt("idproducts"));
                sp.setTrangthai(rs.getBoolean("status"));
                return 1;
            }
            return 0;
        } catch (SQLException ex) {
            Logger.getLogger(tbProduct.class.getName()).log(Level.SEVERE, null, ex);
            return -2;
        }

    }

    public static int LayDuLieuACus(Vector<ListProduct> dssp, int a, int b) {
        Connection conn = database.ketnoi();

        String sql = "SELECT * FROM listsanpham WHERE status=1 LIMIT ?,?";
        try {
            PreparedStatement smt = conn.prepareStatement(sql);
            smt.setInt(1, a);
            smt.setInt(2, b);

            ResultSet rs = smt.executeQuery();
            while (rs.next()) {//duyệt từng bản ghi kết quả select
                ListProduct sp = new ListProduct();
                sp.setId(rs.getInt("ID"));
                sp.setTensp(rs.getString("TenSP"));
                sp.setGiaSP(rs.getString("GiaSP"));
                sp.setHinhAnh(rs.getString("HinhAnh"));
                sp.setMoTa(rs.getString("MoTa"));
                sp.setIdproducts(rs.getInt("idproducts"));
                sp.setTrangthai(rs.getBoolean("status"));
                dssp.add(sp);
            }

        } catch (SQLException ex) {
            Logger.getLogger(tbProduct.class.getName()).log(Level.SEVERE, null, ex);

        }
        return dssp.size();
    }

    public int getCount() {
        Connection conn = CSDLCustomer.database.ketnoi();
        Vector<ListProduct> list = new Vector();
        String sql = "SELECT count(ID) FROM listsanpham";
        int count = 0;
        try {
            PreparedStatement stmt = conn.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                count = rs.getInt(1);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return count;
    }

}
