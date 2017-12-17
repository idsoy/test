package org.idsoy.test.concurrent;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class TestThread {

	static ScheduledExecutorService scheduledExecutorService = Executors.newScheduledThreadPool(8);
	
	public static void main(String[] args) {
		
		scheduledExecutorService.scheduleWithFixedDelay(new Runnable() {
			
			@Override
			public void run() {
				System.out.println("=============scheduledExecutorService================");
				return;
			}
		}, 0, 100l, TimeUnit.MILLISECONDS);
		
	}
	
}
