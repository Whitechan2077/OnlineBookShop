package com.workshop.bookstore.entity;

import javax.persistence.*;
import java.sql.Date;
import java.util.Objects;

@Entity
public class Sach {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @javax.persistence.Column(name = "id_sach", nullable = false)
    private long idSach;

    public long getIdSach() {
        return idSach;
    }

    public void setIdSach(long idSach) {
        this.idSach = idSach;
    }

    @Basic
    @Column(name = "ten_sach", nullable = false, length = 255)
    private String tenSach;

    public String getTenSach() {
        return tenSach;
    }

    public void setTenSach(String tenSach) {
        this.tenSach = tenSach;
    }

    @Basic
    @Column(name = "Khoi_luong", nullable = false)
    private int khoiLuong;

    public int getKhoiLuong() {
        return khoiLuong;
    }

    public void setKhoiLuong(int khoiLuong) {
        this.khoiLuong = khoiLuong;
    }

    @Basic
    @Column(name = "nam_xuat_ban", nullable = false)
    private int namXuatBan;

    public int getNamXuatBan() {
        return namXuatBan;
    }

    public void setNamXuatBan(int namXuatBan) {
        this.namXuatBan = namXuatBan;
    }

    @Basic
    @Column(name = "ngay_them", nullable = false)
    private Date ngayThem;

    public Date getNgayThem() {
        return ngayThem;
    }

    public void setNgayThem(Date ngayThem) {
        this.ngayThem = ngayThem;
    }

    @Basic
    @Column(name = "gia", nullable = false, precision = 0)
    private double gia;

    public double getGia() {
        return gia;
    }

    public void setGia(double gia) {
        this.gia = gia;
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

    @Basic
    @Column(name = "anh", nullable = true, length = 255)
    private String anh;

    public String getAnh() {
        return anh;
    }

    public void setAnh(String anh) {
        this.anh = anh;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Sach sach = (Sach) o;
        return idSach == sach.idSach && khoiLuong == sach.khoiLuong && namXuatBan == sach.namXuatBan && Double.compare(gia, sach.gia) == 0 && trangThai == sach.trangThai && Objects.equals(tenSach, sach.tenSach) && Objects.equals(ngayThem, sach.ngayThem) && Objects.equals(anh, sach.anh);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idSach, tenSach, khoiLuong, namXuatBan, ngayThem, gia, trangThai, anh);
    }
}
