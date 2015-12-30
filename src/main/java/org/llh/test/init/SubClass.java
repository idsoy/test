package org.llh.test.init;
/**
 * 描    述:<br/>
 * 作    者:lilianghui<br/>
 * 日    期:2015年12月27日下午1:46:43<br/>
 * 版权所有:idsoy.com<br/>
 * 版    本:V1.0<br/>
 */
public class SubClass extends SuperClass {

	static {
		System.out.println("SubClass init!");
	}
	
	public static int value = 11211;
	
}


