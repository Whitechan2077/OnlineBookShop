package com.workshop.bookstore.entity;

import javax.persistence.*;
import java.util.Collection;
import java.util.Objects;

@Entity
public class Role {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "RoleID", nullable = false)
    private Integer roleId;
    @Basic
    @Column(name = "RoleName", nullable = true, length = 20)
    private String roleName;
    @Basic
    @Column(name = "TrangThai", nullable = true)
    private Integer trangThai;
    @OneToMany(mappedBy = "roleByRoleId")
    private Collection<Account> accountsByRoleId;

    public Integer getRoleId() {
        return roleId;
    }

    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
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
        Role role = (Role) o;
        return Objects.equals(roleId, role.roleId) && Objects.equals(roleName, role.roleName) && Objects.equals(trangThai, role.trangThai);
    }

    @Override
    public int hashCode() {
        return Objects.hash(roleId, roleName, trangThai);
    }

    public Collection<Account> getAccountsByRoleId() {
        return accountsByRoleId;
    }

    public void setAccountsByRoleId(Collection<Account> accountsByRoleId) {
        this.accountsByRoleId = accountsByRoleId;
    }
}
