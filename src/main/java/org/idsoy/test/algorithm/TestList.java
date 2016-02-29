package org.idsoy.test.algorithm;

import java.util.ArrayList;
import java.util.List;

public class TestList {

	public static void main(String[] args) {
		
		Girl girl = new Girl();
		girl.setName("test");
		
		Girl girl1 = new Girl();
		girl.setName("test1");
		
		List<Girl> list = new ArrayList<Girl>();
		
		list.add(girl);
		list.add(girl);
		
		list.add(girl1);
		
		System.out.println();
		
		list.remove(girl);
	}
}
