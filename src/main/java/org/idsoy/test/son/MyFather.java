/**  
 * Project Name:test  
 * File Name:MySon.java  
 * Package Name:org.idsoy.test.son  
 * Date:2016年4月27日下午10:25:51  
 * Copyright (c) 2016, chenzhou1025@126.com All Rights Reserved.  
 *  
*/  
  
package org.idsoy.test.son;  
/**  
 * ClassName:MySon <br/>  
 * Function: TODO ADD FUNCTION. <br/>  
 * Reason:   TODO ADD REASON. <br/>  
 * Date:     2016年4月27日 下午10:25:51 <br/>  
 * @author   idsoy  
 * @version    
 * @since    JDK 1.6  
 * @see        
 */
public abstract class MyFather extends AbstractFather {

	@Override
	public void doSome() {
		beforeClass();
		doSon();
		afterClass();
	}
	
	public void beforeClass() {
		System.out.println("MyFather beforeClass!");
	}
	
	public abstract void doSon();
	
	public void afterClass() {
		System.out.println("MyFather beforeClass!");
	}
	

}
  
