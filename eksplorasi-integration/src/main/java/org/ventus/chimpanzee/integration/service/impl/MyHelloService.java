/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package org.ventus.chimpanzee.integration.service.impl;

import org.springframework.stereotype.Service;
import org.ventus.chimpanzee.integration.service.HelloService;

/**
 *
 * @author budi
 */
@Service
public class MyHelloService implements HelloService{

    @Override
    public String sayHello(String name) {
        return "Hello " + name;
    }
    
}
