package org.idsoy.test.jaxb;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.JAXBException;

import org.junit.Test;

public class JaxbTest3 {

	/**
	 * @throws JAXBException
	 */
	@Test
	public void showMarshaller() {
		Country country = new Country();
		country.setName("中国");

		List<Province> list = new ArrayList<Province>();
		Province province = new Province();
		province.setName("江苏省");
		province.setProvCity("南京市");
		Province province2 = new Province();
		province2.setName("浙江省");
		province2.setProvCity("杭州市");
		list.add(province);
		list.add(province2);

		country.setProvinceList(list);

		String str = JaxbUtil.convertToXml(country);
		System.out.println(str);
	}
	
	@Test
	public void getMessage() {
		String text = "<xml><ToUserName><![CDATA[toUser]]></ToUserName><FromUserName><![CDATA[fromUser]]></FromUserName><CreateTime>12345678</CreateTime><MsgType><![CDATA[text]]></MsgType><Content><![CDATA[你好]]></Content></xml>";
		
		Message reciveMessage = JaxbUtil.converyToJavaBean(text, Message.class);
		
		Message sendMessage = new Message();
		sendMessage.setToUserName(reciveMessage.getFromUserName());
		sendMessage.setFromUserName(reciveMessage.getToUserName());
		sendMessage.setMsgType("text");
		sendMessage.setCreateTime(System.currentTimeMillis()/1000);
		sendMessage.setContent("汪汪汪！");
		
		System.out.println(JaxbUtil.convertToXml(sendMessage));
		System.out.println();
		
	}

	/** 
	 *  
	 */
	@Test
	public void showUnMarshaller() {
		String str = "<?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"yes\"?>" + "<country>"
				+ "    <country_name>中国</country_name>" + "    <provinces>" + "        <province>"
				+ "            <province_name>江苏省</province_name>" + "           <prov_city>南京市</prov_city>"
				+ "        </province>" + "       <province>" + "           <province_name>浙江省</province_name>"
				+ "           <prov_city>杭州市</prov_city>" + "       </province>" + "    </provinces>" + "</country>";
		Country country = JaxbUtil.converyToJavaBean(str, Country.class);
		System.out.println(country);
	}

}