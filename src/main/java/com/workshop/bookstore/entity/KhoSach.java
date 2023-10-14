package com.workshop.bookstore.entity;

import javax.persistence.*;
import java.util.Collection;
import java.util.Objects;

@Entity
public class KhoSach {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "IDKhoSach", nullable = false)
    private Integer idKhoSach;
    @Basic
    @Column(name = "KichThuoc", nullable = true, length = 50)
    private String kichThuoc;
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

    public Integer getIdKhoSach() {
        return idKhoSach;
    }

    public void setIdKhoSach(Integer idKhoSach) {
        this.idKhoSach = idKhoSach;
    }

    public String getKichThuoc() {
        return kichThuoc;
    }

    public void setKichThuoc(String kichThuoc) {
        this.kichThuoc = kichThuoc;
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
        return Objects.equals(idKhoSach, khoSach.idKhoSach) && Objects.equals(kichThuoc, khoSach.kichThuoc) && Objects.equals(trangThai, khoSach.trangThai);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idKhoSach, kichThuoc, trangThai);
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
