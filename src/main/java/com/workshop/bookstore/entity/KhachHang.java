package com.workshop.bookstore.entity;

import javax.persistence.*;
import java.sql.Date;
import java.util.Objects;

@Entity
public class KhachHang {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @javax.persistence.Column(name = "id_khach", nullable = false)
    private long idKhach;

    public long getIdKhach() {
        return idKhach;
    }

    public void setIdKhach(long idKhach) {
        this.idKhach = idKhach;
    }

    @Basic
    @Column(name = "ten_khach", nullable = false, length = 100)
    private String tenKhach;

    public String getTenKhach() {
        return tenKhach;
    }

    public void setTenKhach(String tenKhach) {
        this.tenKhach = tenKhach;
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
    @Column(name = "sdt", nullable = false, length = 10)
    private String sdt;

    public String getSdt() {
        return sdt;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }

    @Basic
    @Column(name = "ngay_dang_ki", nullable = false)
    private Date ngayDangKi;

    public Date getNgayDangKi() {
        return ngayDangKi;
    }

    public void setNgayDangKi(Date ngayDangKi) {
        this.ngayDangKi = ngayDangKi;
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
    @Column(name = "anh", nullable = false, length = 255)
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
        KhachHang khachHang = (KhachHang) o;
        return idKhach == khachHang.idKhach && trangThai == khachHang.trangThai && Objects.equals(tenKhach, khachHang.tenKhach) && Objects.equals(email, khachHang.email) && Objects.equals(sdt, khachHang.sdt) && Objects.equals(ngayDangKi, khachHang.ngayDangKi) && Objects.equals(anh, khachHang.anh);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idKhach, tenKhach, email, sdt, ngayDangKi, trangThai, anh);
    }
}
