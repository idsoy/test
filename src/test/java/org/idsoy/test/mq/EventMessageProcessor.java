package org.idsoy.test.mq;


/**
 * 处理消息接口
 *
 * <p>All rights Reserved, Designed By HQYG</p>
 * @Copyright:   Copyright(C) 2016
 * @Company:     HQYG.
 * @author:      zifeng
 * @Createdate:  2016年11月4日下午8:50:28
 */
public interface EventMessageProcessor{

	public String getQueue();
	
	public String getExchange();
	
}
