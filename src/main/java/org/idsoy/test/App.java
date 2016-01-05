package org.idsoy.test;

/**
 * 
 *
 * @author idsoy
 * @since 1.0.0
 */
public class App {
	
	private App() {
		throw new AssertionError();
	}

	public static void main(String[] args) {
		
		Object sum = 1;
		
		Integer i = (Integer)sum;
		
		int i1 = i;
		
		System.out.println(i1);
		
		
		Boolean b = new Boolean("true");
		
		System.out.println(Boolean.valueOf("ss"));
		
		String s = "sss";
		String s1 = new String("sss");
		
		System.out.println(s1 == "sss");
		
		
		try {
			System.out.println(String.class.newInstance());
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		}
		
		System.out.println("\u5b9a\u4e49\u6700\u5c0f\u7a7a\u95f2");
	}
	
}


