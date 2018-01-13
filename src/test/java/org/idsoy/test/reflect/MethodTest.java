package org.idsoy.test.reflect;

import java.lang.reflect.Method;

import org.junit.Test;

public class MethodTest {

	@Test
	public void method() throws NoSuchMethodException, SecurityException {
		Method method = UserService.class.getMethod("queryUserNameById", Long.class);
		System.out.println(method.getReturnType());
		System.out.println(method.getGenericReturnType());
	}
	
}
