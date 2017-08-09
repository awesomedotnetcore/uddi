package com.stelinno.uddi.entities;

import java.util.List;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.jmethods.catatumbo.Embeddable;
import com.jmethods.catatumbo.Ignore;
import com.jmethods.catatumbo.Property;

import java.lang.reflect.Type;

@Embeddable
public class Payload {
	
	private static final Gson gson = new Gson();;
	
	public Payload() {
		
	}
	
	@Ignore	private List<PayloadParameter> parameters;
	@Property(name = "parametersStr") private String parametersStr;
		
	public String getParametersStr() {
		return parametersStr;
	}

	public void setParametersStr(String parametersStr) {
		if(parametersStr != null && !parametersStr.isEmpty()) {
			Type listType = new TypeToken<List<PayloadParameter>>(){}.getType();
			this.parameters = gson.fromJson(parametersStr, listType);
		}
	}

	public List<PayloadParameter> getParameters() {
		return parameters;
	}

	public void setParameters(List<PayloadParameter> parameters) {
		if(parameters != null)
			this.parametersStr = gson.toJson(parameters);
	}
}
