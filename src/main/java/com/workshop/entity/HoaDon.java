package com.workshop.entity;

import javax.persistence.*;
import java.sql.Date;
import java.util.Collection;
import java.util.Objects;

@Entity
public class HoaDon {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "IdHoaDon", nullable = false)
    private int idHoaDon;
    @Basic
    @Column(name = "NgayTao", nullable = true)
    private Date ngayTao;
    @Basic
    @Column(name = "TongTien", nullable = true, precision = 0)
    private Double tongTien;
    @Basic
    @Column(name = "DiaChi", nullable = true)
    private Integer diaChi;
    @Basic
    @Column(name = "TrangThai", nullable = true)
    private Integer trangThai;
    @Basic
    @Column(name = "NhanVienQuanLy", nullable = true)
    private Integer nhanVienQuanLy;
    @ManyToOne
    @JoinColumn(name = "NhanVienQuanLy", referencedColumnName = "UID")
    private Account accountByNhanVienQuanLy;
    @OneToMany(mappedBy = "hoaDonByIdHoaDon")
    private Collection<HoaDonChiTiet> hoaDonChiTietsByIdHoaDon;

    public int getIdHoaDon() {
        return idHoaDon;
    }

    public void setIdHoaDon(int idHoaDon) {
        this.idHoaDon = idHoaDon;
    }

    public Date getNgayTao() {
        return ngayTao;
    }

    public void setNgayTao(Date ngayTao) {
        this.ngayTao = ngayTao;
    }

    public Double getTongTien() {
        return tongTien;
    }

    public void setTongTien(Double tongTien) {
        this.tongTien = tongTien;
    }

    public Integer getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(Integer diaChi) {
        this.diaChi = diaChi;
    }

    public Integer getTrangThai() {
        return trangThai;
    }

    public void setTrangThai(Integer trangThai) {
        this.trangThai = trangThai;
    }

    public Integer getNhanVienQuanLy() {
        return nhanVienQuanLy;
    }

    public void setNhanVienQuanLy(Integer nhanVienQuanLy) {
        this.nhanVienQuanLy = nhanVienQuanLy;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        HoaDon hoaDon = (HoaDon) o;
        return idHoaDon == hoaDon.idHoaDon && Objects.equals(ngayTao, hoaDon.ngayTao) && Objects.equals(tongTien, hoaDon.tongTien) && Objects.equals(diaChi, hoaDon.diaChi) && Objects.equals(trangThai, hoaDon.trangThai) && Objects.equals(nhanVienQuanLy, hoaDon.nhanVienQuanLy);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idHoaDon, ngayTao, tongTien, diaChi, trangThai, nhanVienQuanLy);
    }

    public Account getAccountByNhanVienQuanLy() {
        return accountByNhanVienQuanLy;
    }

    public void setAccountByNhanVienQuanLy(Account accountByNhanVienQuanLy) {
        this.accountByNhanVienQuanLy = accountByNhanVienQuanLy;
    }

    public Collection<HoaDonChiTiet> getHoaDonChiTietsByIdHoaDon() {
        return hoaDonChiTietsByIdHoaDon;
    }

    public void setHoaDonChiTietsByIdHoaDon(Collection<HoaDonChiTiet> hoaDonChiTietsByIdHoaDon) {
        this.hoaDonChiTietsByIdHoaDon = hoaDonChiTietsByIdHoaDon;
    }
}
