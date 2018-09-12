package com.springs.formpreprocessors.registrationController;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/new_students_registration")
public class RegistrationController {
	
	@RequestMapping("/")
	public String index(Model model) {
		model.addAttribute("title", "New Students Registration");
		return "registration/newstudentsregistration/index";
	}

}
