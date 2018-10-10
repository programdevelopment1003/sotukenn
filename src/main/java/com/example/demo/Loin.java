package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ModelAttribute;


@Controller
public class Loin {
	@Autowired
	staff_password_tableRepository pass;
	@RequestMapping("/")
	

}
