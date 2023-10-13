package com.workshop.entity;

import javax.persistence.*;
import java.sql.Date;
import java.util.Objects;

@Entity
public class NhanVien {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "ID", nullable = false)
    private long id;
    @Basic
    @Column(name = "TenNhanVien", nullable = true, length = 60)
    private String tenNhanVien;
    @Basic
    @Column(name = "SDT", nullable = true, length = 10)
    private String sdt;
    @Basic
    @Column(name = "Anh", nullable = true, length = 255)
    private String anh;
    @Basic
    @Column(name = "UID", nullable = true)
    private Integer uid;
    @Basic
    @Column(name = "NgayBatDauHopDong", nullable = true)
    private Date ngayBatDauHopDong;
    @Basic
    @Column(name = "NgayKetThucHopDong", nullable = true)
    private Date ngayKetThucHopDong;
    @Basic
    @Column(name = "GhiChu", nullable = true)
    private Integer ghiChu;
    @Basic
    @Column(name = "NgaySinh", nullable = true)
    private Date ngaySinh;
    @ManyToOne
    @JoinColumn(name = "UID", referencedColumnName = "UID")
    private Account accountByUid;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTenNhanVien() {
        return tenNhanVien;
    }

    public void setTenNhanVien(String tenNhanVien) {
        this.tenNhanVien = tenNhanVien;
    }

    public String getSdt() {
        return sdt;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }

    public String getAnh() {
        return anh;
    }

    public void setAnh(String anh) {
        this.anh = anh;
    }

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public Date getNgayBatDauHopDong() {
        return ngayBatDauHopDong;
    }

    public void setNgayBatDauHopDong(Date ngayBatDauHopDong) {
        this.ngayBatDauHopDong = ngayBatDauHopDong;
    }

    public Date getNgayKetThucHopDong() {
        return ngayKetThucHopDong;
    }

    public void setNgayKetThucHopDong(Date ngayKetThucHopDong) {
        this.ngayKetThucHopDong = ngayKetThucHopDong;
    }

    public Integer getGhiChu() {
        return ghiChu;
    }

    public void setGhiChu(Integer ghiChu) {
        this.ghiChu = ghiChu;
    }

    public Date getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(Date ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        NhanVien nhanVien = (NhanVien) o;
        return id == nhanVien.id && Objects.equals(tenNhanVien, nhanVien.tenNhanVien) && Objects.equals(sdt, nhanVien.sdt) && Objects.equals(anh, nhanVien.anh) && Objects.equals(uid, nhanVien.uid) && Objects.equals(ngayBatDauHopDong, nhanVien.ngayBatDauHopDong) && Objects.equals(ngayKetThucHopDong, nhanVien.ngayKetThucHopDong) && Objects.equals(ghiChu, nhanVien.ghiChu) && Objects.equals(ngaySinh, nhanVien.ngaySinh);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, tenNhanVien, sdt, anh, uid, ngayBatDauHopDong, ngayKetThucHopDong, ghiChu, ngaySinh);
    }

    public Account getAccountByUid() {
        return accountByUid;
    }

    public void setAccountByUid(Account accountByUid) {
        this.accountByUid = accountByUid;
    }
}
