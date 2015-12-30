package org.llh.test.init;
/**
 * 描    述:<br/>
 * 作    者:lilianghui<br/>
 * 日    期:2015年12月27日下午9:26:56<br/>
 * 版权所有:idsoy.com<br/>
 * 版    本:V1.0<br/>
 */
public class InitClass {

	static int i = 1;
	static {
		i = 2;
		System.out.println(i);
	}
	
	
}


