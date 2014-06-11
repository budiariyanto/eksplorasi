/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package org.ventus.chimpanzee.domain;

import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import org.hibernate.annotations.GeneratorType;

/**
 *
 * @author budi
 */
@Entity
@Table(name = "master_user")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_master_user")
    @SequenceGenerator(name = "seq_master_user", sequenceName = "seq_master_user", allocationSize = 1)
    private Long id;
    
    @Column(name = "user_id", unique = true)
    private String userId;
    
    private String nama;
    
    private String password;
    
    @ManyToMany
    @JoinTable(name="jot_master_user_master_roles", joinColumns = @JoinColumn(name = "master_user_id"),
               inverseJoinColumns = @JoinColumn(name = "user_roles_id"))
    private List<UserRole> userRoles;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public List<UserRole> getUserRoles() {
        return userRoles;
    }

    public void setUserRoles(List<UserRole> userRoles) {
        this.userRoles = userRoles;
    }
}
