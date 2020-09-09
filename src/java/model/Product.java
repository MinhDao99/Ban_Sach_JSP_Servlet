/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import javax.servlet.http.Part;

/**
 *
 * @author Minh Dao
 */
public class Product {

    private int id;
    private String ten;
    private boolean trangthai;

    public Product() {
    }

    public Product(int id, String ten, boolean trangthai) {
        this.id = id;
        this.ten = ten;
        this.trangthai = trangthai;
    }

    public boolean isTrangthai() {
        return trangthai;
    }

    public void setTrangthai(boolean trangthai) {
        this.trangthai = trangthai;
    }

    public int gettrangthai() {
        return trangthai ? 1 : 0;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

}
