package springmvcsearch.controller;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.servlet.view.RedirectView;

@Controller
public class SearchController {
	
	@RequestMapping("/user/{userId}/{userName}")
	public String getUserDetails(@PathVariable("userId") int userId, @PathVariable("userName") String userName) {
		
		System.out.println("userId = "+userId);
		System.out.println("userName = "+userName);
		
		return "home";
	}
	
	
	@RequestMapping("/complex_form")
	public String complexForm() {
		
		System.out.println("in complex form method");
		return "complex_form";
	}
	
	@RequestMapping("/home")
	public String home() {
		
		/* for nullpointer exception
		String test=null;
		int len = test.length();
		*/
		Integer.parseInt("gffkdf");
		System.out.println("in home method");
		return "home";
	}
	
	@RequestMapping("search")
	public RedirectView search(@RequestParam("searchQuery") String searchQuery) {
		
		System.out.println("in search method ");
		RedirectView redirectView = new RedirectView();
		if(searchQuery.isBlank()) {
			redirectView.setUrl("home");
			return redirectView;
		}
		String url="https://www.google.com/search?q="+searchQuery;
		
		redirectView.setUrl(url);
		return redirectView;
	}
   /* 
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
	}*/
}
