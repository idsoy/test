package org.llh.test.init;

/**
 * test import
 *
 * @author idsoy
 * @since 1.0.0
 */
public class NotInitialization {

	public static void main(String[] args) {
		
		System.out.println(ConstClass.HELLO_NEW_WORLD);
		
		//System.out.println(ImportClass.VALUE);
		
		ClassLoader cl = NotInitialization.class.getClassLoader();
		
		ClassLoader strCl = String.class.getClassLoader();
		
		System.out.println(cl.getClass().getName());
		
		System.out.println(strCl.getClass().getName());
		
	}
	
}