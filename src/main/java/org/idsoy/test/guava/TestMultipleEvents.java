package org.idsoy.test.guava;

import org.junit.Test;

import com.google.common.eventbus.EventBus;

public class TestMultipleEvents {
	@Test
	public void testMultipleEvents() throws Exception {

		EventBus eventBus = new EventBus("test");
		MultipleListener multiListener = new MultipleListener();

		eventBus.register(multiListener);
		
		EventListener listener = new EventListener();

		eventBus.register(listener);

		eventBus.post(new TestEvent(200));
		eventBus.post(new TestEvent(300));
		eventBus.post(new TestEvent(400));

		eventBus.post(new Integer(100));
		eventBus.post(new Integer(200));
		eventBus.post(new Integer(300));
		eventBus.post(new Long(800));
		eventBus.post(new Long(800990));
		eventBus.post(new Long(800882934));
		

		System.out.println("LastInteger:" + multiListener.getLastInteger());
		System.out.println("LastLong:" + multiListener.getLastLong());
	}
}