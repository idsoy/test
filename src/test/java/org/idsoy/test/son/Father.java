package org.idsoy.test.son;

import java.io.Serializable;

public class Father implements Serializable {

	private static final long serialVersionUID = 6209828816384651712L;
	
	private String lastName;
	
	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

}
