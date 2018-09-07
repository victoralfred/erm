package com.springs.controller.studentcontroller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import com.springs.model.StudentsObjects;



@Controller
@RequestMapping("/students")
public class StudentBaseController {
//	@Value("#{countryOptions}") 
//	private Map<String, String> countryOptions;
	
	@RequestMapping("/")
	public String getStudentsHome(Model model) {
		model.addAttribute("title", "Students Home");

	    // add student object to the model 
	model.addAttribute("student", new StudentsObjects());
		   // add the country options to the model 
	//	model.addAttribute("theCountryOptions", countryOptions); 
		return "students/students";
	}
	
	@RequestMapping(value = "/formprocess", method = RequestMethod.POST) 
	public String processForm(@ModelAttribute("student") StudentsObjects studentsObjects,Model model) {
	  	    //Do Something
		model.addAttribute("title", "Confirmation");
	    return "students/confirmation";
	}

	
}
