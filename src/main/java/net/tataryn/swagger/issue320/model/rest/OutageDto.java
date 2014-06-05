package net.tataryn.swagger.issue320.model.rest;

import net.tataryn.swagger.issue320.model.rest.jackson.JodaDateTimeSerializer;

import org.joda.time.DateTime;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.wordnik.swagger.annotations.ApiModel;
import com.wordnik.swagger.annotations.ApiModelProperty;

@ApiModel("Outage Message")
public class OutageDto {
	
	@JsonProperty("application_name")
	@ApiModelProperty(value = "The name of the Application this Outage is for") //apparently swagger-springmvc doesn't support this yet
	private String applicationName;
	
	@JsonSerialize(using = JodaDateTimeSerializer.class)
	@JsonProperty("outage_date")
	private DateTime outageDate;
	
	@JsonProperty("message")
	private String message;
	
	public OutageDto() {}
	
	public String getApplicationName() {
		return applicationName;
	}
	
	public void setApplicationName(String applicationName) {
		this.applicationName = applicationName;
	}
	
	public DateTime getOutageDate() {
		return outageDate;
	}
	
	public void setOutageDate(DateTime outageDate) {
		this.outageDate = outageDate;
	}
	
	public String getMessage() {
		return message;
	}
	
	public void setMessage(String message) {
		this.message = message;
	}
}
