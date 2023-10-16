package com.workshop.bookstore.entity;

import javax.persistence.*;
import java.sql.Date;
import java.util.Objects;

@Entity
public class NhaCungCap {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @javax.persistence.Column(name = "id_nha_cung_cap", nullable = false)
    private long idNhaCungCap;

    public long getIdNhaCungCap() {
        return idNhaCungCap;
    }

    public void setIdNhaCungCap(long idNhaCungCap) {
        this.idNhaCungCap = idNhaCungCap;
    }

    @Basic
    @Column(name = "ten_nha_cung_cap", nullable = false, length = 100)
    private String tenNhaCungCap;

    public String getTenNhaCungCap() {
        return tenNhaCungCap;
    }

    public void setTenNhaCungCap(String tenNhaCungCap) {
        this.tenNhaCungCap = tenNhaCungCap;
    }

    @Basic
    @Column(name = "ngay_dang_ki", nullable = false)
    private Date ngayDangKi;

    public Date getNgayDangKi() {
        return ngayDangKi;
    }

    public void setNgayDangKi(Date ngayDangKi) {
        this.ngayDangKi = ngayDangKi;
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
        NhaCungCap that = (NhaCungCap) o;
        return idNhaCungCap == that.idNhaCungCap && trangThai == that.trangThai && Objects.equals(tenNhaCungCap, that.tenNhaCungCap) && Objects.equals(ngayDangKi, that.ngayDangKi);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idNhaCungCap, tenNhaCungCap, ngayDangKi, trangThai);
    }
}
