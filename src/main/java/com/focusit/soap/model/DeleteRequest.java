package com.focusit.soap.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Created by Denis V. Kirpichenkov on 24.09.14.
 */
@XmlType
@XmlRootElement
@XmlAccessorType(XmlAccessType.PROPERTY)
public class DeleteRequest {
	private String uuid;

	public String getUuid() {
		return uuid;
	}

	public void setUuid(String uuid) {
		this.uuid = uuid;
	}
}
