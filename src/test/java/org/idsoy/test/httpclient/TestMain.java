package org.idsoy.test.httpclient;
import java.util.HashMap;  
import java.util.Map;  
//对接口进行测试  
public class TestMain {  
    private String url = "https://192.168.1.101/";  
    private String charset = "utf-8";  
    private HttpClientUtil httpClientUtil = null;  
      
    public TestMain(){  
        httpClientUtil = new HttpClientUtil();  
    }  
      
    public void test(){  
        String httpOrgCreateTest = "https://api-3t.sandbox.paypal.com/nvp?METHOD=SetExpressCheckout&VERSION=94.0&PWD=K3XKMWSD9TW4VUKJ&USER=dyj2009_api1.inesun.com&SIGNATURE=AhSULXLxrQ-3WOfjwirTZ6E.hl-BARV04IvxOnPzmfZXWz7hhVbMsFe-&PAYMENTREQUEST_0_AMT=17.00&RETURNURL=http://localhost:8080/checkout-mini-browser/Return?page=review&CANCELURL=http://localhost:8080/checkout-mini-browser/cancel.jsp&PAYMENTREQUEST_0_CURRENCYCODE=USD&PAYMENTREQUEST_0_ITEMAMT=10.00&PAYMENTREQUEST_0_TAXAMT=2.00&PAYMENTREQUEST_0_SHIPPINGAMT=5.00&PAYMENTREQUEST_0_HANDLINGAMT=1.00&PAYMENTREQUEST_0_SHIPDISCAMT=-3.00&PAYMENTREQUEST_0_INSURANCEAMT=2.00&L_PAYMENTREQUEST_0_NAME0=DSLR%20Camera&L_PAYMENTREQUEST_0_NUMBER0=A0123&L_PAYMENTREQUEST_0_DESC0=Autofocus%20Camera&L_PAYMENTREQUEST_0_AMT0=10.00&L_PAYMENTREQUEST_0_QTY0=1&LOGOIMG=https://d1d3gln0ohq8wj.cloudfront.net/imagecache/GB/logo.gif&BUTTONSOURCE=PP-DemoPortal-EC-IC-java";  
        Map<String,String> createMap = new HashMap<String,String>();  
        String httpOrgCreateTestRtn = httpClientUtil.doPost(httpOrgCreateTest,createMap,charset);  
        System.out.println("result:"+httpOrgCreateTestRtn);  
    }  
      
    public static void main(String[] args){  
        TestMain main = new TestMain();  
        main.test();  
    }  
}  