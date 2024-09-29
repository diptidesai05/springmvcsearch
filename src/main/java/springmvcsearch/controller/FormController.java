package springmvcsearch.controller;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import springmvcsearch.entity.Student;

@Controller
public class FormController {
	
	@RequestMapping("complex")
	public String showForm() {
		System.out.println("in showForm");
		return "complex_form";
	}

	@RequestMapping("processForm")
	public String handleForm(@ModelAttribute("student") Student student, BindingResult result) {
		
		if(result.hasErrors()) {
			return "complex_form";
		}
		System.out.println("userName "+student.getUserName());
		System.out.println("userid "+student.getUserid());
		System.out.println(student);
		return "success";
	}
}
