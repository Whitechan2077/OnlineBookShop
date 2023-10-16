package com.workshop.bookstore.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "Account", schema = "dbo", catalog = "BookStore")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class AccountEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "UID")
    private Integer uid;
    @Basic
    @Column(name = "Username")
    private String username;
    @Basic
    @Column(name = "password")
    private String password;
    @Basic
    @Column(name = "RoleID")
    private Integer roleId;
    @Basic
    @Column(name = "TrangThai")
    private Integer trangThai;
}
