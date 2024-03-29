package com.lin;

import javax.annotation.Resource;

import org.junit.Before;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.retry.backoff.Sleeper;

import com.lin.producer.MessageProducer;

/**
 * 功能概要：
 * 
 * @author linbingwen
 * @since  2016年1月15日 
 */
public class MessageTest  {
	
	private Logger logger = LoggerFactory.getLogger(MessageTest.class);
	
	private ApplicationContext context = null;
	
	@Before
	public void setUp() throws Exception {
	    context = new ClassPathXmlApplicationContext("application.xml");
	}

	@Test
	public void should_send_a_amq_message() throws Exception {
       MessageProducer messageProducer = (MessageProducer) context.getBean("messageProducer");
       int a = Integer.MAX_VALUE;

		context = new ClassPathXmlApplicationContext("application.xml");

		Thread.sleep(2000000000000l);

		/*while (true)
		messageProducer.sendMessage("这是mq消息hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh");*/
	}
}
