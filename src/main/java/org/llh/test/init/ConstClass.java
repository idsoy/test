package org.llh.test.init;
/**
 * 描    述:<br/>
 * 作    者:lilianghui<br/>
 * 日    期:2015年12月27日下午1:52:55<br/>
 * 版权所有:idsoy.com<br/>
 * 版    本:V1.0<br/>
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
