package com.workshop.entity;

import javax.persistence.*;
import java.util.Collection;
import java.util.Objects;

@Entity
public class LoaiSach {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "IdLoai", nullable = false)
    private int idLoai;
    @Basic
    @Column(name = "TenLoai", nullable = true, length = 60)
    private String tenLoai;
    @Basic
    @Column(name = "IdLoaiCha", nullable = true)
    private Integer idLoaiCha;
    @Basic
    @Column(name = "TaoBoi", nullable = true)
    private Integer taoBoi;
    @Basic
    @Column(name = "SuaBoi", nullable = true)
    private Integer suaBoi;
    @Basic
    @Column(name = "TrangThai", nullable = true)
    private Integer trangThai;
    @ManyToOne
    @JoinColumn(name = "IdLoaiCha", referencedColumnName = "IdLoai")
    private LoaiSach loaiSachByIdLoaiCha;
    @OneToMany(mappedBy = "loaiSachByIdLoaiCha")
    private Collection<LoaiSach> loaiSachesByIdLoai;
    @ManyToOne
    @JoinColumn(name = "TaoBoi", referencedColumnName = "UID")
    private Account accountByTaoBoi;
    @ManyToOne
    @JoinColumn(name = "SuaBoi", referencedColumnName = "UID")
    private Account accountBySuaBoi;
    @OneToMany(mappedBy = "loaiSachByIdTheLoai")
    private Collection<Sach> sachesByIdLoai;

    public int getIdLoai() {
        return idLoai;
    }

    public void setIdLoai(int idLoai) {
        this.idLoai = idLoai;
    }

    public String getTenLoai() {
        return tenLoai;
    }

    public void setTenLoai(String tenLoai) {
        this.tenLoai = tenLoai;
    }

    public Integer getIdLoaiCha() {
        return idLoaiCha;
    }

    public void setIdLoaiCha(Integer idLoaiCha) {
        this.idLoaiCha = idLoaiCha;
    }

    public Integer getTaoBoi() {
        return taoBoi;
    }

    public void setTaoBoi(Integer taoBoi) {
        this.taoBoi = taoBoi;
    }

    public Integer getSuaBoi() {
        return suaBoi;
    }

    public void setSuaBoi(Integer suaBoi) {
        this.suaBoi = suaBoi;
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
        LoaiSach loaiSach = (LoaiSach) o;
        return idLoai == loaiSach.idLoai && Objects.equals(tenLoai, loaiSach.tenLoai) && Objects.equals(idLoaiCha, loaiSach.idLoaiCha) && Objects.equals(taoBoi, loaiSach.taoBoi) && Objects.equals(suaBoi, loaiSach.suaBoi) && Objects.equals(trangThai, loaiSach.trangThai);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idLoai, tenLoai, idLoaiCha, taoBoi, suaBoi, trangThai);
    }

    public LoaiSach getLoaiSachByIdLoaiCha() {
        return loaiSachByIdLoaiCha;
    }

    public void setLoaiSachByIdLoaiCha(LoaiSach loaiSachByIdLoaiCha) {
        this.loaiSachByIdLoaiCha = loaiSachByIdLoaiCha;
    }

    public Collection<LoaiSach> getLoaiSachesByIdLoai() {
        return loaiSachesByIdLoai;
    }

    public void setLoaiSachesByIdLoai(Collection<LoaiSach> loaiSachesByIdLoai) {
        this.loaiSachesByIdLoai = loaiSachesByIdLoai;
    }

    public Account getAccountByTaoBoi() {
        return accountByTaoBoi;
    }

    public void setAccountByTaoBoi(Account accountByTaoBoi) {
        this.accountByTaoBoi = accountByTaoBoi;
    }

    public Account getAccountBySuaBoi() {
        return accountBySuaBoi;
    }

    public void setAccountBySuaBoi(Account accountBySuaBoi) {
        this.accountBySuaBoi = accountBySuaBoi;
    }

    public Collection<Sach> getSachesByIdLoai() {
        return sachesByIdLoai;
    }

    public void setSachesByIdLoai(Collection<Sach> sachesByIdLoai) {
        this.sachesByIdLoai = sachesByIdLoai;
    }
}
