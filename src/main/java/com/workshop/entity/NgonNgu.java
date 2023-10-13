package com.workshop.entity;

import javax.persistence.*;
import java.util.Collection;
import java.util.Objects;

@Entity
public class NgonNgu {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "IdNgonNgu", nullable = false)
    private int idNgonNgu;
    @Basic
    @Column(name = "TenNgonNgu", nullable = true, length = 20)
    private String tenNgonNgu;
    @Basic
    @Column(name = "TaoBoi", nullable = true)
    private Integer taoBoi;
    @Basic
    @Column(name = "CapNhatBoi", nullable = true)
    private Integer capNhatBoi;
    @ManyToOne
    @JoinColumn(name = "TaoBoi", referencedColumnName = "UID")
    private Account accountByTaoBoi;
    @ManyToOne
    @JoinColumn(name = "CapNhatBoi", referencedColumnName = "UID")
    private Account accountByCapNhatBoi;
    @OneToMany(mappedBy = "ngonNguByNgonNgu")
    private Collection<Sach> sachesByIdNgonNgu;

    public int getIdNgonNgu() {
        return idNgonNgu;
    }

    public void setIdNgonNgu(int idNgonNgu) {
        this.idNgonNgu = idNgonNgu;
    }

    public String getTenNgonNgu() {
        return tenNgonNgu;
    }

    public void setTenNgonNgu(String tenNgonNgu) {
        this.tenNgonNgu = tenNgonNgu;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        NgonNgu ngonNgu = (NgonNgu) o;
        return idNgonNgu == ngonNgu.idNgonNgu && Objects.equals(tenNgonNgu, ngonNgu.tenNgonNgu) && Objects.equals(taoBoi, ngonNgu.taoBoi) && Objects.equals(capNhatBoi, ngonNgu.capNhatBoi);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idNgonNgu, tenNgonNgu, taoBoi, capNhatBoi);
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

    public Collection<Sach> getSachesByIdNgonNgu() {
        return sachesByIdNgonNgu;
    }

    public void setSachesByIdNgonNgu(Collection<Sach> sachesByIdNgonNgu) {
        this.sachesByIdNgonNgu = sachesByIdNgonNgu;
    }
}
