package org.llh.test.init;

import org.llh.test.ImportClass;

/**
 * 描    述:<br/>
 * 作    者:lilianghui<br/>
 * 日    期:2015年12月27日下午1:47:59<br/>
 * 版权所有:idsoy.com<br/>
 * 版    本:V1.0<br/>
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


