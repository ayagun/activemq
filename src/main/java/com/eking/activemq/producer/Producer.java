package com.eking.activemq.producer;

import org.apache.activemq.ActiveMQConnectionFactory;
import org.apache.activemq.command.ActiveMQQueue;
import org.apache.activemq.command.ActiveMQTopic;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.jms.core.JmsMessagingTemplate;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import javax.jms.Destination;
import java.text.SimpleDateFormat;
import java.util.Date;

@Component
@EnableScheduling
public class Producer {
    @Autowired
    private JmsMessagingTemplate jmsMessagingTemplate;


    @Scheduled(fixedDelay = 3000,initialDelay = 3000)
    public void send() {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyyMMddHHmmss");
        String msg = dateFormat.format(new Date());
        //Destination topic = new ActiveMQTopic("topic://mytest.topic1,queue://mytest.queue1");
        //Destination queue = new ActiveMQQueue("topic://mytest.topic2,queue://mytest.queue2");
        Destination virtualTopic = new ActiveMQTopic("VirtualTopic.test");
        System.out.println("发送消息:"+ msg);
        //this.jmsMessagingTemplate.convertAndSend(queue, msg);
        //this.jmsMessagingTemplate.convertAndSend(topic, msg);
        this.jmsMessagingTemplate.convertAndSend(virtualTopic, msg);
    }

/*    @JmsListener(destination="out.queue")
    public void consumerQueueMessage(String text){
        System.out.println("从out.queue队列收到的回复报文为:"+text);
    }
    @JmsListener(destination="out.topic", containerFactory="topicListenerFactory")
    public void consumerTopicMessage(String text){
        System.out.println("从out.queue队列收到的回复报文为:"+text);
    }*/
}
