/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package org.eksplorasi.service;

import java.util.List;
import org.eksplorasi.domain.User;

/**
 *
 * @author budi
 */
public interface UserService {
    void insert(User user);
    void update(User user);
    void delete(User user);
    User findById(Long id);
    List<User> findAll();
    User findByUsername(String username);
}
