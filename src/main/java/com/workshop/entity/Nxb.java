package com.workshop.entity;

import javax.persistence.*;
import java.sql.Date;
import java.util.Collection;
import java.util.Objects;

@Entity
public class Nxb {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "IdNXB", nullable = false)
    private int idNxb;
    @Basic
    @Column(name = "TenNXB", nullable = true, length = 100)
    private String tenNxb;
    @Basic
    @Column(name = "NgayDangKi", nullable = true)
    private Date ngayDangKi;
    @Basic
    @Column(name = "NguoiTao", nullable = true)
    private Integer nguoiTao;
    @Basic
    @Column(name = "CapNhatBoi", nullable = true)
    private Integer capNhatBoi;
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

    public int getIdNxb() {
        return idNxb;
    }

    public void setIdNxb(int idNxb) {
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

    public Integer getNguoiTao() {
        return nguoiTao;
    }

    public void setNguoiTao(Integer nguoiTao) {
        this.nguoiTao = nguoiTao;
    }

    public Integer getCapNhatBoi() {
        return capNhatBoi;
    }

    public void setCapNhatBoi(Integer capNhatBoi) {
        this.capNhatBoi = capNhatBoi;
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
        return idNxb == nxb.idNxb && Objects.equals(tenNxb, nxb.tenNxb) && Objects.equals(ngayDangKi, nxb.ngayDangKi) && Objects.equals(nguoiTao, nxb.nguoiTao) && Objects.equals(capNhatBoi, nxb.capNhatBoi) && Objects.equals(trangThai, nxb.trangThai);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idNxb, tenNxb, ngayDangKi, nguoiTao, capNhatBoi, trangThai);
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
