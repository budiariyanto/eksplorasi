/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package org.ventus.chimpanzee.integration;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.integration.support.MessageBuilder;
import org.springframework.messaging.Message;
import org.springframework.messaging.MessageChannel;

/**
 *
 * @author budi
 */
public class App {
    public static void main(String[] args) {
        ApplicationContext context =  new ClassPathXmlApplicationContext("classpath:org/ventus/spring/config/integrationContext.xml");
        MessageChannel channel = context.getBean("names", MessageChannel.class);
        Message<String> message = MessageBuilder.withPayload("World").build();
        channel.send(message);
    }
}
