package com.workshop.entity;

import javax.persistence.*;
import java.sql.Date;
import java.util.Objects;

@Entity
public class GioHangChiTiet {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "ID", nullable = false)
    private int id;
    @Basic
    @Column(name = "IDGioHang", nullable = true)
    private Integer idGioHang;
    @Basic
    @Column(name = "IDSach", nullable = true)
    private Integer idSach;
    @Basic
    @Column(name = "SoLuong", nullable = true)
    private Integer soLuong;
    @Basic
    @Column(name = "NgayThem", nullable = true)
    private Date ngayThem;
    @ManyToOne
    @JoinColumn(name = "IDSach", referencedColumnName = "IdSach")
    private Sach sachByIdSach;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Integer getIdGioHang() {
        return idGioHang;
    }

    public void setIdGioHang(Integer idGioHang) {
        this.idGioHang = idGioHang;
    }

    public Integer getIdSach() {
        return idSach;
    }

    public void setIdSach(Integer idSach) {
        this.idSach = idSach;
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
        return id == that.id && Objects.equals(idGioHang, that.idGioHang) && Objects.equals(idSach, that.idSach) && Objects.equals(soLuong, that.soLuong) && Objects.equals(ngayThem, that.ngayThem);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, idGioHang, idSach, soLuong, ngayThem);
    }

    public Sach getSachByIdSach() {
        return sachByIdSach;
    }

    public void setSachByIdSach(Sach sachByIdSach) {
        this.sachByIdSach = sachByIdSach;
    }
}
