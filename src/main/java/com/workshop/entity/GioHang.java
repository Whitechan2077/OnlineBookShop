package com.workshop.entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
public class GioHang {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "IDGioHang", nullable = false)
    private int idGioHang;
    @Basic
    @Column(name = "UID", nullable = true)
    private Integer uid;
    @Basic
    @Column(name = "TrangThai", nullable = true)
    private Integer trangThai;
    @ManyToOne
    @JoinColumn(name = "UID", referencedColumnName = "UID")
    private Account accountByUid;

    public int getIdGioHang() {
        return idGioHang;
    }

    public void setIdGioHang(int idGioHang) {
        this.idGioHang = idGioHang;
    }

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
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
        return idGioHang == gioHang.idGioHang && Objects.equals(uid, gioHang.uid) && Objects.equals(trangThai, gioHang.trangThai);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idGioHang, uid, trangThai);
    }

    public Account getAccountByUid() {
        return accountByUid;
    }

    public void setAccountByUid(Account accountByUid) {
        this.accountByUid = accountByUid;
    }
}
