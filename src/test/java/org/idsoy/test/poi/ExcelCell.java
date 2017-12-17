package org.idsoy.test.poi;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Created on 2017年12月17日.
 *
 * @version 1.0.0
 * @author idsoy
 */
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.FIELD})
public @interface ExcelCell {

	/** 列 */
	int value();
	
	/** 不允许为空 */
	boolean require() default false;
	
}
