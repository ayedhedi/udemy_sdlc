package com.maxim.jms.listner;

import javax.jms.TextMessage;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.maxim.jms.listener.ConsumerListener;

public class ConsumerListenerTest {
	
	private TextMessage message;

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		ConsumerListener consumerListener = new ConsumerListener();
		consumerListener.onMessage(message);
		Assert.assertNull(message);
		
	}

}
