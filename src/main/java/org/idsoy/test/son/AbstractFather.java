/**  
 * Project Name:test  
 * File Name:AbstractFather.java  
 * Package Name:org.idsoy.test.son  
 * Date:2016年4月27日下午10:21:00  
 * Copyright (c) 2016, chenzhou1025@126.com All Rights Reserved.  
 *  
*/  
  
package org.idsoy.test.son;  
/**  
 * ClassName:AbstractFather <br/>  
 * Function: TODO ADD FUNCTION. <br/>  
 * Reason:   TODO ADD REASON. <br/>  
 * Date:     2016年4月27日 下午10:21:00 <br/>  
 * @author   idsoy  
 * @version    
 * @since    JDK 1.6  
 * @see        
 */
public abstract class AbstractFather {

	public abstract void doSome();
	
	public void print() {
		
		System.out.println("The class begin!");
		doSome();
		System.out.println("The class end!");
		
	}
	
}