package com.workshop.bookstore.entity;

import javax.persistence.*;
import java.sql.Date;
import java.util.Collection;
import java.util.Objects;

@Entity
public class TacGia {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "IdTacGia", nullable = false)
    private Integer idTacGia;
    @Basic
    @Column(name = "NgaySinh", nullable = true)
    private Date ngaySinh;
    @Basic
    @Column(name = "Ten", nullable = true, length = 100)
    private String ten;
    @Basic
    @Column(name = "TieuSu", nullable = true, length = 500)
    private String tieuSu;
    @OneToMany(mappedBy = "tacGiaByIdTacGia")
    private Collection<ChiTietTacGia> chiTietTacGiasByIdTacGia;
    @ManyToOne
    @JoinColumn(name = "ThemBoi", referencedColumnName = "UID")
    private Account accountByThemBoi;
    @ManyToOne
    @JoinColumn(name = "CapNhatBoi", referencedColumnName = "UID")
    private Account accountByCapNhatBoi;

    public Integer getIdTacGia() {
        return idTacGia;
    }

    public void setIdTacGia(Integer idTacGia) {
        this.idTacGia = idTacGia;
    }

    public Date getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(Date ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getTieuSu() {
        return tieuSu;
    }

    public void setTieuSu(String tieuSu) {
        this.tieuSu = tieuSu;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TacGia tacGia = (TacGia) o;
        return Objects.equals(idTacGia, tacGia.idTacGia) && Objects.equals(ngaySinh, tacGia.ngaySinh) && Objects.equals(ten, tacGia.ten) && Objects.equals(tieuSu, tacGia.tieuSu);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idTacGia, ngaySinh, ten, tieuSu);
    }

    public Collection<ChiTietTacGia> getChiTietTacGiasByIdTacGia() {
        return chiTietTacGiasByIdTacGia;
    }

    public void setChiTietTacGiasByIdTacGia(Collection<ChiTietTacGia> chiTietTacGiasByIdTacGia) {
        this.chiTietTacGiasByIdTacGia = chiTietTacGiasByIdTacGia;
    }

    public Account getAccountByThemBoi() {
        return accountByThemBoi;
    }

    public void setAccountByThemBoi(Account accountByThemBoi) {
        this.accountByThemBoi = accountByThemBoi;
    }

    public Account getAccountByCapNhatBoi() {
        return accountByCapNhatBoi;
    }

    public void setAccountByCapNhatBoi(Account accountByCapNhatBoi) {
        this.accountByCapNhatBoi = accountByCapNhatBoi;
    }
}
