package org.idsoy.test.mq;

import java.io.IOException;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.rabbitmq.client.AMQP;
import com.rabbitmq.client.Channel;
import com.rabbitmq.client.Connection;
import com.rabbitmq.client.Consumer;
import com.rabbitmq.client.Envelope;
import com.rabbitmq.client.QueueingConsumer;

/**
 * MQ消费信息
 *
 * <p>
 * All rights Reserved, Designed By HQYG
 * </p>
 * 
 * @Copyright: Copyright(C) 2016
 * @Company: HQYG.
 * @author: zifeng
 * @Createdate: 2016年11月30日上午9:59:26
 */
public class MqConsumerUtils {

	private static Logger logger = LoggerFactory.getLogger(MqConsumerUtils.class);
	
	/**
	 * mq 队列每次取数据条数
	 */
	private static final Integer prefetchCount = 1;

	private static final String DEFAULT_CHART = "UTF-8";
	
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
		String CONN_HOSTNAME = "127.0.0.1";
		String CONN_USERNAME = "guest";
		String CONN_PASSWORD = "guest";
	}

	/**
	 * 启动MQ消费
	 * @param messageProcessor
	 * @throws IOException 
	 */
	public static void recevie(MessageProcessor messageProcessor) throws IOException {
		
		Connection connection = null;//MqBaseConnection.getConnection();
		final Channel channel = connection.createChannel();

		Consumer consumer = new QueueingConsumer(channel) {

			@Override
			public void handleDelivery(String consumerTag, Envelope envelope, AMQP.BasicProperties properties,
					byte[] body) throws IOException {
				channel.basicAck(envelope.getDeliveryTag(), false);
				messageProcessor.process(new String(body, DEFAULT_CHART));
			}

		};
		
//    	channel.queueDeclare(messageProcessor.getQueue(), false, false, false, null);
		channel.basicQos(prefetchCount);
		channel.basicConsume(messageProcessor.getQueue(), false, consumer);
		
	}
	
	/**
	 * 接受java对象
	 * @param eventMessageProcessors
	 */
	public static void recevie(List<EventMessageProcessor> eventMessageProcessors) {
		
//		for(EventMessageProcessor eventMessageProcessor : eventMessageProcessors) {
//			controller.add(eventMessageProcessor.getQueue(), eventMessageProcessor.getExchange(), eventMessageProcessor);
//		}
//		controller.start();
	}
	
	public static void destroy() throws Exception {
//		controller.destroy();
	}

}
