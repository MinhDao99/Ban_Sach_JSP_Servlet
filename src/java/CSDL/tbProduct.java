/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CSDL;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.clsImageSlide;
import model.clsProduct;
import model.clsCatagory;

/**
 *
 * @author Minh Dao
 */
public class tbProduct {

    public static int GetProduct(Vector<clsCatagory> ds) {
        Connection conn = CSDL.database.ketnoi();
        if (conn == null) {
            return -1;
        }
        String sql = "SELECT * FROM products WHERE status=1";
        try {
            Statement smt = conn.createStatement();
            ResultSet rs = smt.executeQuery(sql);
            while (rs.next()) {
                clsCatagory pro = new clsCatagory();
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

    public static int SetData(clsCatagory product) {
        Connection conn = CSDL.database.ketnoi();
        if (conn == null) {
            return -1;
        }
        String sql = "INSERT INTO products VALUES (?,?,null)";
        try {
            PreparedStatement smt = conn.prepareStatement(sql);
            smt.setString(1, product.getTen());
            smt.setBoolean(2, product.isTrangthai());
            int kq = smt.executeUpdate();
            return kq;

        } catch (SQLException ex) {
            Logger.getLogger(tbProduct.class.getName()).log(Level.SEVERE, null, ex);
            return -2;
        }

    }

    public static int SetDataProductList(clsProduct p) {
        Connection conn = CSDL.database.ketnoi();
        if (conn == null) {
            return -1;
        }
        String sql = "INSERT INTO listsanpham VALUES (null,?,?,?,?,?,?)";
        try {
            PreparedStatement smt = conn.prepareStatement(sql);
            smt.setBoolean(1, p.isTrangthai());
            smt.setString(2, p.getTensp());
            smt.setString(3, p.getGiaSP());
            smt.setString(4, p.getHinhAnh());
            smt.setString(5, p.getMoTa());
            smt.setInt(6, p.getIdproducts());
            int kq = smt.executeUpdate();
            if (kq > 0) {
                return 1;
            } else {
                return 0;
            }

        } catch (SQLException ex) {
            Logger.getLogger(tbProduct.class.getName()).log(Level.SEVERE, null, ex);
            return -2;
        }

    }

    public static int LayDuLieu(int id, Vector<clsProduct> dssp) {
        Connection conn = CSDL.database.ketnoi();

        String sql = "SELECT * FROM listsanpham WHERE idproducts='" + id + "'AND status=1";
        try {
            PreparedStatement smt = conn.prepareStatement(sql);
            ResultSet rs = smt.executeQuery();
            while (rs.next()) {//duyệt từng bản ghi kết quả select
                clsProduct sp = new clsProduct();
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

        public static int LayDuLieuAdmin(Vector<clsProduct> dssp) {
        Connection conn = CSDL.database.ketnoi();

        String sql = "SELECT * FROM listsanpham";
        try {
            PreparedStatement smt = conn.prepareStatement(sql);
            ResultSet rs = smt.executeQuery();
            while (rs.next()) {//duyệt từng bản ghi kết quả select
                clsProduct sp = new clsProduct();
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

    public static int FixLoaiSP(int id, clsCatagory pro) {
        Connection cnn = CSDL.database.ketnoi();
        if (cnn == null) {
            return -1;//lỗi kết nối CSDL
        }
        String sql = "UPDATE products SET TenSanPham=?,status=? WHERE id=?";
        try {
            PreparedStatement smt = cnn.prepareStatement(sql);
            smt.setString(1, pro.getTen());
            smt.setBoolean(2, pro.isTrangthai());
            smt.setInt(3, id);
            int ketqua = smt.executeUpdate();//trả lại số nguyên là số bản ghi được thêm/sửa/xóa
            return ketqua;//nếu ko có bản ghi nào được thêm/sửa xóa thì ketqua=0
        } catch (SQLException ex) {
            Logger.getLogger(tbUser.class.getName()).log(Level.SEVERE, null, ex);
            return -2;//Lỗi câu lệnh SQL
        }
    }

    public static int Delete(int id) {
        Connection cnn = CSDL.database.ketnoi();
        if (cnn == null) {
            return -1;//lỗi kết nối CSDL
        }
        String sql = "DELETE FROM listsanpham WHERE ID=?";
        try {
            PreparedStatement smt = cnn.prepareStatement(sql);
            smt.setInt(1, id);
            int kq = smt.executeUpdate();
            return kq;
        } catch (SQLException ex) {
            Logger.getLogger(tbProduct.class.getName()).log(Level.SEVERE, null, ex);
            return -2;
        }

    }

    public static int GetAllProduct(Vector<clsImageSlide> ds) {
        Connection conn = CSDL.database.ketnoi();
        if (conn == null) {
            return -1;
        }
        String sql = "SELECT * FROM slidepicture";
        try {
            Statement smt = conn.createStatement();
            ResultSet rs = smt.executeQuery(sql);
            while (rs.next()) {
                clsImageSlide pro = new clsImageSlide();
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

    public static int GetDetail(int id, Vector<clsProduct> dssp) {
        Connection conn = CSDL.database.ketnoi();

        String sql = "SELECT * FROM listsanpham WHERE ID='" + id + "'";
        try {
            PreparedStatement smt = conn.prepareStatement(sql);
            ResultSet rs = smt.executeQuery();
            while (rs.next()) {//duyệt từng bản ghi kết quả select
                clsProduct sp = new clsProduct();
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

    public static int Search(String name, Vector<clsProduct> ds) {

        Connection conn = database.ketnoi();
        if (conn == null) {
            return -1;
        } else {
            String sql = "SELECT * FROM listsanpham WHERE TenSP LIKE '%" + name + "%'";
            try {

                PreparedStatement smt = conn.prepareStatement(sql);
                ResultSet rs = smt.executeQuery();
                while (rs.next()) {
                    clsProduct sp = new clsProduct();
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

    public static int GetProductAdmin(Vector<clsCatagory> ds) {
        Connection conn = CSDL.database.ketnoi();
        if (conn == null) {
            return -1;
        }
        String sql = "SELECT * FROM products";
        try {
            Statement smt = conn.createStatement();
            ResultSet rs = smt.executeQuery(sql);
            while (rs.next()) {
                clsCatagory pro = new clsCatagory();
                pro.setId(rs.getInt("id"));
                pro.setTen(rs.getString("TenSanPham"));
                pro.setTrangthai(rs.getBoolean("status"));
                ds.add(pro);
            }
            return ds.size();
        } catch (SQLException ex) {
            Logger.getLogger(tbProduct.class.getName()).log(Level.SEVERE, null, ex);
            return -2;
        }

    }

    public static int SwapStatus(int id, String tencot, String Giatrimoi, String tenbang) {
        Connection conn = CSDL.database.ketnoi();
        if (conn == null) {
            return -1;
        }
        String sql = "UPDATE " + tenbang + " SET " + tencot + "='" + Giatrimoi + "'WHERE id=?";
        try {
            PreparedStatement smt = conn.prepareStatement(sql);
            smt.setInt(1, id);
            int kq = smt.executeUpdate();
            return kq;
        } catch (SQLException ex) {
            Logger.getLogger(tbProduct.class.getName()).log(Level.SEVERE, null, ex);
            return -2;
        }

    }

    public static int GetOneTypeProduct(int id, clsCatagory sp) {
        Connection conn = CSDL.database.ketnoi();

        String sql = "SELECT * FROM products WHERE id=?";
        try {
            PreparedStatement smt = conn.prepareStatement(sql);
            smt.setInt(1, id);
            ResultSet rs = smt.executeQuery();
            while (rs.next()) {
                sp.setId(rs.getInt("id"));
                sp.setTen(rs.getString("TenSanPham"));
                sp.setTrangthai(rs.getBoolean("status"));
                return 1;
            }
            return 0;
        } catch (SQLException ex) {
            Logger.getLogger(tbProduct.class.getName()).log(Level.SEVERE, null, ex);
            return -2;

        }
    }

    public static int GetOneProduct(int id, clsProduct sp) {
        Connection conn = CSDL.database.ketnoi();

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

    public static int FixSP(int id, clsProduct pro) {
        Connection cnn = CSDL.database.ketnoi();
        if (cnn == null) {
            return -1;//lỗi kết nối CSDL
        }
        String sql = "UPDATE listsanpham SET status=?,TenSP=?,GiaSp=?,HinhAnh=?,MoTa=?,idproducts=? WHERE ID=?";
        try {
            PreparedStatement smt = cnn.prepareStatement(sql);
            smt.setBoolean(1, pro.isTrangthai());
            smt.setString(2, pro.getTensp());
            smt.setString(3, pro.getGiaSP());
            smt.setString(4, pro.getHinhAnh());
            smt.setString(5, pro.getMoTa());
            smt.setInt(6, pro.getIdproducts());
            smt.setInt(7, id);
            int ketqua = smt.executeUpdate();//trả lại số nguyên là số bản ghi được thêm/sửa/xóa
            return ketqua;//nếu ko có bản ghi nào được thêm/sửa xóa thì ketqua=0
        } catch (SQLException ex) {
            Logger.getLogger(tbUser.class.getName()).log(Level.SEVERE, null, ex);
            return -2;//Lỗi câu lệnh SQL
        }
    }
}
