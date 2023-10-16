package com.workshop.bookstore.entity;

import javax.persistence.*;
import java.sql.Date;
import java.util.Objects;

@Entity
public class NhanVien {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @javax.persistence.Column(name = "id_nhan_vien", nullable = false)
    private long idNhanVien;

    public long getIdNhanVien() {
        return idNhanVien;
    }

    public void setIdNhanVien(long idNhanVien) {
        this.idNhanVien = idNhanVien;
    }

    @Basic
    @Column(name = "ho_va_ten", nullable = false, length = 60)
    private String hoVaTen;

    public String getHoVaTen() {
        return hoVaTen;
    }

    public void setHoVaTen(String hoVaTen) {
        this.hoVaTen = hoVaTen;
    }

    @Basic
    @Column(name = "sdt", nullable = false, length = 10)
    private String sdt;

    public String getSdt() {
        return sdt;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }

    @Basic
    @Column(name = "email", nullable = false, length = 255)
    private String email;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Basic
    @Column(name = "ngay_ki_hop_dong", nullable = false)
    private Date ngayKiHopDong;

    public Date getNgayKiHopDong() {
        return ngayKiHopDong;
    }

    public void setNgayKiHopDong(Date ngayKiHopDong) {
        this.ngayKiHopDong = ngayKiHopDong;
    }

    @Basic
    @Column(name = "ngay_lam_viec", nullable = true)
    private Date ngayLamViec;

    public Date getNgayLamViec() {
        return ngayLamViec;
    }

    public void setNgayLamViec(Date ngayLamViec) {
        this.ngayLamViec = ngayLamViec;
    }

    @Basic
    @Column(name = "ngay_nghi_viec", nullable = true)
    private Date ngayNghiViec;

    public Date getNgayNghiViec() {
        return ngayNghiViec;
    }

    public void setNgayNghiViec(Date ngayNghiViec) {
        this.ngayNghiViec = ngayNghiViec;
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
        NhanVien nhanVien = (NhanVien) o;
        return idNhanVien == nhanVien.idNhanVien && trangThai == nhanVien.trangThai && Objects.equals(hoVaTen, nhanVien.hoVaTen) && Objects.equals(sdt, nhanVien.sdt) && Objects.equals(email, nhanVien.email) && Objects.equals(ngayKiHopDong, nhanVien.ngayKiHopDong) && Objects.equals(ngayLamViec, nhanVien.ngayLamViec) && Objects.equals(ngayNghiViec, nhanVien.ngayNghiViec);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idNhanVien, hoVaTen, sdt, email, ngayKiHopDong, ngayLamViec, ngayNghiViec, trangThai);
    }
}
