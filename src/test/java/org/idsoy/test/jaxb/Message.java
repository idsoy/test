/**  
 * Project Name:test  
 * File Name:Message.java  
 * Package Name:org.idsoy.test.jaxb  
 * Date:2017年1月13日上午12:42:37  
 * Copyright (c) 2017, chenzhou1025@126.com All Rights Reserved.  
 *  
*/  
  
package org.idsoy.test.jaxb;  

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**  
 * ClassName:Message <br/>  
 * Function: TODO ADD FUNCTION. <br/>  
 * Reason:   TODO ADD REASON. <br/>  
 * Date:     2017年1月13日 上午12:42:37 <br/>  
 * @author   idsoy  
 * @version    
 * @since    JDK 1.6  
 * @see        
 */

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "xml")
@XmlType
public class Message {

	@XmlElement(name = "ToUserName")
	private String toUserName;
	
	@XmlElement(name = "FromUserName")
	private String fromUserName;
	
	@XmlElement(name = "CreateTime")
	private Long createTime;
	
	@XmlElement(name = "MsgType")
	private String msgType;
	
	@XmlElement(name = "Content")
	private String content;

	public String getToUserName() {
		return toUserName;
	}

	public void setToUserName(String toUserName) {
		this.toUserName = toUserName;
	}

	public String getFromUserName() {
		return fromUserName;
	}

	public void setFromUserName(String fromUserName) {
		this.fromUserName = fromUserName;
	}

	public Long getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Long createTime) {
		this.createTime = createTime;
	}

	public String getMsgType() {
		return msgType;
	}

	public void setMsgType(String msgType) {
		this.msgType = msgType;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}
	
}
  
