package com.example.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.app.model.SignupModel;
import com.example.app.repository.SignupRepository;

@Service
public class SignupService
{
	@Autowired
	SignupRepository sr;
	public List<SignupModel> getUserDetail()
	{
		return sr.findAll();
	}
	public SignupModel saveUserDetail(SignupModel u)
	{
		return sr.save(u);
	}
}
