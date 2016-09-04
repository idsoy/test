/**  
 * Project Name:test  
 * File Name:TestHashMap.java  
 * Package Name:org.idsoy.test.algorithm  
 * Date:2016年3月16日下午10:41:35  
 * Copyright (c) 2016, chenzhou1025@126.com All Rights Reserved.  
 *  
*/  
  
package org.idsoy.test.algorithm;  

import java.util.HashMap;
import java.util.Map;

/**  
 * ClassName:TestHashMap <br/>  
 * Function: TODO ADD FUNCTION. <br/>  
 * Reason:   TODO ADD REASON. <br/>  
 * Date:     2016年3月16日 下午10:41:35 <br/>  
 * @author   idsoy  
 * @version    
 * @since    JDK 1.6  
 * @see        
 */
public class TestHashMap {

	public static void main(String[] args) {
		
		Map<String, Girl> girls = new HashMap<String, Girl>();
		
		Girl girl = new Girl();
		girl.setName("Lee");
		girl.setAge(18);
		
		int i = 0;
		while(i++ < 20) {
			girls.put(girl.getName(), girl);
		}
		
		girls.get("Lee");
		girls.get(null);
		
	}
	
}
  
