package org.idsoy.test.init;
/**
 * test static data processor
 *
 * @author idsoy
 * @since 1.0.0
 */
public class InitClass {

	static int i = 1;
	static {
		i = 2;
		System.out.println(i);
	}
	
	
}


