package com.example.librarymanagementsystem.Model;

import com.sun.istack.NotNull;
import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "Users")
@Data
public class Users {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Long id;

    @NotNull
    @Column(name = "displayName")
    private String displayName;

    @NotNull
    @Column(name = "username")
    private String username;

    @NotNull
    @Column(name = "password")
    private String password;

    @NotNull
    @Column(name = "active")
    private Integer active;

    @NotNull
    @Column(name = "role")
    private String role;

    @NotNull
    @Column(name = "created_date")
    private Date created_date;

    @NotNull
    @Column(name = "lastModifiedDate")
    private Date lastModifiedDate;

    public Users(){

    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setActive(Integer active) {
        this.active = active;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public void setCreated_date(Date created_date) {
        this.created_date = created_date;
    }

    public void setLastModifiedDate(Date lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
    }

    public Long getId() {
        return id;
    }

    public String getDisplayName() {
        return displayName;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public Integer getActive() {
        return active;
    }

    public String getRole() {
        return role;
    }

    public Date getCreated_date() {
        return created_date;
    }

    public Date getLastModifiedDate() {
        return lastModifiedDate;
    }
}
