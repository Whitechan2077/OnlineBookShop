package com.workshop.entity;

import javax.persistence.*;
import java.util.Collection;
import java.util.Objects;

@Entity
public class LoaiBia {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "IdBiaSach", nullable = false)
    private int idBiaSach;
    @Basic
    @Column(name = "TenLoai", nullable = true, length = 50)
    private String tenLoai;
    @Basic
    @Column(name = "TaoBoi", nullable = true)
    private Integer taoBoi;
    @Basic
    @Column(name = "CapNhatBoi", nullable = true)
    private Integer capNhatBoi;
    @Basic
    @Column(name = "TrangThai", nullable = true)
    private Integer trangThai;
    @ManyToOne
    @JoinColumn(name = "TaoBoi", referencedColumnName = "UID")
    private Account accountByTaoBoi;
    @ManyToOne
    @JoinColumn(name = "CapNhatBoi", referencedColumnName = "UID")
    private Account accountByCapNhatBoi;
    @OneToMany(mappedBy = "loaiBiaByIdLoaiBia")
    private Collection<Sach> sachesByIdBiaSach;

    public int getIdBiaSach() {
        return idBiaSach;
    }

    public void setIdBiaSach(int idBiaSach) {
        this.idBiaSach = idBiaSach;
    }

    public String getTenLoai() {
        return tenLoai;
    }

    public void setTenLoai(String tenLoai) {
        this.tenLoai = tenLoai;
    }

    public Integer getTaoBoi() {
        return taoBoi;
    }

    public void setTaoBoi(Integer taoBoi) {
        this.taoBoi = taoBoi;
    }

    public Integer getCapNhatBoi() {
        return capNhatBoi;
    }

    public void setCapNhatBoi(Integer capNhatBoi) {
        this.capNhatBoi = capNhatBoi;
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
        LoaiBia loaiBia = (LoaiBia) o;
        return idBiaSach == loaiBia.idBiaSach && Objects.equals(tenLoai, loaiBia.tenLoai) && Objects.equals(taoBoi, loaiBia.taoBoi) && Objects.equals(capNhatBoi, loaiBia.capNhatBoi) && Objects.equals(trangThai, loaiBia.trangThai);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idBiaSach, tenLoai, taoBoi, capNhatBoi, trangThai);
    }

    public Account getAccountByTaoBoi() {
        return accountByTaoBoi;
    }

    public void setAccountByTaoBoi(Account accountByTaoBoi) {
        this.accountByTaoBoi = accountByTaoBoi;
    }

    public Account getAccountByCapNhatBoi() {
        return accountByCapNhatBoi;
    }

    public void setAccountByCapNhatBoi(Account accountByCapNhatBoi) {
        this.accountByCapNhatBoi = accountByCapNhatBoi;
    }

    public Collection<Sach> getSachesByIdBiaSach() {
        return sachesByIdBiaSach;
    }

    public void setSachesByIdBiaSach(Collection<Sach> sachesByIdBiaSach) {
        this.sachesByIdBiaSach = sachesByIdBiaSach;
    }
}
