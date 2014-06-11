/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package org.ventus.chimpanzee.integration.service.impl;

import org.springframework.integration.annotation.ServiceActivator;
import org.springframework.stereotype.Service;
import org.ventus.chimpanzee.integration.service.OutputService;

/**
 *
 * @author budi
 */
@Service
public class OutputServiceImpl implements OutputService{

    @Override
    @ServiceActivator
    public void printValue(String value) {
        System.out.println(value);
    }
    
}
