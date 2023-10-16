package com.workshop.bookstore.entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
public class PhuongThucThanhToan {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @javax.persistence.Column(name = "id_phuong_thuc", nullable = false)
    private long idPhuongThuc;

    public long getIdPhuongThuc() {
        return idPhuongThuc;
    }

    public void setIdPhuongThuc(long idPhuongThuc) {
        this.idPhuongThuc = idPhuongThuc;
    }

    @Basic
    @Column(name = "ten_phuong_thuc", nullable = false, length = 25)
    private String tenPhuongThuc;

    public String getTenPhuongThuc() {
        return tenPhuongThuc;
    }

    public void setTenPhuongThuc(String tenPhuongThuc) {
        this.tenPhuongThuc = tenPhuongThuc;
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
        PhuongThucThanhToan that = (PhuongThucThanhToan) o;
        return idPhuongThuc == that.idPhuongThuc && trangThai == that.trangThai && Objects.equals(tenPhuongThuc, that.tenPhuongThuc);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idPhuongThuc, tenPhuongThuc, trangThai);
    }
}
