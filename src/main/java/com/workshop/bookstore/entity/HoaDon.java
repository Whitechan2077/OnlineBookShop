package com.workshop.bookstore.entity;

import javax.persistence.*;
import java.sql.Date;
import java.util.Objects;

@Entity
public class HoaDon {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @javax.persistence.Column(name = "id_hoa_don", nullable = false)
    private long idHoaDon;

    public long getIdHoaDon() {
        return idHoaDon;
    }

    public void setIdHoaDon(long idHoaDon) {
        this.idHoaDon = idHoaDon;
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
    @Column(name = "ten_nguoi_nhan", nullable = false, length = 50)
    private String tenNguoiNhan;

    public String getTenNguoiNhan() {
        return tenNguoiNhan;
    }

    public void setTenNguoiNhan(String tenNguoiNhan) {
        this.tenNguoiNhan = tenNguoiNhan;
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
    @Column(name = "tinh_thanh_pho", nullable = false)
    private int tinhThanhPho;

    public int getTinhThanhPho() {
        return tinhThanhPho;
    }

    public void setTinhThanhPho(int tinhThanhPho) {
        this.tinhThanhPho = tinhThanhPho;
    }

    @Basic
    @Column(name = "quan_huyen", nullable = false, length = 50)
    private String quanHuyen;

    public String getQuanHuyen() {
        return quanHuyen;
    }

    public void setQuanHuyen(String quanHuyen) {
        this.quanHuyen = quanHuyen;
    }

    @Basic
    @Column(name = "xa_phuong", nullable = false, length = 50)
    private String xaPhuong;

    public String getXaPhuong() {
        return xaPhuong;
    }

    public void setXaPhuong(String xaPhuong) {
        this.xaPhuong = xaPhuong;
    }

    @Basic
    @Column(name = "chi_tiet_dia_chi", nullable = false, length = 255)
    private String chiTietDiaChi;

    public String getChiTietDiaChi() {
        return chiTietDiaChi;
    }

    public void setChiTietDiaChi(String chiTietDiaChi) {
        this.chiTietDiaChi = chiTietDiaChi;
    }

    @Basic
    @Column(name = "trang_thai", nullable = false, length = 50)
    private String trangThai;

    public String getTrangThai() {
        return trangThai;
    }

    public void setTrangThai(String trangThai) {
        this.trangThai = trangThai;
    }

    @Basic
    @Column(name = "tong_tien", nullable = true, precision = 0)
    private Double tongTien;

    public Double getTongTien() {
        return tongTien;
    }

    public void setTongTien(Double tongTien) {
        this.tongTien = tongTien;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        HoaDon hoaDon = (HoaDon) o;
        return idHoaDon == hoaDon.idHoaDon && tinhThanhPho == hoaDon.tinhThanhPho && Objects.equals(ngayTao, hoaDon.ngayTao) && Objects.equals(tenNguoiNhan, hoaDon.tenNguoiNhan) && Objects.equals(sdt, hoaDon.sdt) && Objects.equals(quanHuyen, hoaDon.quanHuyen) && Objects.equals(xaPhuong, hoaDon.xaPhuong) && Objects.equals(chiTietDiaChi, hoaDon.chiTietDiaChi) && Objects.equals(trangThai, hoaDon.trangThai) && Objects.equals(tongTien, hoaDon.tongTien);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idHoaDon, ngayTao, tenNguoiNhan, sdt, tinhThanhPho, quanHuyen, xaPhuong, chiTietDiaChi, trangThai, tongTien);
    }
}
