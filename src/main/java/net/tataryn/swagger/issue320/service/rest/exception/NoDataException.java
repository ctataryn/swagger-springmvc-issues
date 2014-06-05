package net.tataryn.swagger.issue320.service.rest.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus( value = HttpStatus.NO_CONTENT )
public class NoDataException extends RuntimeException {

	public NoDataException(String message) {
		super(message);
	}
}
