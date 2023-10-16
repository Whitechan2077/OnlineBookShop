package com.workshop.bookstore.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Objects;

@Entity
@javax.persistence.IdClass(com.workshop.bookstore.entity.SachTacGiaPK.class)
public class SachTacGia {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @javax.persistence.Column(name = "id_tac_gia", nullable = false)
    private long idTacGia;

    public long getIdTacGia() {
        return idTacGia;
    }

    public void setIdTacGia(long idTacGia) {
        this.idTacGia = idTacGia;
    }

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @javax.persistence.Column(name = "id_sach", nullable = false)
    private long idSach;

    public long getIdSach() {
        return idSach;
    }

    public void setIdSach(long idSach) {
        this.idSach = idSach;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SachTacGia that = (SachTacGia) o;
        return idTacGia == that.idTacGia && idSach == that.idSach;
    }

    @Override
    public int hashCode() {
        return Objects.hash(idTacGia, idSach);
    }
}
