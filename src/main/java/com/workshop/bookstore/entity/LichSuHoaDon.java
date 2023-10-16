package com.workshop.bookstore.entity;

import javax.persistence.*;
import java.sql.Date;
import java.util.Objects;

@Entity
public class LichSuHoaDon {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @javax.persistence.Column(name = "id", nullable = false)
    private long id;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @Basic
    @Column(name = "ngay_cap_nhat", nullable = false)
    private Date ngayCapNhat;

    public Date getNgayCapNhat() {
        return ngayCapNhat;
    }

    public void setNgayCapNhat(Date ngayCapNhat) {
        this.ngayCapNhat = ngayCapNhat;
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
        LichSuHoaDon that = (LichSuHoaDon) o;
        return id == that.id && trangThai == that.trangThai && Objects.equals(ngayCapNhat, that.ngayCapNhat);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, ngayCapNhat, trangThai);
    }
}
