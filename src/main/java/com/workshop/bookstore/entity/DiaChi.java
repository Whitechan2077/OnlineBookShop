package com.workshop.bookstore.entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
public class DiaChi {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "IdDiaChi", nullable = false)
    private Integer idDiaChi;
    @Basic
    @Column(name = "ThanhPho", nullable = true, length = 255)
    private String thanhPho;
    @Basic
    @Column(name = "QuanHuyen", nullable = true, length = 255)
    private String quanHuyen;
    @Basic
    @Column(name = "XaPhuong", nullable = true, length = 255)
    private String xaPhuong;
    @Basic
    @Column(name = "ChiTietDiaChi", nullable = true, length = 255)
    private String chiTietDiaChi;
    @Basic
    @Column(name = "TrangThai", nullable = true)
    private Integer trangThai;
    @Basic
    @Column(name = "Ten", nullable = true, length = 100)
    private String ten;
    @Basic
    @Column(name = "SDT", nullable = true, length = 10)
    private String sdt;
    @ManyToOne
    @JoinColumn(name = "UID", referencedColumnName = "UID")
    private Account accountByUid;

    public Integer getIdDiaChi() {
        return idDiaChi;
    }

    public void setIdDiaChi(Integer idDiaChi) {
        this.idDiaChi = idDiaChi;
    }

    public String getThanhPho() {
        return thanhPho;
    }

    public void setThanhPho(String thanhPho) {
        this.thanhPho = thanhPho;
    }

    public String getQuanHuyen() {
        return quanHuyen;
    }

    public void setQuanHuyen(String quanHuyen) {
        this.quanHuyen = quanHuyen;
    }

    public String getXaPhuong() {
        return xaPhuong;
    }

    public void setXaPhuong(String xaPhuong) {
        this.xaPhuong = xaPhuong;
    }

    public String getChiTietDiaChi() {
        return chiTietDiaChi;
    }

    public void setChiTietDiaChi(String chiTietDiaChi) {
        this.chiTietDiaChi = chiTietDiaChi;
    }

    public Integer getTrangThai() {
        return trangThai;
    }

    public void setTrangThai(Integer trangThai) {
        this.trangThai = trangThai;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getSdt() {
        return sdt;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DiaChi diaChi = (DiaChi) o;
        return Objects.equals(idDiaChi, diaChi.idDiaChi) && Objects.equals(thanhPho, diaChi.thanhPho) && Objects.equals(quanHuyen, diaChi.quanHuyen) && Objects.equals(xaPhuong, diaChi.xaPhuong) && Objects.equals(chiTietDiaChi, diaChi.chiTietDiaChi) && Objects.equals(trangThai, diaChi.trangThai) && Objects.equals(ten, diaChi.ten) && Objects.equals(sdt, diaChi.sdt);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idDiaChi, thanhPho, quanHuyen, xaPhuong, chiTietDiaChi, trangThai, ten, sdt);
    }

    public Account getAccountByUid() {
        return accountByUid;
    }

    public void setAccountByUid(Account accountByUid) {
        this.accountByUid = accountByUid;
    }
}
