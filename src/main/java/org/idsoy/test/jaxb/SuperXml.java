package org.idsoy.test.jaxb;

import java.math.BigDecimal;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement
@XmlType(name = "xml")
public class SuperXml {

	@XmlElement(required = true)
	private BigDecimal version;

	public BigDecimal getVersion() {
		return version;
	}

	public void setVersion(BigDecimal version) {
		this.version = version;
	}

}
