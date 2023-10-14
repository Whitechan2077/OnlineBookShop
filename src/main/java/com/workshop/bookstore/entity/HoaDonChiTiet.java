package com.workshop.bookstore.entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
public class HoaDonChiTiet {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "ID", nullable = false)
    private Integer id;
    @Basic
    @Column(name = "TrangThai", nullable = true)
    private Integer trangThai;
    @Basic
    @Column(name = "NgayThem", nullable = true)
    private Integer ngayThem;
    @ManyToOne
    @JoinColumn(name = "IDHoaDon", referencedColumnName = "IdHoaDon")
    private HoaDon hoaDonByIdHoaDon;
    @ManyToOne
    @JoinColumn(name = "IDSach", referencedColumnName = "IdSach")
    private Sach sachByIdSach;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getTrangThai() {
        return trangThai;
    }

    public void setTrangThai(Integer trangThai) {
        this.trangThai = trangThai;
    }

    public Integer getNgayThem() {
        return ngayThem;
    }

    public void setNgayThem(Integer ngayThem) {
        this.ngayThem = ngayThem;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        HoaDonChiTiet that = (HoaDonChiTiet) o;
        return Objects.equals(id, that.id) && Objects.equals(trangThai, that.trangThai) && Objects.equals(ngayThem, that.ngayThem);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, trangThai, ngayThem);
    }

    public HoaDon getHoaDonByIdHoaDon() {
        return hoaDonByIdHoaDon;
    }

    public void setHoaDonByIdHoaDon(HoaDon hoaDonByIdHoaDon) {
        this.hoaDonByIdHoaDon = hoaDonByIdHoaDon;
    }

    public Sach getSachByIdSach() {
        return sachByIdSach;
    }

    public void setSachByIdSach(Sach sachByIdSach) {
        this.sachByIdSach = sachByIdSach;
    }
}
