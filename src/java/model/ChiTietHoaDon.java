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
public class ChiTietHoaDon {
    private int id;
    public int idhd;
    public int idsp;
    public int soluong;
    public String giamua;

    public ChiTietHoaDon() {
    }

    public ChiTietHoaDon(int id, int idhd, int idsp, int soluong, String giamua) {
        this.id = id;
        this.idhd = idhd;
        this.idsp = idsp;
        this.soluong = soluong;
        this.giamua = giamua;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIdhd() {
        return idhd;
    }

    public void setIdhd(int idhd) {
        this.idhd = idhd;
    }

    public int getidsp() {
        return idsp;
    }

    public void setidsp(int idsp) {
        this.idsp = idsp;
    }

    public int getSoluong() {
        return soluong;
    }

    public void setSoluong(int soluong) {
        this.soluong = soluong;
    }

    public String getGiamua() {
        return giamua;
    }

    public void setGiamua(String giamua) {
        this.giamua = giamua;
    }

    
}
