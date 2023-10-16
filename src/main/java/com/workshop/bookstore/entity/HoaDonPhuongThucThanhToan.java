package com.workshop.bookstore.entity;

import javax.persistence.*;
import java.sql.Date;
import java.util.Objects;

@Entity
public class HoaDonPhuongThucThanhToan {
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
    @Column(name = "ma_giao_dich", nullable = false, length = 255)
    private String maGiaoDich;

    public String getMaGiaoDich() {
        return maGiaoDich;
    }

    public void setMaGiaoDich(String maGiaoDich) {
        this.maGiaoDich = maGiaoDich;
    }

    @Basic
    @Column(name = "ngay_tao", nullable = false)
    private Date ngayTao;

    public Date getNgayTao() {
        return ngayTao;
    }

    public void setNgayTao(Date ngayTao) {
        this.ngayTao = ngayTao;
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
        HoaDonPhuongThucThanhToan that = (HoaDonPhuongThucThanhToan) o;
        return id == that.id && trangThai == that.trangThai && Objects.equals(maGiaoDich, that.maGiaoDich) && Objects.equals(ngayTao, that.ngayTao);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, maGiaoDich, ngayTao, trangThai);
    }
}
