package com.workshop.bookstore.entity;

import javax.persistence.*;
import java.sql.Date;
import java.util.Objects;

@Entity
public class GioHangChiTiet {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "ID", nullable = false)
    private Integer id;
    @Basic
    @Column(name = "SoLuong", nullable = true)
    private Integer soLuong;
    @Basic
    @Column(name = "NgayThem", nullable = true)
    private Date ngayThem;
    @ManyToOne
    @JoinColumn(name = "IDGioHang", referencedColumnName = "IDGioHang")
    private GioHang gioHangByIdGioHang;
    @ManyToOne
    @JoinColumn(name = "IDSach", referencedColumnName = "IdSach")
    private Sach sachByIdSach;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(Integer soLuong) {
        this.soLuong = soLuong;
    }

    public Date getNgayThem() {
        return ngayThem;
    }

    public void setNgayThem(Date ngayThem) {
        this.ngayThem = ngayThem;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GioHangChiTiet that = (GioHangChiTiet) o;
        return Objects.equals(id, that.id) && Objects.equals(soLuong, that.soLuong) && Objects.equals(ngayThem, that.ngayThem);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, soLuong, ngayThem);
    }

    public GioHang getGioHangByIdGioHang() {
        return gioHangByIdGioHang;
    }

    public void setGioHangByIdGioHang(GioHang gioHangByIdGioHang) {
        this.gioHangByIdGioHang = gioHangByIdGioHang;
    }

    public Sach getSachByIdSach() {
        return sachByIdSach;
    }

    public void setSachByIdSach(Sach sachByIdSach) {
        this.sachByIdSach = sachByIdSach;
    }
}
