package com.stelinno.uddi.entities;

import com.jmethods.catatumbo.Embeddable;
import com.jmethods.catatumbo.Property;

@Embeddable
public class PayloadParameter {
	
	public PayloadParameter() {
		
	}
	
	@Property(name = "paramName") private String paramName;
	@Property(name = "paramValue") private String paramValue;
	
	public String getParamName() {
		return paramName;
	}
	public void setParamName(String paramName) {
		this.paramName = paramName;
	}
	public String getParamValue() {
		return paramValue;
	}
	public void setParamValue(String paramValue) {
		this.paramValue = paramValue;
	}
}
