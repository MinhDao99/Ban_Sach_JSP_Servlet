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
public class TaikhoanAdmin {

    private int id;
    private String email;
    private String pass;
    private String hoten;
    private int sdt;

    public TaikhoanAdmin() {
    }

    public TaikhoanAdmin(int id, String email, String pass, String hoten, int sdt) {
        this.id = id;
        this.email = email;
        this.pass = pass;
        this.hoten = hoten;
        this.sdt = sdt;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public int getSdt() {
        return sdt;
    }

    public void setSdt(int sdt) {
        this.sdt = sdt;
    }

   
}
