package springmvcsearch.controller;

import org.springframework.http.HttpStatus;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice
public class MyExceptionHandler {
	
	
	@ResponseStatus(value=HttpStatus.INTERNAL_SERVER_ERROR)
	@ExceptionHandler(value=NullPointerException.class)
	public String handleNullException(Model m) {
		m.addAttribute("msg", "NullPointerException");
		return "null_error";
	}
	@ResponseStatus(value=HttpStatus.INTERNAL_SERVER_ERROR)
	@ExceptionHandler(value=NumberFormatException.class)
	public String handleNumberFormatException(Model m) {
		m.addAttribute("msg", "NumberFormatException");
		return "null_error";
	}
	@ResponseStatus(value=HttpStatus.INTERNAL_SERVER_ERROR)
	@ExceptionHandler(value=Exception.class)
	public String handleException(Model m) {
		m.addAttribute("msg", "Exception");
		return "null_error";
	}

}
