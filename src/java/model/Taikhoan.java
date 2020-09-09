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
public class Taikhoan {

    private String email;
    private String pass;
    private String hoten;
    private String tenhienthi;
    private int sdt;
    private String hinhanh;

    public Taikhoan() {
    }

    public Taikhoan(String email, String pass, String hoten, String tenhienthi, int sdt, String hinhanh) {
        this.email = email;
        this.pass = pass;
        this.hoten = hoten;
        this.tenhienthi = tenhienthi;
        this.sdt = sdt;
        this.hinhanh = hinhanh;

    }

    public String getHinhanh() {
        return hinhanh;
    }

    public void setHinhanh(String hinhanh) {
        this.hinhanh = hinhanh;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public String getHoten() {
        return hoten;
    }

    public void setHoten(String hoten) {
        this.hoten = hoten;
    }

    public String getTenhienthi() {
        return tenhienthi;
    }

    public void setTenhienthi(String tenhienthi) {
        this.tenhienthi = tenhienthi;
    }

    public int getSdt() {
        return sdt;
    }

    public void setSdt(int sdt) {
        this.sdt = sdt;
    }

}
