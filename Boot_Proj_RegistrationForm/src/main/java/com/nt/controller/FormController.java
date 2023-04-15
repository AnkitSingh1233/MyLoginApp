package com.nt.controller;


import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.nt.model.LoginData;

@Controller
public class FormController {
	
	
	@GetMapping("/form")
    public String openForm(Model model) {
    	
    	model.addAttribute("loginData", new LoginData());
		
    	System.out.println("Hello");
    	return "form";
    }
	
	@PostMapping("/process")
	public String processForm(@Valid @ModelAttribute("loginData") LoginData loginData,BindingResult result)
	{
		
		if(result.hasErrors()) {
			
			System.out.println(result);
		    return "form";
		}
		
		System.out.println(loginData);
		return "sucess";
	}
	
	

}
