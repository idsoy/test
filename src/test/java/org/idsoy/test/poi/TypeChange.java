package org.idsoy.test.poi;

public class TypeChange {
	public TypeChange() {
	}

	public static int stringToInt(String intstr) {
		Integer integer;
		integer = Integer.valueOf(intstr);
		return integer.intValue();
	}

	public static String intToString(int value) {
		Integer integer = new Integer(value);
		return integer.toString();
	}

	public static float stringToFloat(String floatstr) {
		Float floatee;
		floatee = Float.valueOf(floatstr);
		return floatee.floatValue();
	}

	public static String floatToString(float value) {
		Float floatee = new Float(value);
		return floatee.toString();
	}

	public static java.sql.Date stringToDate(String dateStr) {
		return java.sql.Date.valueOf(dateStr);
	}

	public static String dateToString(java.sql.Date datee) {
		return datee.toString();
	}
	
	@SuppressWarnings("unchecked")
	public static <T> T change(Object value, Class<T> clazz) {
		return (T)value;
	}

}