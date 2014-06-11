/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package org.ventus.chimpanzee.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.ventus.chimpanzee.dao.UserDao;
import org.ventus.chimpanzee.domain.User;
import org.ventus.chimpanzee.service.UserService;

/**
 *
 * @author budi
 */
public class UserServiceImpl implements UserService{

    @Autowired
    private UserDao userDao;
    
    public void insert(User user) {
        userDao.save(user);
    }

    public void update(User user) {
        userDao.save(user);
    }

    public void delete(User user) {
        userDao.delete(user);
    }

    public User findById(Long id) {
        return userDao.findOne(id);
    }

    public List<User> findAll() {
        return userDao.findAll();
    }

    public User findByUsername(String username) {
        return userDao.findByUsername(username);
    }
    
}
