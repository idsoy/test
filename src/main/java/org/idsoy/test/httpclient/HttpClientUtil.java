package org.idsoy.test.httpclient;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import org.apache.commons.io.IOUtils;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.NameValuePair;
import org.apache.http.client.HttpClient;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.util.EntityUtils;  
/* 
 * 利用HttpClient进行post请求的工具类 
 */  
public class HttpClientUtil {  
    public String doPost(String url,Map<String,String> map,String charset){  
        HttpClient httpClient = null;  
        HttpGet httpPost = null;  
        String result = null;  
        try{  
            httpClient = new SSLClient();  
            httpPost = new HttpGet(url);  
            //设置参数  
            List<NameValuePair> list = new ArrayList<NameValuePair>();  
            Iterator iterator = map.entrySet().iterator();  
            while(iterator.hasNext()){  
                Entry<String,String> elem = (Entry<String, String>) iterator.next();  
                list.add(new BasicNameValuePair(elem.getKey(),elem.getValue()));  
            }  
            if(list.size() > 0){  
                UrlEncodedFormEntity entity = new UrlEncodedFormEntity(list,charset);  
                //httpPost.setEntity(entity);  
            }  
            HttpResponse response = httpClient.execute(httpPost);  
            if(response != null){  
                HttpEntity resEntity = response.getEntity();  
                if(resEntity != null){  
                    result = EntityUtils.toString(resEntity,charset);  
                }  
            }  
        }catch(Exception ex){  
            ex.printStackTrace();  
        }  
        return result;  
    }  
    
    public static String doGet(String url) {

		HttpClient httpClient = HttpClients.createDefault();
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
    
}  