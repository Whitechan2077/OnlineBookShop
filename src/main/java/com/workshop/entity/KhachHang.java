package com.workshop.entity;

import javax.persistence.*;
import java.sql.Date;
import java.util.Objects;

@Entity
public class KhachHang {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "ID", nullable = false)
    private long id;
    @Basic
    @Column(name = "TenKhachHang", nullable = true, length = 60)
    private String tenKhachHang;
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
    @Column(name = "Email", nullable = true)
    private Integer email;
    @Basic
    @Column(name = "NgayDangKi", nullable = true)
    private Date ngayDangKi;
    @ManyToOne
    @JoinColumn(name = "UID", referencedColumnName = "UID")
    private Account accountByUid;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTenKhachHang() {
        return tenKhachHang;
    }

    public void setTenKhachHang(String tenKhachHang) {
        this.tenKhachHang = tenKhachHang;
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

    public Integer getEmail() {
        return email;
    }

    public void setEmail(Integer email) {
        this.email = email;
    }

    public Date getNgayDangKi() {
        return ngayDangKi;
    }

    public void setNgayDangKi(Date ngayDangKi) {
        this.ngayDangKi = ngayDangKi;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        KhachHang khachHang = (KhachHang) o;
        return id == khachHang.id && Objects.equals(tenKhachHang, khachHang.tenKhachHang) && Objects.equals(sdt, khachHang.sdt) && Objects.equals(anh, khachHang.anh) && Objects.equals(uid, khachHang.uid) && Objects.equals(email, khachHang.email) && Objects.equals(ngayDangKi, khachHang.ngayDangKi);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, tenKhachHang, sdt, anh, uid, email, ngayDangKi);
    }

    public Account getAccountByUid() {
        return accountByUid;
    }

    public void setAccountByUid(Account accountByUid) {
        this.accountByUid = accountByUid;
    }
}
