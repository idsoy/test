/**  
 * Project Name:test  
 * File Name:MySon.java  
 * Package Name:org.idsoy.test.son  
 * Date:2016年4月27日下午10:30:08  
 * Copyright (c) 2016, chenzhou1025@126.com All Rights Reserved.  
 *  
*/  
  
package org.idsoy.test.son;  
/**  
 * ClassName:MySon <br/>  
 * Function: TODO ADD FUNCTION. <br/>  
 * Reason:   TODO ADD REASON. <br/>  
 * Date:     2016年4月27日 下午10:30:08 <br/>  
 * @author   idsoy  
 * @version    
 * @since    JDK 1.6  
 * @see        
 */
public class MySon extends MyFather {

	@Override
	public void doSon() {
		System.out.println("MySon doSon!");
	}
	
	
	
	@Override
	public void beforeClass() {
		System.out.println("MySon beforeClass!");
	}



	public static void main(String[] args) {
		MySon son = new MySon();
		
		son.print();
	}

}
  
