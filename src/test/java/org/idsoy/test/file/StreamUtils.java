package org.idsoy.test.file;

import java.io.InputStream;
import java.io.OutputStream;
import java.io.Reader;
import java.io.Writer;
import java.net.HttpURLConnection;
import java.util.Objects;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created on 2017/12/17.
 *
 * @version 1.0.0
 * @author idsoy
 */
public final class StreamUtils {

	private static final Logger LOGGER = LoggerFactory.getLogger(StreamUtils.class);

	/**
	 * 关闭输入流.
	 * 
	 * @param input 输入流.
	 * 
	 */
	public static void close(InputStream input) {
		if (Objects.nonNull(input)) {
			try {
				input.close();
				input = null;
			} catch (Exception e) {
				LOGGER.error("Fail to close inputStream stream.", e);
			}
		}
	}

	/**
	 * 关闭输出流.
	 * 
	 * @param output 输出流.
	 * 
	 */
	public static void close(OutputStream output) {
		if (Objects.nonNull(output)) {
			try {
				output.flush();
				output.close();
			} catch (Exception e) {
				LOGGER.error("Fail to close outputStream stream.", e);
			}
		}
	}

	/**
	 * 关闭http连接.
	 * 
	 * @param conn http连接.
	 * 
	 */
	public static void close(HttpURLConnection connection) {
		if (Objects.nonNull(connection)) {
			connection.disconnect();
			connection = null;
		}
	}

	/**
	 * 关闭字符输出流.
	 * 
	 * @param writer 字符输出流.
	 * 
	 */
	public static void close(Writer writer) {
		if (Objects.nonNull(writer)) {
			try {
				writer.flush();
				writer.close();
				writer = null;
			} catch (Exception e) {
				LOGGER.error("Fail to close writer stream.", e);
			}
		}
	}

	/**
	 * 关闭字符输入流.
	 * 
	 * @param reader
	 *            输入流.
	 * 
	 */
	public static void close(Reader reader) {
		if (Objects.nonNull(reader)) {
			try {
				reader.close();
				reader = null;
			} catch (Exception e) {
				LOGGER.error("Fail to close reader stream.", e);
			}
		}
	}

}