package com.workshop.bookstore.entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
public class DiaChi {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @javax.persistence.Column(name = "id", nullable = false)
    private long id;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @Basic
    @Column(name = "tinh_thanh_pho", nullable = false, length = 50)
    private String tinhThanhPho;

    public String getTinhThanhPho() {
        return tinhThanhPho;
    }

    public void setTinhThanhPho(String tinhThanhPho) {
        this.tinhThanhPho = tinhThanhPho;
    }

    @Basic
    @Column(name = "quan_huyen", nullable = false, length = 50)
    private String quanHuyen;

    public String getQuanHuyen() {
        return quanHuyen;
    }

    public void setQuanHuyen(String quanHuyen) {
        this.quanHuyen = quanHuyen;
    }

    @Basic
    @Column(name = "xa_phuong", nullable = false, length = 50)
    private String xaPhuong;

    public String getXaPhuong() {
        return xaPhuong;
    }

    public void setXaPhuong(String xaPhuong) {
        this.xaPhuong = xaPhuong;
    }

    @Basic
    @Column(name = "trang_thai", nullable = false)
    private int trangThai;

    public int getTrangThai() {
        return trangThai;
    }

    public void setTrangThai(int trangThai) {
        this.trangThai = trangThai;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DiaChi diaChi = (DiaChi) o;
        return id == diaChi.id && trangThai == diaChi.trangThai && Objects.equals(tinhThanhPho, diaChi.tinhThanhPho) && Objects.equals(quanHuyen, diaChi.quanHuyen) && Objects.equals(xaPhuong, diaChi.xaPhuong);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, tinhThanhPho, quanHuyen, xaPhuong, trangThai);
    }
}
