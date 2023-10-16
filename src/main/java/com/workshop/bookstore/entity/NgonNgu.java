package com.workshop.bookstore.entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
public class NgonNgu {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @javax.persistence.Column(name = "id_ngon_ngu", nullable = false)
    private long idNgonNgu;

    public long getIdNgonNgu() {
        return idNgonNgu;
    }

    public void setIdNgonNgu(long idNgonNgu) {
        this.idNgonNgu = idNgonNgu;
    }

    @Basic
    @Column(name = "ten_ngon_ngu", nullable = false, length = 30)
    private String tenNgonNgu;

    public String getTenNgonNgu() {
        return tenNgonNgu;
    }

    public void setTenNgonNgu(String tenNgonNgu) {
        this.tenNgonNgu = tenNgonNgu;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        NgonNgu ngonNgu = (NgonNgu) o;
        return idNgonNgu == ngonNgu.idNgonNgu && Objects.equals(tenNgonNgu, ngonNgu.tenNgonNgu);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idNgonNgu, tenNgonNgu);
    }
}
