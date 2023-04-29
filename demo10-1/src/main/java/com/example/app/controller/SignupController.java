package com.example.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.app.model.SignupModel;
import com.example.app.service.SignupService;

@RestController
public class SignupController
{
	@Autowired
	SignupService us;
    
    @GetMapping("/getuser")
    public List<SignupModel> getUserDetail()
    {
    	return us.getUserDetail();
    }
    
    
    @PostMapping("/saveuser")
    public SignupModel saveUserDetail(@RequestBody SignupModel u)
    {
    	return us.saveUserDetail(u);
    }
}
