package org.idsoy.test.init;

/**
 * subClass have a static data
 *
 * @author idsoy
 * @since 1.0.0
 */
public class SubClass extends SuperClass {

	static {
		System.out.println("SubClass init!");
	}
	
	public static int value = 11211;
	
}


