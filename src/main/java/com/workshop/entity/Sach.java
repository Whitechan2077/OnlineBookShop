package com.workshop.entity;

import javax.persistence.*;
import java.sql.Date;
import java.util.Collection;
import java.util.Objects;

@Entity
public class Sach {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "IdSach", nullable = false)
    private int idSach;
    @Basic
    @Column(name = "TenSach", nullable = true, length = 255)
    private String tenSach;
    @Basic
    @Column(name = "TaiBan", nullable = true)
    private Integer taiBan;
    @Basic
    @Column(name = "GiaTien", nullable = true, precision = 0)
    private Double giaTien;
    @Basic
    @Column(name = "NgayXuatBan", nullable = true)
    private Date ngayXuatBan;
    @Basic
    @Column(name = "NoiDung", nullable = true, length = 255)
    private String noiDung;
    @Basic
    @Column(name = "NgayThem", nullable = true)
    private Date ngayThem;
    @Basic
    @Column(name = "NgonNgu", nullable = true)
    private Integer ngonNgu;
    @Basic
    @Column(name = "TrongLuong", nullable = true)
    private Integer trongLuong;
    @Basic
    @Column(name = "IdLoaiBia", nullable = true)
    private Integer idLoaiBia;
    @Basic
    @Column(name = "IdNhaCungCap", nullable = true)
    private Integer idNhaCungCap;
    @Basic
    @Column(name = "IdNhaXuatBan", nullable = true)
    private Integer idNhaXuatBan;
    @Basic
    @Column(name = "ThemBoi", nullable = true)
    private Integer themBoi;
    @Basic
    @Column(name = "CapNhaBoi", nullable = true)
    private Integer capNhaBoi;
    @Basic
    @Column(name = "Anh", nullable = true, length = 300)
    private String anh;
    @Basic
    @Column(name = "IdKhoSach", nullable = true)
    private Integer idKhoSach;
    @Basic
    @Column(name = "IdTheLoai", nullable = true)
    private Integer idTheLoai;
    @OneToMany(mappedBy = "sachByIdSach")
    private Collection<GioHangChiTiet> gioHangChiTietsByIdSach;
    @OneToMany(mappedBy = "sachByIdSach")
    private Collection<HoaDonChiTiet> hoaDonChiTietsByIdSach;
    @ManyToOne
    @JoinColumn(name = "NgonNgu", referencedColumnName = "IdNgonNgu")
    private NgonNgu ngonNguByNgonNgu;
    @ManyToOne
    @JoinColumn(name = "IdLoaiBia", referencedColumnName = "IdBiaSach")
    private LoaiBia loaiBiaByIdLoaiBia;
    @ManyToOne
    @JoinColumn(name = "IdNhaCungCap", referencedColumnName = "IdNhaCungCap")
    private NhaCungCap nhaCungCapByIdNhaCungCap;
    @ManyToOne
    @JoinColumn(name = "IdNhaXuatBan", referencedColumnName = "IdNXB")
    private Nxb nxbByIdNhaXuatBan;
    @ManyToOne
    @JoinColumn(name = "ThemBoi", referencedColumnName = "UID")
    private Account accountByThemBoi;
    @ManyToOne
    @JoinColumn(name = "CapNhaBoi", referencedColumnName = "UID")
    private Account accountByCapNhaBoi;
    @ManyToOne
    @JoinColumn(name = "IdKhoSach", referencedColumnName = "IDKhoSach")
    private KhoSach khoSachByIdKhoSach;
    @ManyToOne
    @JoinColumn(name = "IdTheLoai", referencedColumnName = "IdLoai")
    private LoaiSach loaiSachByIdTheLoai;

    public int getIdSach() {
        return idSach;
    }

    public void setIdSach(int idSach) {
        this.idSach = idSach;
    }

    public String getTenSach() {
        return tenSach;
    }

    public void setTenSach(String tenSach) {
        this.tenSach = tenSach;
    }

    public Integer getTaiBan() {
        return taiBan;
    }

    public void setTaiBan(Integer taiBan) {
        this.taiBan = taiBan;
    }

    public Double getGiaTien() {
        return giaTien;
    }

    public void setGiaTien(Double giaTien) {
        this.giaTien = giaTien;
    }

    public Date getNgayXuatBan() {
        return ngayXuatBan;
    }

    public void setNgayXuatBan(Date ngayXuatBan) {
        this.ngayXuatBan = ngayXuatBan;
    }

    public String getNoiDung() {
        return noiDung;
    }

    public void setNoiDung(String noiDung) {
        this.noiDung = noiDung;
    }

    public Date getNgayThem() {
        return ngayThem;
    }

    public void setNgayThem(Date ngayThem) {
        this.ngayThem = ngayThem;
    }

    public Integer getNgonNgu() {
        return ngonNgu;
    }

    public void setNgonNgu(Integer ngonNgu) {
        this.ngonNgu = ngonNgu;
    }

    public Integer getTrongLuong() {
        return trongLuong;
    }

    public void setTrongLuong(Integer trongLuong) {
        this.trongLuong = trongLuong;
    }

    public Integer getIdLoaiBia() {
        return idLoaiBia;
    }

    public void setIdLoaiBia(Integer idLoaiBia) {
        this.idLoaiBia = idLoaiBia;
    }

    public Integer getIdNhaCungCap() {
        return idNhaCungCap;
    }

    public void setIdNhaCungCap(Integer idNhaCungCap) {
        this.idNhaCungCap = idNhaCungCap;
    }

    public Integer getIdNhaXuatBan() {
        return idNhaXuatBan;
    }

    public void setIdNhaXuatBan(Integer idNhaXuatBan) {
        this.idNhaXuatBan = idNhaXuatBan;
    }

    public Integer getThemBoi() {
        return themBoi;
    }

    public void setThemBoi(Integer themBoi) {
        this.themBoi = themBoi;
    }

    public Integer getCapNhaBoi() {
        return capNhaBoi;
    }

    public void setCapNhaBoi(Integer capNhaBoi) {
        this.capNhaBoi = capNhaBoi;
    }

    public String getAnh() {
        return anh;
    }

    public void setAnh(String anh) {
        this.anh = anh;
    }

    public Integer getIdKhoSach() {
        return idKhoSach;
    }

    public void setIdKhoSach(Integer idKhoSach) {
        this.idKhoSach = idKhoSach;
    }

    public Integer getIdTheLoai() {
        return idTheLoai;
    }

    public void setIdTheLoai(Integer idTheLoai) {
        this.idTheLoai = idTheLoai;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Sach sach = (Sach) o;
        return idSach == sach.idSach && Objects.equals(tenSach, sach.tenSach) && Objects.equals(taiBan, sach.taiBan) && Objects.equals(giaTien, sach.giaTien) && Objects.equals(ngayXuatBan, sach.ngayXuatBan) && Objects.equals(noiDung, sach.noiDung) && Objects.equals(ngayThem, sach.ngayThem) && Objects.equals(ngonNgu, sach.ngonNgu) && Objects.equals(trongLuong, sach.trongLuong) && Objects.equals(idLoaiBia, sach.idLoaiBia) && Objects.equals(idNhaCungCap, sach.idNhaCungCap) && Objects.equals(idNhaXuatBan, sach.idNhaXuatBan) && Objects.equals(themBoi, sach.themBoi) && Objects.equals(capNhaBoi, sach.capNhaBoi) && Objects.equals(anh, sach.anh) && Objects.equals(idKhoSach, sach.idKhoSach) && Objects.equals(idTheLoai, sach.idTheLoai);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idSach, tenSach, taiBan, giaTien, ngayXuatBan, noiDung, ngayThem, ngonNgu, trongLuong, idLoaiBia, idNhaCungCap, idNhaXuatBan, themBoi, capNhaBoi, anh, idKhoSach, idTheLoai);
    }

    public Collection<GioHangChiTiet> getGioHangChiTietsByIdSach() {
        return gioHangChiTietsByIdSach;
    }

    public void setGioHangChiTietsByIdSach(Collection<GioHangChiTiet> gioHangChiTietsByIdSach) {
        this.gioHangChiTietsByIdSach = gioHangChiTietsByIdSach;
    }

    public Collection<HoaDonChiTiet> getHoaDonChiTietsByIdSach() {
        return hoaDonChiTietsByIdSach;
    }

    public void setHoaDonChiTietsByIdSach(Collection<HoaDonChiTiet> hoaDonChiTietsByIdSach) {
        this.hoaDonChiTietsByIdSach = hoaDonChiTietsByIdSach;
    }

    public NgonNgu getNgonNguByNgonNgu() {
        return ngonNguByNgonNgu;
    }

    public void setNgonNguByNgonNgu(NgonNgu ngonNguByNgonNgu) {
        this.ngonNguByNgonNgu = ngonNguByNgonNgu;
    }

    public LoaiBia getLoaiBiaByIdLoaiBia() {
        return loaiBiaByIdLoaiBia;
    }

    public void setLoaiBiaByIdLoaiBia(LoaiBia loaiBiaByIdLoaiBia) {
        this.loaiBiaByIdLoaiBia = loaiBiaByIdLoaiBia;
    }

    public NhaCungCap getNhaCungCapByIdNhaCungCap() {
        return nhaCungCapByIdNhaCungCap;
    }

    public void setNhaCungCapByIdNhaCungCap(NhaCungCap nhaCungCapByIdNhaCungCap) {
        this.nhaCungCapByIdNhaCungCap = nhaCungCapByIdNhaCungCap;
    }

    public Nxb getNxbByIdNhaXuatBan() {
        return nxbByIdNhaXuatBan;
    }

    public void setNxbByIdNhaXuatBan(Nxb nxbByIdNhaXuatBan) {
        this.nxbByIdNhaXuatBan = nxbByIdNhaXuatBan;
    }

    public Account getAccountByThemBoi() {
        return accountByThemBoi;
    }

    public void setAccountByThemBoi(Account accountByThemBoi) {
        this.accountByThemBoi = accountByThemBoi;
    }

    public Account getAccountByCapNhaBoi() {
        return accountByCapNhaBoi;
    }

    public void setAccountByCapNhaBoi(Account accountByCapNhaBoi) {
        this.accountByCapNhaBoi = accountByCapNhaBoi;
    }

    public KhoSach getKhoSachByIdKhoSach() {
        return khoSachByIdKhoSach;
    }

    public void setKhoSachByIdKhoSach(KhoSach khoSachByIdKhoSach) {
        this.khoSachByIdKhoSach = khoSachByIdKhoSach;
    }

    public LoaiSach getLoaiSachByIdTheLoai() {
        return loaiSachByIdTheLoai;
    }

    public void setLoaiSachByIdTheLoai(LoaiSach loaiSachByIdTheLoai) {
        this.loaiSachByIdTheLoai = loaiSachByIdTheLoai;
    }
}
