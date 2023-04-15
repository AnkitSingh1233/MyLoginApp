package com.nt.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.nt.entity.PublicRegister;
import com.nt.service.IPublicRegisterService;
import com.nt.service.IUserTypeService;

@Controller

@RequestMapping("/user")
public class PublicRegisterController {

	@Autowired
	private IPublicRegisterService service;

	@Autowired
	private IUserTypeService userService;

	private void createDynamicUi(Model model) {
		model.addAttribute("userType", userService.getTypeCodeAndUserType());
	}

	@GetMapping("/register")
	public String displayRegister(@RequestParam(value = "message", required = false) String message, Model model) {
		model.addAttribute("message", message);
		createDynamicUi(model);
		return "PublicRegister";
	}

	@PostMapping("/save")
	public String save(@ModelAttribute PublicRegister user, RedirectAttributes attributes) {
		Long id = service.savePublicCredentials(user);
		attributes.addAttribute("message", "User Registered Successfully!");
		return "redirect:register";
	}

}
