package com.stelinno.uddi.entities;

import com.jmethods.catatumbo.Embedded;
import com.jmethods.catatumbo.Entity;
import com.jmethods.catatumbo.Identifier;
import com.jmethods.catatumbo.Property;

@Entity(kind = "service")
public class Service {
	public Service() {
		
	}
	
    public Service(long id, String name, String domain, String subDomain, String endpoint) {
    	this.id = id;
    	this.name = name;
    	this.domain = domain;
    	this.subDomain = subDomain;
    	this.endpoint = endpoint;
	}
    
	@Identifier private long id;
    @Property(name = "name") private String name;
    @Property(name = "description") private String description;
    @Property(name = "domain") private String domain;
    @Property(name = "subDomain") private String subDomain;    
    @Property(name = "endpoint") private String endpoint;
    @Property(name = "supportChat") private String supportChat;
    @Property(name = "supportEmail") private String supportEmail;
    @Property(name = "serviceType") private String serviceType;
    @Property(name = "method") private String method;    
    @Property(name = "protocol") private String protocol;

	@Embedded private Payload payload;
    
    public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getSupportChat() {
		return supportChat;
	}

	public void setSupportChat(String supportChat) {
		this.supportChat = supportChat;
	}

	public String getSupportEmail() {
		return supportEmail;
	}

	public void setSupportEmail(String supportEmail) {
		this.supportEmail = supportEmail;
	}

	public String getServiceType() {
		return serviceType;
	}

	public void setServiceType(String serviceType) {
		this.serviceType = serviceType;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDomain() {
		return domain;
	}

	public void setDomain(String domain) {
		this.domain = domain;
	}

	public String getSubDomain() {
		return subDomain;
	}

	public void setSubDomain(String subDomain) {
		this.subDomain = subDomain;
	}

	public String getEndpoint() {
		return endpoint;
	}

	public void setEndpoint(String endpoint) {
		this.endpoint = endpoint;
	}

	public String getMethod() {
		return method;
	}

	public void setMethod(String method) {
		this.method = method;
	}

	public Payload getPayload() {
		return payload;
	}

	public void setPayload(Payload payload) {
		this.payload = payload;
	}
	
    public String getProtocol() {
		return protocol;
	}

	public void setProtocol(String protocol) {
		this.protocol = protocol;
	}	
}