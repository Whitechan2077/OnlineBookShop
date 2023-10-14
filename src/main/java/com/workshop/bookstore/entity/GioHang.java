package com.workshop.bookstore.entity;

import javax.persistence.*;
import java.util.Collection;
import java.util.Objects;

@Entity
public class GioHang {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "IDGioHang", nullable = false)
    private Integer idGioHang;
    @Basic
    @Column(name = "TrangThai", nullable = true)
    private Integer trangThai;
    @ManyToOne
    @JoinColumn(name = "UID", referencedColumnName = "UID")
    private Account accountByUid;
    @OneToMany(mappedBy = "gioHangByIdGioHang")
    private Collection<GioHangChiTiet> gioHangChiTietsByIdGioHang;

    public Integer getIdGioHang() {
        return idGioHang;
    }

    public void setIdGioHang(Integer idGioHang) {
        this.idGioHang = idGioHang;
    }

    public Integer getTrangThai() {
        return trangThai;
    }

    public void setTrangThai(Integer trangThai) {
        this.trangThai = trangThai;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GioHang gioHang = (GioHang) o;
        return Objects.equals(idGioHang, gioHang.idGioHang) && Objects.equals(trangThai, gioHang.trangThai);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idGioHang, trangThai);
    }

    public Account getAccountByUid() {
        return accountByUid;
    }

    public void setAccountByUid(Account accountByUid) {
        this.accountByUid = accountByUid;
    }

    public Collection<GioHangChiTiet> getGioHangChiTietsByIdGioHang() {
        return gioHangChiTietsByIdGioHang;
    }

    public void setGioHangChiTietsByIdGioHang(Collection<GioHangChiTiet> gioHangChiTietsByIdGioHang) {
        this.gioHangChiTietsByIdGioHang = gioHangChiTietsByIdGioHang;
    }
}
