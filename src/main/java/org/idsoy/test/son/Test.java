package org.idsoy.test.son;

public class Test {

	
	public static void main(String[] args) {
		
		Son son = new Son();
		son.setLastName("Lee");
		son.setFirstName("Idsoy");
		
		Father father = (Father)son;
		
		System.out.println(father.getLastName());
		
		son = (Son)father;
		
		System.out.println(son.getFirstName());
	}
	
}
