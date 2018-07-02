package com.eking.activemq.consumer;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Service;

import javax.jms.JMSException;
import javax.jms.TextMessage;

@Service
public class Consumer {

    @JmsListener(destination = "mytest.queue1", containerFactory="queueListenerFactory")
    @SendTo("out.queue1")
    public String receiveQueue1(String text) {
        System.out.println("Consumer收到的mytest.queue1队列为:"+text);
        return "return queue1 "+text;
    }
    @JmsListener(destination = "mytest.queue2", containerFactory="queueListenerFactory")
    @SendTo("out.queue2")
    public String receiveQueue2(String text) {
        System.out.println("Consumer收到的mytest.queue2队列为:"+text);
        return "return queue2 "+text;
    }

    @JmsListener(destination = "mytest.topic1", containerFactory="topicListenerFactory")
    @SendTo("out.topic1")
    public String receiveTopic1(String text) {
        System.out.println("Consumer收到的mytest.topic1主题为:"+text);
        return "return topic1 "+text;
    }

    @JmsListener(destination = "mytest.topic2", containerFactory="topicListenerFactory")
    @SendTo("out.topic2")
    public String receiveTopic2(String text) {
        System.out.println("Consumer收到的mytest.topic2主题为:"+text);
        return "return topic2 "+text;
    }
    @JmsListener(destination="Consumer.A.VirtualTopic.test", containerFactory="virtualTopicListenerFactory")
    public void consumerA1Topic(TextMessage text) throws JMSException {
        System.out.println("ConsumerA1收到的主题为:"+text.getText());
    }

    @JmsListener(destination="Consumer.A.VirtualTopic.test", containerFactory="virtualTopicListenerFactory")
    public void consumerA2Topic(TextMessage text) throws JMSException {
        System.out.println("ConsumerA2收到的主题为:"+text.getText());
    }

    @JmsListener(destination="Consumer.B.VirtualTopic.test", containerFactory="virtualTopicListenerFactory")
    public void consumerB1Topic(TextMessage text) throws JMSException {
        System.out.println("ConsumerB1收到的主题为:"+text.getText());
    }
}
