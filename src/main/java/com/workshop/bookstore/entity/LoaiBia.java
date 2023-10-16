package com.workshop.bookstore.entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
public class LoaiBia {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @javax.persistence.Column(name = "id_loai", nullable = false)
    private long idLoai;

    public long getIdLoai() {
        return idLoai;
    }

    public void setIdLoai(long idLoai) {
        this.idLoai = idLoai;
    }

    @Basic
    @Column(name = "ten_loai_bia", nullable = false, length = 60)
    private String tenLoaiBia;

    public String getTenLoaiBia() {
        return tenLoaiBia;
    }

    public void setTenLoaiBia(String tenLoaiBia) {
        this.tenLoaiBia = tenLoaiBia;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        LoaiBia loaiBia = (LoaiBia) o;
        return idLoai == loaiBia.idLoai && Objects.equals(tenLoaiBia, loaiBia.tenLoaiBia);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idLoai, tenLoaiBia);
    }
}
