package org.idsoy.test.son;

import java.beans.BeanInfo;
import java.beans.Introspector;
import java.beans.PropertyDescriptor;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

public class BeanUtils {

	public static Map<String, Object> convertBeanToMap(Son son) {

		if (son == null) {
			return null;
		}
		
		son.getClass().getAnnotations();
		
		Map<String, Object> map = new HashMap<String, Object>();
		try {
			BeanInfo beanInfo = Introspector.getBeanInfo(son.getClass());
			PropertyDescriptor[] propertyDescriptors = beanInfo.getPropertyDescriptors();
			for (PropertyDescriptor property : propertyDescriptors) {
				String key = property.getName();
				if (!key.equals("class")) {
					Method getter = property.getReadMethod();
					Object value = getter.invoke(son);
					map.put(key, value);
				}
			}
		} catch (Exception e) {
		}
		return map;
	}
	
	public static void main(String[] args) {
		
		Son son = new Son();
		son.setFirstName("Idsoy");
		son.setLastName("Lee");
		
		Map<String, Object> map = convertBeanToMap(son);
		
		System.out.println(map);
		
	}
	
}
