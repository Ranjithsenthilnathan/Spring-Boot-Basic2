package com.example.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.app.model.LoginModel;
import com.example.app.repository.LoginRepository;

@Service
public class LoginService
{
	@Autowired
	LoginRepository userRepo;
    public LoginModel saveUser(LoginModel u)
    {
        return userRepo.save(u);
    }
    public String validateUser(String username,String password)
    {
	    String result="";
	    LoginModel u=userRepo.findByUsername(username);
	    if(u==null)
	    {
		    result="Invalid user";
	    }
		else	
		{
		    if(u.getPassword().equals(password))
			{
				result="Login success";
			}
			else
			{
				result="Login failed";
			}
		}
	    return result;
	}
	public List<LoginModel> findAll()
	{
		return userRepo.findAll();
	}
}
