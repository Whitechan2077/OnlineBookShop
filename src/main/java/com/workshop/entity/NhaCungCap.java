package com.workshop.entity;

import javax.persistence.*;
import java.sql.Date;
import java.util.Collection;
import java.util.Objects;

@Entity
public class NhaCungCap {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "IdNhaCungCap", nullable = false)
    private int idNhaCungCap;
    @Basic
    @Column(name = "TenNhaCungCap", nullable = true, length = 50)
    private String tenNhaCungCap;
    @Basic
    @Column(name = "NgayDangKi", nullable = true)
    private Date ngayDangKi;
    @Basic
    @Column(name = "TrangThai", nullable = true)
    private Integer trangThai;
    @OneToMany(mappedBy = "nhaCungCapByIdNhaCungCap")
    private Collection<Sach> sachesByIdNhaCungCap;

    public int getIdNhaCungCap() {
        return idNhaCungCap;
    }

    public void setIdNhaCungCap(int idNhaCungCap) {
        this.idNhaCungCap = idNhaCungCap;
    }

    public String getTenNhaCungCap() {
        return tenNhaCungCap;
    }

    public void setTenNhaCungCap(String tenNhaCungCap) {
        this.tenNhaCungCap = tenNhaCungCap;
    }

    public Date getNgayDangKi() {
        return ngayDangKi;
    }

    public void setNgayDangKi(Date ngayDangKi) {
        this.ngayDangKi = ngayDangKi;
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
        NhaCungCap that = (NhaCungCap) o;
        return idNhaCungCap == that.idNhaCungCap && Objects.equals(tenNhaCungCap, that.tenNhaCungCap) && Objects.equals(ngayDangKi, that.ngayDangKi) && Objects.equals(trangThai, that.trangThai);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idNhaCungCap, tenNhaCungCap, ngayDangKi, trangThai);
    }

    public Collection<Sach> getSachesByIdNhaCungCap() {
        return sachesByIdNhaCungCap;
    }

    public void setSachesByIdNhaCungCap(Collection<Sach> sachesByIdNhaCungCap) {
        this.sachesByIdNhaCungCap = sachesByIdNhaCungCap;
    }
}
