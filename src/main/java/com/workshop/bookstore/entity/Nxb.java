package com.workshop.bookstore.entity;

import javax.persistence.*;
import java.sql.Date;
import java.util.Collection;
import java.util.Objects;

@Entity
public class Nxb {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "IdNXB", nullable = false)
    private Integer idNxb;
    @Basic
    @Column(name = "TenNXB", nullable = true, length = 100)
    private String tenNxb;
    @Basic
    @Column(name = "NgayDangKi", nullable = true)
    private Date ngayDangKi;
    @Basic
    @Column(name = "trangThai", nullable = true)
    private Integer trangThai;
    @ManyToOne
    @JoinColumn(name = "NguoiTao", referencedColumnName = "UID")
    private Account accountByNguoiTao;
    @ManyToOne
    @JoinColumn(name = "CapNhatBoi", referencedColumnName = "UID")
    private Account accountByCapNhatBoi;
    @OneToMany(mappedBy = "nxbByIdNhaXuatBan")
    private Collection<Sach> sachesByIdNxb;

    public Integer getIdNxb() {
        return idNxb;
    }

    public void setIdNxb(Integer idNxb) {
        this.idNxb = idNxb;
    }

    public String getTenNxb() {
        return tenNxb;
    }

    public void setTenNxb(String tenNxb) {
        this.tenNxb = tenNxb;
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
        Nxb nxb = (Nxb) o;
        return Objects.equals(idNxb, nxb.idNxb) && Objects.equals(tenNxb, nxb.tenNxb) && Objects.equals(ngayDangKi, nxb.ngayDangKi) && Objects.equals(trangThai, nxb.trangThai);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idNxb, tenNxb, ngayDangKi, trangThai);
    }

    public Account getAccountByNguoiTao() {
        return accountByNguoiTao;
    }

    public void setAccountByNguoiTao(Account accountByNguoiTao) {
        this.accountByNguoiTao = accountByNguoiTao;
    }

    public Account getAccountByCapNhatBoi() {
        return accountByCapNhatBoi;
    }

    public void setAccountByCapNhatBoi(Account accountByCapNhatBoi) {
        this.accountByCapNhatBoi = accountByCapNhatBoi;
    }

    public Collection<Sach> getSachesByIdNxb() {
        return sachesByIdNxb;
    }

    public void setSachesByIdNxb(Collection<Sach> sachesByIdNxb) {
        this.sachesByIdNxb = sachesByIdNxb;
    }
}
