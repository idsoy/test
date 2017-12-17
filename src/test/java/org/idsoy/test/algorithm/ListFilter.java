package org.idsoy.test.algorithm;

import java.util.ArrayList;
import java.util.List;

public class ListFilter {

	public static void main(String[] args) {
		
		List<String> boyNames = new ArrayList<>();
		
		List<String> girlNames = new ArrayList<>();
		
		boyNames.add("dabao");
		boyNames.add("songwei");
		boyNames.add("zifeng");
		boyNames.add("zifeng");
		boyNames.add("laohu");

		girlNames.add("zifeng");
		girlNames.add("laohu");
		
		System.out.println(girlNames.retainAll(boyNames));
		System.out.println(girlNames);

	}
	
}
