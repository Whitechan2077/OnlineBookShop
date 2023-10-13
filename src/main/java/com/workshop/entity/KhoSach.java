package com.workshop.entity;

import javax.persistence.*;
import java.util.Collection;
import java.util.Objects;

@Entity
public class KhoSach {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "IDKhoSach", nullable = false)
    private int idKhoSach;
    @Basic
    @Column(name = "KichThuoc", nullable = true, length = 50)
    private String kichThuoc;
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
    @OneToMany(mappedBy = "khoSachByIdKhoSach")
    private Collection<Sach> sachesByIdKhoSach;

    public int getIdKhoSach() {
        return idKhoSach;
    }

    public void setIdKhoSach(int idKhoSach) {
        this.idKhoSach = idKhoSach;
    }

    public String getKichThuoc() {
        return kichThuoc;
    }

    public void setKichThuoc(String kichThuoc) {
        this.kichThuoc = kichThuoc;
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
        KhoSach khoSach = (KhoSach) o;
        return idKhoSach == khoSach.idKhoSach && Objects.equals(kichThuoc, khoSach.kichThuoc) && Objects.equals(taoBoi, khoSach.taoBoi) && Objects.equals(capNhatBoi, khoSach.capNhatBoi) && Objects.equals(trangThai, khoSach.trangThai);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idKhoSach, kichThuoc, taoBoi, capNhatBoi, trangThai);
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

    public Collection<Sach> getSachesByIdKhoSach() {
        return sachesByIdKhoSach;
    }

    public void setSachesByIdKhoSach(Collection<Sach> sachesByIdKhoSach) {
        this.sachesByIdKhoSach = sachesByIdKhoSach;
    }
}
