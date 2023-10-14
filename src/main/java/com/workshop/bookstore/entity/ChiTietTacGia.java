package com.workshop.bookstore.entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
public class ChiTietTacGia {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "ID", nullable = false)
    private Integer id;
    @ManyToOne
    @JoinColumn(name = "IdSach", referencedColumnName = "IdSach")
    private Sach sachByIdSach;
    @ManyToOne
    @JoinColumn(name = "IdTacGia", referencedColumnName = "IdTacGia")
    private TacGia tacGiaByIdTacGia;
    @ManyToOne
    @JoinColumn(name = "ThemBoi", referencedColumnName = "UID")
    private Account accountByThemBoi;
    @ManyToOne
    @JoinColumn(name = "CapNhatBoi", referencedColumnName = "UID")
    private Account accountByCapNhatBoi;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ChiTietTacGia that = (ChiTietTacGia) o;
        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    public Sach getSachByIdSach() {
        return sachByIdSach;
    }

    public void setSachByIdSach(Sach sachByIdSach) {
        this.sachByIdSach = sachByIdSach;
    }

    public TacGia getTacGiaByIdTacGia() {
        return tacGiaByIdTacGia;
    }

    public void setTacGiaByIdTacGia(TacGia tacGiaByIdTacGia) {
        this.tacGiaByIdTacGia = tacGiaByIdTacGia;
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
