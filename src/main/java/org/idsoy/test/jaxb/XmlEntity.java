/**  
 * Project Name:test  
 * File Name:XmlEntity.java  
 * Package Name:org.idsoy.test.jaxb  
 * Date:2016年8月21日下午4:53:13  
 * Copyright (c) 2016, chenzhou1025@126.com All Rights Reserved.  
 *  
*/  
  
package org.idsoy.test.jaxb;  

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**  
 * ClassName:XmlEntity <br/>  
 * Function: TODO ADD FUNCTION. <br/>  
 * Reason:   TODO ADD REASON. <br/>  
 * Date:     2016年8月21日 下午4:53:13 <br/>  
 * @author   idsoy  
 * @version    
 * @since    JDK 1.6  
 * @see        
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name="service")
public class XmlEntity implements Serializable {

	private static final long serialVersionUID = 2793806408422607890L;

	@XmlElement
	private String name;
	
	@XmlElement(name="password", namespace="http://www.baidu.com/")
	private String pwd;
	
	
	private Integer age;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}
	
}
  
