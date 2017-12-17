package org.idsoy.test.log;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Slf4jTest {

	private final static Logger logger = LoggerFactory.getLogger(Slf4jTest.class);

	public static void main(String[] args) {

		try {
			logger.error("this is an error test.");
			logger.debug("this is an debug test.");
			logger.info("{} is {}.", "a", "b");
			System.out.println("OK.");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}