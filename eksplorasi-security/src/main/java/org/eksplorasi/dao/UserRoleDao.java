/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package org.eksplorasi.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.eksplorasi.domain.UserRole;

/**
 *
 * @author budi
 */
public interface UserRoleDao extends JpaRepository<UserRole, Long>{
    
}
