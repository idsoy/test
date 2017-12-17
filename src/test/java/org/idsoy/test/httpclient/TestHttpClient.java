package org.idsoy.test.httpclient;

import java.io.IOException;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;

import javax.net.ssl.SSLContext;
import javax.net.ssl.TrustManager;
import javax.net.ssl.X509TrustManager;

import org.apache.commons.io.IOUtils;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.config.CookieSpecs;
import org.apache.http.client.config.RequestConfig;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.conn.scheme.Scheme;
import org.apache.http.conn.ssl.SSLSocketFactory;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;

public class TestHttpClient {
	
	public static final String URL = "https://api-3t.sandbox.paypal.com/nvp?METHOD=SetExpressCheckout&VERSION=94.0&PWD=K3XKMWSD9TW4VUKJ&USER=dyj2009_api1.inesun.com&SIGNATURE=AhSULXLxrQ-3WOfjwirTZ6E.hl-BARV04IvxOnPzmfZXWz7hhVbMsFe-&PAYMENTREQUEST_0_AMT=17.00&RETURNURL=http://localhost:8080/checkout-mini-browser/Return?page=review&CANCELURL=http://localhost:8080/checkout-mini-browser/cancel.jsp&PAYMENTREQUEST_0_CURRENCYCODE=USD&PAYMENTREQUEST_0_ITEMAMT=10.00&PAYMENTREQUEST_0_TAXAMT=2.00&PAYMENTREQUEST_0_SHIPPINGAMT=5.00&PAYMENTREQUEST_0_HANDLINGAMT=1.00&PAYMENTREQUEST_0_SHIPDISCAMT=-3.00&PAYMENTREQUEST_0_INSURANCEAMT=2.00&L_PAYMENTREQUEST_0_NAME0=DSLR%20Camera&L_PAYMENTREQUEST_0_NUMBER0=A0123&L_PAYMENTREQUEST_0_DESC0=Autofocus%20Camera&L_PAYMENTREQUEST_0_AMT0=10.00&L_PAYMENTREQUEST_0_QTY0=1&LOGOIMG=https://d1d3gln0ohq8wj.cloudfront.net/imagecache/GB/logo.gif&BUTTONSOURCE=PP-DemoPortal-EC-IC-java";

	public static void main(String[] args) {

		System.out.println(doGet(URL));
		
	}
	
	
	public static String doGet(String url) {
		
		HttpClient httpClient = HttpClientBuilder.create().build();
		HttpGet httpGet = new HttpGet(url);
		String contextType = "";
		httpGet.setHeader("content-type", contextType);
		// 执行POST请求
		HttpResponse response;
		String result = "";
		try {
			response = httpClient.execute(httpGet);
			// 获取响应实体
			HttpEntity entity = response.getEntity();
			byte[] bs = IOUtils.toByteArray(entity.getContent());
			if (null != entity) {
				EntityUtils.consume(entity); // Consume response content
			}
			result = new String(bs);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return result;
	}

	/**
	 * 
	 * @param url
	 * @param contextType
	 *            "image/jpeg","application/Json"
	 * @return
	 */
	public static byte[] sendHttpsGetUrl(HttpClient httpClient1, String url, String contextType) {

		// 响应内容
		byte[] bs = null;

		// 创建默认的httpClient实例
		HttpClient httpClient = HttpClientBuilder.create().build(); // new DefaultHttpClient();
		//HttpClient httpClient = httpClient1;

		// 创建TrustManager
		X509TrustManager xtm = new X509TrustManager() {
			public void checkClientTrusted(X509Certificate[] chain, String authType) throws CertificateException {
			}

			public void checkServerTrusted(X509Certificate[] chain, String authType) throws CertificateException {
			}

			public X509Certificate[] getAcceptedIssuers() {
				return new X509Certificate[] {};
			}
		};
		try {
//			SSLContext ctx = SSLContext.getInstance("SSL");
//
//			// 使用TrustManager来初始化该上下文，TrustManager只是被SSL的Socket所使用
//			ctx.init(null, new TrustManager[] { xtm }, null);
//
//			SSLSocketFactory sf = new SSLSocketFactory(ctx, SSLSocketFactory.ALLOW_ALL_HOSTNAME_VERIFIER);
//			Scheme sch = new Scheme("https", 443, sf);
//			httpClient.getConnectionManager().getSchemeRegistry().register(sch);
			// 创建HttpPost
			HttpGet httpget = new HttpGet(url);
			httpget.setHeader("content-type", contextType);
			// 执行POST请求
			HttpResponse response = httpClient.execute(httpget);
			// 获取响应实体
			HttpEntity entity = response.getEntity();
			bs = IOUtils.toByteArray(entity.getContent());
			if (null != entity) {
				EntityUtils.consume(entity); // Consume response content
			}
			return bs;
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			// 关闭连接,释放资源
			// httpClient.getConnectionManager().shutdown();
		}
		return bs;
	}

}
