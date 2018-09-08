package com.springs.controller.studentcontroller;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.springs.controller.studentcontroller.services.DAO.interfac.StudentsDAO;
import com.springs.model.StudentsObjects;

@Controller
@RequestMapping("/students")
public class StudentBaseController {
	//Inject StudentsDAO
	@Autowired
	public StudentsDAO studentDao;
	
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
	
	@RequestMapping(path = "/formprocess", method=RequestMethod.POST) 
	public String processForm(@Valid @ModelAttribute("student") StudentsObjects studentsObjects,BindingResult result, Model model) {
		System.out.println("\n Bindong message:"+ result);
	  	    //Do Something
		if(result.hasErrors()) {
		 return "students/students";
		}else {
			//pass the student data to the students DAO to process the saving to DB
			studentDao.saveStudent(studentsObjects);
			model.addAttribute("title", "Confirmation");
		 return "students/confirmation";	
		}

	}
	
	@RequestMapping("/details")
	public String studentList(StudentsObjects studentsObjects,Model model) {
		//Get students detaails from DAO
		List<StudentsObjects> details = studentDao.getStudentsDetails();
		//Bid the details to the view model
		model.addAttribute("studentsdetails", details);
		model.addAttribute("title", studentsObjects.getFirstname());
		return "students/studentdetails";
	}

	
}
