package com.example.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.app.model.AppModel;
import com.example.app.service.AppService;

@RestController
public class AppController
{
	@Autowired
	AppService as;
	@GetMapping("/sortAppModel/{field}")
	public List<AppModel> sortAppModel(@PathVariable String field)
	{
		return as.sortAppModel(field);
	}
	@GetMapping("/pagingAppModel/{offset}/{pageSize}")
	public List<AppModel> pagingAppModel(@PathVariable int offset,@PathVariable int pageSize)
	{
		return as.pagingAppModel(offset, pageSize);
	}
	@GetMapping("/pagingAppModel/{offset}/{pageSize}/{field}")
	public List<AppModel> pagingAppModel1(@PathVariable int offset,@PathVariable int pageSize,@PathVariable String field)
	{
		return as.pagingAppModel1(offset,pageSize,field);
	}
	//fetchStudentByNamePrefix?prefix=R
	@GetMapping("/fetchStudentByNamePrefix")
	public List<AppModel> fetchStudentsByNamePrefix(@RequestParam String prefix)
	{
		return as.fetchStudentsByNamePrefix(prefix);
	}
	@GetMapping("/fetchStudentByNameSufix")
	public List<AppModel> fetchStudentsByNameSufix(@RequestParam String sufix)
	{
		return as.fetchStudentsByNameSufix(sufix);
	}
	@GetMapping("/fetchStudentByDepartment")
	public List<AppModel> fetchStudentsByDepartment(@RequestParam String dept)
	{
		return as.fetchStudentsByDepartment(dept);
	}
	
	@GetMapping("/fetchStudentsByDepartment/{dept}/{name}")
	public List<AppModel> fetchStudentsByDepartment(@PathVariable 
			String dept,@PathVariable String name)
	{
		return as.getStudentsByDepartment(dept, name);
	}
}
