package org.idsoy.test.init;
/**
 * test toString
 *
 * @author idsoy
 * @since 1.0.0
 */
public class MyString {
	
	private String value = "idsoy";
	
	public MyString(String value) {
		this.value = value;
	}
	
	@Override
	public String toString() {
		
		return value;
		
	}

}


