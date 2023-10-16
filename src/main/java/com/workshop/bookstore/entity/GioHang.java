package com.workshop.bookstore.entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
public class GioHang {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @javax.persistence.Column(name = "id_gio_hang", nullable = false)
    private long idGioHang;

    public long getIdGioHang() {
        return idGioHang;
    }

    public void setIdGioHang(long idGioHang) {
        this.idGioHang = idGioHang;
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
        GioHang gioHang = (GioHang) o;
        return idGioHang == gioHang.idGioHang && trangThai == gioHang.trangThai;
    }

    @Override
    public int hashCode() {
        return Objects.hash(idGioHang, trangThai);
    }
}
