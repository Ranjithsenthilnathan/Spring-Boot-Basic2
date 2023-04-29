package com.example.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.app.model.LoginModel;
import com.example.app.service.LoginService;
@RestController
public class LoginController
{
	@Autowired
	LoginService usrService;
	@PostMapping("/login")
	public String validateUser(@RequestBody LoginModel u)
	{
	    System.out.println(u.getUsername());
	    return usrService.validateUser(u.getUsername(),u.getPassword());
	}
	@PostMapping("/add")
	public LoginModel LoginModel(@RequestBody LoginModel u)
	{
	    return usrService.saveUser(u);
	}
	@GetMapping("/app")
	public List<LoginModel> getAllDetails()
	{
		return usrService.findAll();
	}
}

