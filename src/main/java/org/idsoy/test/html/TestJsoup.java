package org.idsoy.test.html;

import org.idsoy.test.httpclient.HttpClientUtil;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

public class TestJsoup {

	public static void main(String[] args) {
		
		String url = "http://www.xe.com/currencyconverter/convert/?Amount=1&From=USD&To=CNY";
		
		String html = HttpClientUtil.doGet(url);
		
		Document doc = Jsoup.parse(html);
		Elements elements = doc.getElementsByClass("ucc-result-table");
		String rate = elements.select(".rightCol").first().ownText().replace(" ", "");

		System.out.println(rate);
		
	}
	
}
