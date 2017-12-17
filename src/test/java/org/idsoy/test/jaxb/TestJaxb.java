package org.idsoy.test.jaxb;  
/**  
 * ClassName:TestJaxb <br/>  
 * Function: TODO ADD FUNCTION. <br/>  
 * Reason:   TODO ADD REASON. <br/>  
 * Date:     2016年8月21日 下午4:58:55 <br/>  
 * @author   idsoy  
 * @version    
 * @since    JDK 1.6  
 * @see        
 */
public class TestJaxb {

	public static void main(String[] args) {
		
		XmlEntity xmlEntity = new XmlEntity();
		xmlEntity.setName("idsoy");
		xmlEntity.setPwd("123456");
		
		System.out.println(JaxbUtil.convertToXml(xmlEntity));
	}
	
}
  
