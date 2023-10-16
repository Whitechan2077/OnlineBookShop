package com.workshop.bookstore.entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
public class KhoSach {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @javax.persistence.Column(name = "id_kho_sach", nullable = false)
    private long idKhoSach;

    public long getIdKhoSach() {
        return idKhoSach;
    }

    public void setIdKhoSach(long idKhoSach) {
        this.idKhoSach = idKhoSach;
    }

    @Basic
    @Column(name = "ten_kho_sach", nullable = false, length = 60)
    private String tenKhoSach;

    public String getTenKhoSach() {
        return tenKhoSach;
    }

    public void setTenKhoSach(String tenKhoSach) {
        this.tenKhoSach = tenKhoSach;
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
        KhoSach khoSach = (KhoSach) o;
        return idKhoSach == khoSach.idKhoSach && trangThai == khoSach.trangThai && Objects.equals(tenKhoSach, khoSach.tenKhoSach);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idKhoSach, tenKhoSach, trangThai);
    }
}
