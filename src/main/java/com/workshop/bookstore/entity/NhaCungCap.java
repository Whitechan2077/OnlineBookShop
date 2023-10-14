package com.workshop.bookstore.entity;

import javax.persistence.*;
import java.sql.Date;
import java.util.Collection;
import java.util.Objects;

@Entity
public class NhaCungCap {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "IdNhaCungCap", nullable = false)
    private Integer idNhaCungCap;
    @Basic
    @Column(name = "TenNhaCungCap", nullable = true, length = 50)
    private String tenNhaCungCap;
    @Basic
    @Column(name = "NgayDangKi", nullable = true)
    private Date ngayDangKi;
    @Basic
    @Column(name = "TrangThai", nullable = true)
    private Integer trangThai;
    @ManyToOne
    @JoinColumn(name = "ThemBoi", referencedColumnName = "UID")
    private Account accountByThemBoi;
    @ManyToOne
    @JoinColumn(name = "CapNhatBoi", referencedColumnName = "UID")
    private Account accountByCapNhatBoi;
    @OneToMany(mappedBy = "nhaCungCapByIdNhaCungCap")
    private Collection<Sach> sachesByIdNhaCungCap;

    public Integer getIdNhaCungCap() {
        return idNhaCungCap;
    }

    public void setIdNhaCungCap(Integer idNhaCungCap) {
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
        return Objects.equals(idNhaCungCap, that.idNhaCungCap) && Objects.equals(tenNhaCungCap, that.tenNhaCungCap) && Objects.equals(ngayDangKi, that.ngayDangKi) && Objects.equals(trangThai, that.trangThai);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idNhaCungCap, tenNhaCungCap, ngayDangKi, trangThai);
    }

    public Account getAccountByThemBoi() {
        return accountByThemBoi;
    }

    public void setAccountByThemBoi(Account accountByThemBoi) {
        this.accountByThemBoi = accountByThemBoi;
    }

    public Account getAccountByCapNhatBoi() {
        return accountByCapNhatBoi;
    }

    public void setAccountByCapNhatBoi(Account accountByCapNhatBoi) {
        this.accountByCapNhatBoi = accountByCapNhatBoi;
    }

    public Collection<Sach> getSachesByIdNhaCungCap() {
        return sachesByIdNhaCungCap;
    }

    public void setSachesByIdNhaCungCap(Collection<Sach> sachesByIdNhaCungCap) {
        this.sachesByIdNhaCungCap = sachesByIdNhaCungCap;
    }
}
