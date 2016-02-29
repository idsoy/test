package org.idsoy.test.concurrent;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/**
 * 测试线程和线程池的效率
 *
 * @author idsoy
 * @since 1.0.0
 */
public class ThreadAndThreadPool {

	/**
	 * 创建一个可缓存的线程池。如果线程池的大小超过了处理任务所需要的线程，
	 * 那么就会回收部分空闲（60秒不执行任务）的线程，当任务数增加时，
	 * 此线程池又可以智能的添加新线程来处理任务。此线程池不会对线程池大小做限制，
	 * 线程池大小完全依赖于操作系统（或者说JVM）能够创建的最大线程大小。
	 */
	private static final ExecutorService executorService = Executors.newFixedThreadPool(1);
	
	public static void main(String[] args) {
		
		int i = 0;
		Long start = System.currentTimeMillis();
		while(i<5) {
			Cmd cmd = new Cmd();
			//new Thread(cmd).start();
			executorService.execute(cmd);
			i++;
		}
		executorService.shutdown();
		System.out.println(System.currentTimeMillis()-start);
	}
	
	private static class Cmd implements Runnable{

		@Override
		public void run() {
			
			try {
				TimeUnit.SECONDS.sleep(10L);
				System.out.println("============================");
			} catch (Exception e) {
				e.printStackTrace();
			}
			
		}
		
	}
	
}
