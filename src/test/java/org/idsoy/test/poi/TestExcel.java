package org.idsoy.test.poi;

import java.util.List;

public class TestExcel {

	public static void main(String[] args) throws Exception {
		
		List<SchoolReport> str = ExcelUtils.readExcel("E:/suchool_report.xlsx", 0, SchoolReport.class);
		
		System.out.println(str);
		
	}
	
}
