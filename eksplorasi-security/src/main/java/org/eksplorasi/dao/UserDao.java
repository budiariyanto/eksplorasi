/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package org.ventus.chimpanzee.dao;

import java.io.Serializable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.ventus.chimpanzee.domain.User;

/**
 *
 * @author budi
 */
public interface UserDao extends JpaRepository<User, Long>{
    
    @Query("select u from User where u.user_id = ?1")
    User findByUsername(String username);
    
}
