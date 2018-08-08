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


    @Scheduled(fixedDelay = 50,initialDelay = 50)
    public void send() {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyyMMddHHmmss");
        String msg = dateFormat.format(new Date());
        try{
            //Destination topicqueue1 = new ActiveMQTopic("topic://mytest.topic1,queue://mytest.queue1");
            //Destination topicqueue2 = new ActiveMQQueue("queue://mytest.queue2,topic://mytest.topic2");
            //Destination virtualTopic = new ActiveMQTopic("VirtualTopic.test");
            //Destination queue1 = new ActiveMQQueue("mytest.queue1");
            //Destination queue2 = new ActiveMQQueue("mytest.queue2");
            //Destination queue3 = new ActiveMQQueue("mytest.queue3");
            Destination topic1 = new ActiveMQTopic("mytest.topic1");
            //Destination topic11 = new ActiveMQTopic("IN.FSS2.FIDS");
            //Destination topic2 = new ActiveMQTopic("mytest.topic2");
            System.out.println("发送消息:"+ msg);
            //this.jmsMessagingTemplate.convertAndSend(queue1, msg);
            //this.jmsMessagingTemplate.convertAndSend(queue2, msg);
            //this.jmsMessagingTemplate.convertAndSend(queue3, msg);
            //this.jmsMessagingTemplate.convertAndSend(topicqueue1, msg);
            this.jmsMessagingTemplate.convertAndSend(topic1, msg);
            this.jmsMessagingTemplate.convertAndSend(topic1, msg);
            //this.jmsMessagingTemplate.convertAndSend(topic11, msg);
            //this.jmsMessagingTemplate.convertAndSend(topic2, msg);
            //this.jmsMessagingTemplate.convertAndSend(virtualTopic, msg);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }

    }

   /* @JmsListener(destination="out.queue1", containerFactory="queueListenerFactory")
    public void consumerQueueMessage(String text){
        System.out.println("从out.queue1队列收到的回复报文为:"+text);
    }
    @JmsListener(destination="out.topic", containerFactory="topicListenerFactory")
    public void consumerTopicMessage(String text){
        System.out.println("从out.queue队列收到的回复报文为:"+text);
    }*/
}
