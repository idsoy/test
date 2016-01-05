package org.idsoy.test.init;

/**
 * test class init
 * 
 * @author idsoy
 * @since 1.0.0
 */
public class ConstClass {
	
	static {
		System.out.println("ConstClass init!");
	}
	
	public static final String HELLO_WORLD = "Hello world!";
	
	public static final String HELLO_NEW_WORLD = new String("Hello new World!");
	
	public static final MyString HELLO_IDSOY = new MyString("Hello idsoy!");
	
	public static final Integer MIN_VALUE = 1;
	
	public static final Integer MIN_NEW_VALUE = new Integer(1);
	
	public static final Integer MAX_VALUE = 1121;
	
	public static final Integer MAX_NEW_VALUE = new Integer(1121);
	
	public static final int VALUE = 1121;

}
