package org.idsoy.test.poi;

import java.beans.PropertyDescriptor;
import java.io.FileInputStream;
import java.lang.reflect.Field;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created on 2017/12/17.
 *
 * @version 1.0.0
 * @author idsoy
 */
public final class ExcelUtils {

	private static final Logger LOGGER = LoggerFactory.getLogger(ExcelUtils.class);
	
    private ExcelUtils() {}
    
    @SuppressWarnings("resource")
	public static <T> List<T> readExcel(String path, Integer sheetNum, Class<T> clazz) throws Exception {
    	
    	XSSFWorkbook workbook = new XSSFWorkbook(new FileInputStream(path));
    	
    	XSSFSheet sheet = workbook.getSheetAt(sheetNum);  
        
        List<T> response = new ArrayList<>(sheet.getPhysicalNumberOfRows());
        
        //获得属性 
//        BeanInfo beanInfo = Introspector.getBeanInfo(clazz);
//        PropertyDescriptor[] propertyDesc = beanInfo.getPropertyDescriptors();
        Field[] fields = clazz.getDeclaredFields();
        
        List<PropertyDescriptor> properties = new ArrayList<>(fields.length);
        
        for(Field field : fields) {
        	
        	ExcelCell excelCell = field.getAnnotation(ExcelCell.class);
        	
        	if(Objects.isNull(excelCell)) {
        		continue;
        	}
        	
        	properties.add(excelCell.value(), new PropertyDescriptor(field.getName(), clazz));
        }
        
        sheet.forEach(row -> {
        	
        	if(row.getRowNum() < 2) {
        		return;
        	}
        	
        	T value;
        	try {
        		value = clazz.newInstance();
			} catch (Exception e) {
				return;
			}
        	
        	for(int i=0; i<properties.size(); i++) {
        		
        		PropertyDescriptor property = properties.get(i);
        		
        		try {
        			property.getWriteMethod().invoke(value, getCellValue(row.getCell(i), property.getReadMethod().getReturnType()));
					
				} catch (Exception e) {
					LOGGER.warn("format error!");
				}
        		
        	}
        	
        	System.out.println(row.getRowNum());
        	response.add(value);
        });
    	
    	return response;
    }
    
    private static Object getCellValue(Cell cell, Class<?> clazz) {
    	
    	if(CellType.STRING.equals(cell.getCellTypeEnum())) {
    		return (String) cell.getStringCellValue();
    	}else if(CellType.NUMERIC.equals(cell.getCellTypeEnum()) || CellType.FORMULA.equals(cell.getCellTypeEnum())) {
    		
    		if(clazz == Long.class) {
    			return (long)cell.getNumericCellValue();
    		}else if(clazz == Integer.class) {
    			return (int) cell.getNumericCellValue();
    		}else if(clazz == BigDecimal.class) {
    			return new BigDecimal(String.valueOf(cell.getNumericCellValue()));
    		}else if(clazz == Double.class) {
    			return cell.getNumericCellValue();
    		}else if(clazz == String.class) {
    			return String.valueOf(cell.getNumericCellValue());
    		}
    	}
    	
    	return null;
    }

}
