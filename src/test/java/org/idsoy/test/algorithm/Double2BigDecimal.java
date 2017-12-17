package org.idsoy.test.algorithm;

import java.math.BigDecimal;


public class Double2BigDecimal {

	public static void main(String[] args) {
		
		Double point = 1.90;
		
		BigDecimal bPoint = new BigDecimal(point);
		
		System.out.println(bPoint);
		
	}
	
}
