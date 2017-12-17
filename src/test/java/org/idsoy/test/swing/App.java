package org.idsoy.test.swing;

import java.util.Calendar;

public class App {

	public static void main(String[] args) throws Exception {
		
		int hours = 0;
		
		Long start = System.currentTimeMillis();
		hours = Calendar.getInstance().get(Calendar.HOUR_OF_DAY);
		System.out.println(System.currentTimeMillis()-start);
		
		System.out.println(hours);
	}

}
