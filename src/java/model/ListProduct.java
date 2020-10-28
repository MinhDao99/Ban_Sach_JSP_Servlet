/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Minh Dao
 */
public class ListProduct {

    private int id;
    private String Tensp;
    private String GiaSP;
    private String HinhAnh;
    private String MoTa;
    private int idproducts;
    private boolean trangthai;

    public ListProduct(int id, String Tensp, String GiaSP, String HinhAnh, String MoTa, int idproducts, boolean trangthai) {
        this.id = id;
        this.Tensp = Tensp;
        this.GiaSP = GiaSP;
        this.HinhAnh = HinhAnh;
        this.MoTa = MoTa;
        this.idproducts = idproducts;
        this.trangthai = trangthai;
    }

    public boolean isTrangthai() {
        return trangthai;
    }

    public void setTrangthai(boolean trangthai) {
        this.trangthai = trangthai;
    }

    public int gettrangthai() {
        return trangthai?1:0;
    }

    public ListProduct() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTensp() {
        return Tensp;
    }

    public void setTensp(String Tensp) {
        this.Tensp = Tensp;
    }

    public String getGiaSP() {
        return GiaSP;
    }

    public void setGiaSP(String GiaSP) {
        this.GiaSP = GiaSP;
    }

    public String getHinhAnh() {
        return HinhAnh;
    }

    public void setHinhAnh(String HinhAnh) {
        this.HinhAnh = HinhAnh;
    }

    public String getMoTa() {
        return MoTa;
    }

    public void setMoTa(String MoTa) {
        this.MoTa = MoTa;
    }

    public int getIdproducts() {
        return idproducts;
    }


    public void setIdproducts(int idproducts) {
        this.idproducts = idproducts;
    }

}
