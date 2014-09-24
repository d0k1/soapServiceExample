package com.focusit.soap.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import java.util.Map;

/**
 * Created by Denis V. Kirpichenkov on 24.09.14.
 */
@XmlType
@XmlRootElement
@XmlAccessorType(XmlAccessType.PROPERTY)
public class FindRequest {
	private String fqn;
	private Map<String, String> attributes;

	public String getFqn() {
		return fqn;
	}

	public void setFqn(String fqn) {
		this.fqn = fqn;
	}

	public Map<String, String> getAttributes() {
		return attributes;
	}

	public void setAttributes(Map<String, String> attributes) {
		this.attributes = attributes;
	}
}
