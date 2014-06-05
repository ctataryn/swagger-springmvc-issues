package net.tataryn.swagger.issue320.service.rest;

import net.tataryn.swagger.issue320.model.rest.OutageDto;

import org.joda.time.DateTime;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.wordnik.swagger.annotations.Api;
import com.wordnik.swagger.annotations.ApiOperation;

@Transactional
@RestController
@Api(value = "outages", description = "Outages API")
public class OutageRestService {
	
	@RequestMapping(value = "/outages/next", method = RequestMethod.GET)
	@ApiOperation(value = "Get Next Outage", notes = "Returns the next outage for the application, or HTTP Response code 204 otherwise")
	public @ResponseBody OutageDto getNextOutage() {
		OutageDto outage = new OutageDto();
		outage.setApplicationName("My App");
		outage.setOutageDate(new DateTime());
		outage.setMessage("Some Message about an Outage");
		return outage;
		
	}
}
