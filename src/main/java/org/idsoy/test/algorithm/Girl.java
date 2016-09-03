package org.idsoy.test.algorithm;

import java.io.Serializable;

public class Girl implements Serializable{

	private static final long serialVersionUID = -7119740170108718409L;

	private String name;
	
	private Integer age;
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}
	
}
