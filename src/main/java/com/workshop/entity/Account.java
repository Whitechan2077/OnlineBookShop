package com.workshop.entity;

import javax.persistence.*;
import java.util.Collection;
import java.util.Objects;

@Entity
public class Account {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "UID", nullable = false)
    private int uid;
    @Basic
    @Column(name = "Username", nullable = true, length = 20)
    private String username;
    @Basic
    @Column(name = "password", nullable = true, length = 20)
    private String password;
    @Basic
    @Column(name = "status", nullable = true)
    private Integer status;
    @Basic
    @Column(name = "RoleID", nullable = true)
    private Integer roleId;
    @Basic
    @Column(name = "TrangThai", nullable = true)
    private Integer trangThai;
    @ManyToOne
    @JoinColumn(name = "RoleID", referencedColumnName = "RoleID")
    private Role roleByRoleId;
    @OneToMany(mappedBy = "accountByUid")
    private Collection<DiaChi> diaChisByUid;
    @OneToMany(mappedBy = "accountByUid")
    private Collection<GioHang> gioHangsByUid;
    @OneToMany(mappedBy = "accountByNhanVienQuanLy")
    private Collection<HoaDon> hoaDonsByUid;
    @OneToMany(mappedBy = "accountByUid")
    private Collection<KhachHang> khachHangsByUid;
    @OneToMany(mappedBy = "accountByTaoBoi")
    private Collection<KhoSach> khoSachesByUid;
    @OneToMany(mappedBy = "accountByCapNhatBoi")
    private Collection<KhoSach> khoSachesByUid_0;
    @OneToMany(mappedBy = "accountByTaoBoi")
    private Collection<LoaiBia> loaiBiasByUid;
    @OneToMany(mappedBy = "accountByCapNhatBoi")
    private Collection<LoaiBia> loaiBiasByUid_0;
    @OneToMany(mappedBy = "accountByTaoBoi")
    private Collection<LoaiSach> loaiSachesByUid;
    @OneToMany(mappedBy = "accountBySuaBoi")
    private Collection<LoaiSach> loaiSachesByUid_0;
    @OneToMany(mappedBy = "accountByNguoiTao")
    private Collection<Nxb> nxbsByUid;
    @OneToMany(mappedBy = "accountByCapNhatBoi")
    private Collection<Nxb> nxbsByUid_0;
    @OneToMany(mappedBy = "accountByTaoBoi")
    private Collection<NgonNgu> ngonNgusByUid;
    @OneToMany(mappedBy = "accountByCapNhatBoi")
    private Collection<NgonNgu> ngonNgusByUid_0;
    @OneToMany(mappedBy = "accountByUid")
    private Collection<NhanVien> nhanViensByUid;
    @OneToMany(mappedBy = "accountByThemBoi")
    private Collection<Sach> sachesByUid;
    @OneToMany(mappedBy = "accountByCapNhaBoi")
    private Collection<Sach> sachesByUid_0;

    public int getUid() {
        return uid;
    }

    public void setUid(int uid) {
        this.uid = uid;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getRoleId() {
        return roleId;
    }

    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }

    public Integer getTrangThai() {
        return trangThai;
    }

    public void setTrangThai(Integer trangThai) {
        this.trangThai = trangThai;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Account account = (Account) o;
        return uid == account.uid && Objects.equals(username, account.username) && Objects.equals(password, account.password) && Objects.equals(status, account.status) && Objects.equals(roleId, account.roleId) && Objects.equals(trangThai, account.trangThai);
    }

    @Override
    public int hashCode() {
        return Objects.hash(uid, username, password, status, roleId, trangThai);
    }

    public Role getRoleByRoleId() {
        return roleByRoleId;
    }

    public void setRoleByRoleId(Role roleByRoleId) {
        this.roleByRoleId = roleByRoleId;
    }

    public Collection<DiaChi> getDiaChisByUid() {
        return diaChisByUid;
    }

    public void setDiaChisByUid(Collection<DiaChi> diaChisByUid) {
        this.diaChisByUid = diaChisByUid;
    }

    public Collection<GioHang> getGioHangsByUid() {
        return gioHangsByUid;
    }

    public void setGioHangsByUid(Collection<GioHang> gioHangsByUid) {
        this.gioHangsByUid = gioHangsByUid;
    }

    public Collection<HoaDon> getHoaDonsByUid() {
        return hoaDonsByUid;
    }

    public void setHoaDonsByUid(Collection<HoaDon> hoaDonsByUid) {
        this.hoaDonsByUid = hoaDonsByUid;
    }

    public Collection<KhachHang> getKhachHangsByUid() {
        return khachHangsByUid;
    }

    public void setKhachHangsByUid(Collection<KhachHang> khachHangsByUid) {
        this.khachHangsByUid = khachHangsByUid;
    }

    public Collection<KhoSach> getKhoSachesByUid() {
        return khoSachesByUid;
    }

    public void setKhoSachesByUid(Collection<KhoSach> khoSachesByUid) {
        this.khoSachesByUid = khoSachesByUid;
    }

    public Collection<KhoSach> getKhoSachesByUid_0() {
        return khoSachesByUid_0;
    }

    public void setKhoSachesByUid_0(Collection<KhoSach> khoSachesByUid_0) {
        this.khoSachesByUid_0 = khoSachesByUid_0;
    }

    public Collection<LoaiBia> getLoaiBiasByUid() {
        return loaiBiasByUid;
    }

    public void setLoaiBiasByUid(Collection<LoaiBia> loaiBiasByUid) {
        this.loaiBiasByUid = loaiBiasByUid;
    }

    public Collection<LoaiBia> getLoaiBiasByUid_0() {
        return loaiBiasByUid_0;
    }

    public void setLoaiBiasByUid_0(Collection<LoaiBia> loaiBiasByUid_0) {
        this.loaiBiasByUid_0 = loaiBiasByUid_0;
    }

    public Collection<LoaiSach> getLoaiSachesByUid() {
        return loaiSachesByUid;
    }

    public void setLoaiSachesByUid(Collection<LoaiSach> loaiSachesByUid) {
        this.loaiSachesByUid = loaiSachesByUid;
    }

    public Collection<LoaiSach> getLoaiSachesByUid_0() {
        return loaiSachesByUid_0;
    }

    public void setLoaiSachesByUid_0(Collection<LoaiSach> loaiSachesByUid_0) {
        this.loaiSachesByUid_0 = loaiSachesByUid_0;
    }

    public Collection<Nxb> getNxbsByUid() {
        return nxbsByUid;
    }

    public void setNxbsByUid(Collection<Nxb> nxbsByUid) {
        this.nxbsByUid = nxbsByUid;
    }

    public Collection<Nxb> getNxbsByUid_0() {
        return nxbsByUid_0;
    }

    public void setNxbsByUid_0(Collection<Nxb> nxbsByUid_0) {
        this.nxbsByUid_0 = nxbsByUid_0;
    }

    public Collection<NgonNgu> getNgonNgusByUid() {
        return ngonNgusByUid;
    }

    public void setNgonNgusByUid(Collection<NgonNgu> ngonNgusByUid) {
        this.ngonNgusByUid = ngonNgusByUid;
    }

    public Collection<NgonNgu> getNgonNgusByUid_0() {
        return ngonNgusByUid_0;
    }

    public void setNgonNgusByUid_0(Collection<NgonNgu> ngonNgusByUid_0) {
        this.ngonNgusByUid_0 = ngonNgusByUid_0;
    }

    public Collection<NhanVien> getNhanViensByUid() {
        return nhanViensByUid;
    }

    public void setNhanViensByUid(Collection<NhanVien> nhanViensByUid) {
        this.nhanViensByUid = nhanViensByUid;
    }

    public Collection<Sach> getSachesByUid() {
        return sachesByUid;
    }

    public void setSachesByUid(Collection<Sach> sachesByUid) {
        this.sachesByUid = sachesByUid;
    }

    public Collection<Sach> getSachesByUid_0() {
        return sachesByUid_0;
    }

    public void setSachesByUid_0(Collection<Sach> sachesByUid_0) {
        this.sachesByUid_0 = sachesByUid_0;
    }
}
