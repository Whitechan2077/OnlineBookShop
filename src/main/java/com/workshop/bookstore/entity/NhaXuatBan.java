package com.workshop.bookstore.entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
public class NhaXuatBan {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @javax.persistence.Column(name = "id_nha_xuat_ban", nullable = false)
    private long idNhaXuatBan;

    public long getIdNhaXuatBan() {
        return idNhaXuatBan;
    }

    public void setIdNhaXuatBan(long idNhaXuatBan) {
        this.idNhaXuatBan = idNhaXuatBan;
    }

    @Basic
    @Column(name = "ten_nxb", nullable = true)
    private Integer tenNxb;

    public Integer getTenNxb() {
        return tenNxb;
    }

    public void setTenNxb(Integer tenNxb) {
        this.tenNxb = tenNxb;
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
        NhaXuatBan that = (NhaXuatBan) o;
        return idNhaXuatBan == that.idNhaXuatBan && trangThai == that.trangThai && Objects.equals(tenNxb, that.tenNxb);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idNhaXuatBan, tenNxb, trangThai);
    }
}
