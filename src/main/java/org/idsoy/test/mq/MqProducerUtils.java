package org.idsoy.test.mq;

import java.io.IOException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.rabbitmq.client.Channel;
import com.rabbitmq.client.Connection;

/**
 * mq生产者
 *
 * <p>All rights Reserved, Designed By HQYG</p>
 * @Copyright:   Copyright(C) 2016
 * @Company:     HQYG.
 * @author:      zifeng
 * @Createdate:  2016年11月30日上午9:54:52
 */
public class MqProducerUtils {
	
	private static Logger logger = LoggerFactory.getLogger(MqProducerUtils.class);
	
//	private static DefaultEventController controller;
//	
//	private static EventTemplate eventTemplate;
	
	static{
		try {
			init();
		} catch (IOException e) {
			logger.error("MqProducerUtils init error!", e);
		}
	}
	
	
	/**
	 * 初始化方法
	 * @throws IOException
	 */
	private static void init() throws IOException{
//		RabbitmqConfig.getInstance("");
//		String CONN_HOSTNAME = RabbitmqConfig.getHost();
//		String CONN_USERNAME = RabbitmqConfig.getUserName();
//		String CONN_PASSWORD = RabbitmqConfig.getPassWord();
//		EventControlConfig config = new EventControlConfig(CONN_HOSTNAME,CONN_USERNAME,CONN_PASSWORD);
//		controller = DefaultEventController.getInstance(config);
//		eventTemplate = controller.getEopEventTemplate();
	}
	
	/**
	 * 发送MQ消息
	 * @param queue
	 * @param exchange
	 * @param obj
	 * @throws SendRefuseException
	 */
	public static void send(String queue, String exchange, Object obj) {
		
//		eventTemplate.send(queue, exchange, obj);
		
	}
	
	/**
     * @param queue
     * @param exchange
     * @param msgObj
	 * @throws IOException 
     */
    public static void sendText(String exchange, String queue, String content) throws IOException{
    	Connection connection = null;
    	Channel channel = null;
    	try {
//    		connectiosn = MqBaseConnection.getConnection();
    		channel = connection.createChannel();
    		channel.exchangeDeclare(exchange, "direct", true);
    		channel.queueDeclare(queue, true, false, false, null);
    		channel.queueBind(queue, exchange, queue);
    		channel.basicPublish(exchange, queue, null, content.getBytes("UTF-8"));
		}finally{
			try {
	    		if(channel!=null){
	    			channel.close();
	    		}
	    		if(connection!=null){
	    			connection.close();
	    		}
			} catch (Exception e) {
				logger.error("connection.close error:",e);
			}	
        }
    }
	
}
