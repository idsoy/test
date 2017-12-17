package org.idsoy.test.zk;

import java.util.concurrent.CountDownLatch;

import org.apache.zookeeper.KeeperException;
import org.apache.zookeeper.WatchedEvent;
import org.apache.zookeeper.Watcher;
import org.apache.zookeeper.Watcher.Event.KeeperState;
import org.apache.zookeeper.ZooKeeper;

public class AccessDataTest {

	private static CountDownLatch connectedSignal = new CountDownLatch(1);

	private static ZooKeeper zk;

	private static String hosts = "192.168.21.3:2181,192.168.21.4:2181,192.168.21.5:2181";

	private static final Integer SESSION_TIMEOUT = 5000;

	public static void main(String[] args) throws Exception {
		
		String nodePath = "/test";
		
		connect();
		
		String data = "Hello juanpi!";
		
		setData(nodePath, data);
		
		getData(nodePath);
		
	}

	private static class ConnWatcher implements Watcher {

		public void process(WatchedEvent event) {

			// 连接建立, 回调process接口时, 其event.getState()为KeeperState.SyncConnected
			if (event.getState() == KeeperState.SyncConnected) {

				// 放开闸门, wait在connect方法上的线程将被唤醒
				connectedSignal.countDown();

			}

		}

	}

	/**
	 * zk连接
	 * 
	 * @throws Exception
	 */
	public static void connect() throws Exception {

		zk = new ZooKeeper(hosts, SESSION_TIMEOUT, new ConnWatcher());
		// 等待连接完成
		connectedSignal.await();

	}
	
	/**
	 * 获取数据
	 * 
	 * @param nodePath
	 * @throws KeeperException
	 * @throws InterruptedException
	 */
	public static void getData(String nodePath) throws KeeperException, InterruptedException {
		
		byte[] data = zk.getData(nodePath, false, null);
		
		System.out.println("Get data path:" + nodePath + " data:" + new String(data));
		
	}
	
	public static void setData(String nodePath, String data) throws KeeperException, InterruptedException {
		
		byte[] bData = data.getBytes();
		
		zk.setData(nodePath, bData, -1);
		
		System.out.println("Set data path:" + nodePath + " data:" + data);
		
	}

}
