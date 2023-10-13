package com.workshop.entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
public class HoaDonChiTiet {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "ID", nullable = false)
    private int id;
    @Basic
    @Column(name = "IDHoaDon", nullable = true)
    private Integer idHoaDon;
    @Basic
    @Column(name = "IDSach", nullable = true)
    private Integer idSach;
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

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Integer getIdHoaDon() {
        return idHoaDon;
    }

    public void setIdHoaDon(Integer idHoaDon) {
        this.idHoaDon = idHoaDon;
    }

    public Integer getIdSach() {
        return idSach;
    }

    public void setIdSach(Integer idSach) {
        this.idSach = idSach;
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
        return id == that.id && Objects.equals(idHoaDon, that.idHoaDon) && Objects.equals(idSach, that.idSach) && Objects.equals(trangThai, that.trangThai) && Objects.equals(ngayThem, that.ngayThem);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, idHoaDon, idSach, trangThai, ngayThem);
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
