package org.idsoy.test;

import java.awt.AWTException;
import java.awt.Desktop;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URISyntaxException;
import java.net.URL;

import javax.imageio.ImageIO;

/**
 * 
 *
 * @author idsoy
 * @since 1.0.0
 */
public class App {

	private App() {
		throw new AssertionError();
	}

	public static void main(String[] args) throws Exception {
		
		// 此方法仅适用于JdK1.6及以上版本
		Desktop.getDesktop().browse(new URL("http://google.com/intl/en/").toURI());
		Robot robot = new Robot();
		robot.delay(10000);
		Dimension d = new Dimension(Toolkit.getDefaultToolkit().getScreenSize());
		int width = (int) d.getWidth();
		int height = (int) d.getHeight();
		// 最大化浏览器
		robot.keyRelease(KeyEvent.VK_F11);
		robot.delay(2000);
		Image image = robot.createScreenCapture(new Rectangle(0, 0, width, height));
		BufferedImage bi = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);
		Graphics g = bi.createGraphics();
		g.drawImage(image, 0, 0, width, height, null);
		// 保存图片
		ImageIO.write(bi, "jpg", new File("D:\\google.jpg"));

		String a = String.format("%10s", "a");

		System.out.print(a.replace(" ", "X"));

		// Object sum = 1;
		//
		// Integer i = (Integer)sum;
		//
		// int i1 = i;
		//
		// System.out.println(i1);
		//
		//
		// Boolean b = new Boolean("true");
		//
		// System.out.println(Boolean.valueOf("ss"));
		//
		// String s = "sss";
		// String s1 = new String("sss");
		//
		// System.out.println(s1 == "sss");
		//
		//
		// try {
		// System.out.println(String.class.newInstance());
		// } catch (InstantiationException e) {
		// e.printStackTrace();
		// } catch (IllegalAccessException e) {
		// e.printStackTrace();
		// }
		//
		// System.out.println("\u5b9a\u4e49\u6700\u5c0f\u7a7a\u95f2");
	}

}
