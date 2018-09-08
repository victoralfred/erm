package com.springs.controller.studentcontroller;


import javax.validation.Valid;

import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import com.springs.model.StudentsObjects;

@Controller
@RequestMapping("/students")
public class StudentBaseController {
//	@Value("#{countryOptions}") 
//	private Map<String, String> countryOptions;
	@InitBinder
	public void preprocessForms(WebDataBinder binder) {
		StringTrimmerEditor trimmer = new StringTrimmerEditor(true);
		binder.registerCustomEditor(String.class, trimmer);
	}
	
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
	public String processForm(@Valid @ModelAttribute("student") StudentsObjects studentsObjects,BindingResult result, Model model) {
	  	    //Do Something
		if(result.hasErrors()) {
		 return "students/students";
		}else {
			model.addAttribute("title", "Confirmation");
		 return "students/confirmation";	
		}

	}

	
}
