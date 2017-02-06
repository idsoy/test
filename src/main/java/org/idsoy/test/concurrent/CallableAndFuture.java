package org.idsoy.test.concurrent;

import java.util.Random;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class CallableAndFuture {
    public static void main(String[] args) throws InterruptedException, ExecutionException {
        Callable<Integer> callable = new Callable<Integer>() {
            public Integer call() throws Exception {
            	Thread.sleep(5000);// 可能做一些事情
            	System.out.println(new Random().nextInt(100));
                return new Random().nextInt(100);
            }
        };
        FutureTask<Integer> future = new FutureTask<Integer>(callable);
        new Thread(future).start();
       // System.out.println(future.get());
    }
}