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
public class ImageSlide {
      private int id;
    private String HinhAnh;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getHinhAnh() {
        return HinhAnh;
    }

    public void setHinhAnh(String HinhAnh) {
        this.HinhAnh = HinhAnh;
    }

    public ImageSlide(int id, String HinhAnh) {
        this.id = id;
        this.HinhAnh = HinhAnh;
    }

    public ImageSlide() {
    }

}
