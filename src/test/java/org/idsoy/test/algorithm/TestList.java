package org.idsoy.test.algorithm;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

/**
 * @author idsoy
 * @since 1.0.0
 */
public class TestList {

	public static void main(String[] args) {
		
		/*List<Girl> list = new ArrayList<Girl>();
		Map<Integer, Girl> map = new HashMap<Integer, Girl>();
		
		int i = 0;
		Girl girl;
		while(i++ < 10000) {
			
			girl = new Girl();
			girl.setName("test" + i);
			girl.setAge(i);
			list.add(girl);
			
			map.put(null, girl);
			
		}
		
		System.out.println(map.containsKey(null));
		
		Long start = System.currentTimeMillis();
		
		
		int j = 0;
		
		while(j++ < 10) {
			//map.get(1000);
			
			for(Girl g : list) {
				
				if(g.getAge().equals(10000)) {
					break;
				}
				
			}
		}
		
		System.out.println(System.currentTimeMillis() - start);*/
		
		
		List<Long> ids = new ArrayList<Long>();
		
		ids.add(Long.valueOf(1000000));
		
		System.out.println(ids.contains(1000000L));
		
		System.out.println(new BigDecimal(10));
		
	}
}
