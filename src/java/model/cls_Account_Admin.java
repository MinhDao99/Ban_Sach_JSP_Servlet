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
public class cls_Account_Admin {

    private int id;
    private String email;
    private String pass;
    private String hoten;
    private String tenhienthi;
    private String sdt;

    public cls_Account_Admin() {
    }

    public cls_Account_Admin(int id, String email, String pass, String hoten, String tenhienthi, String sdt) {
        this.id = id;
        this.email = email;
        this.pass = pass;
        this.hoten = hoten;
        this.tenhienthi = tenhienthi;
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

    public String getTenhienthi() {
        return tenhienthi;
    }

    public void setTenhienthi(String tenhienthi) {
        this.tenhienthi = tenhienthi;
    }

    public String getSdt() {
        return sdt;
    }

 

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }
    

   

   
}
