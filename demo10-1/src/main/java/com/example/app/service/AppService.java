package com.example.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.stereotype.Service;

import com.example.app.model.AppModel;
import com.example.app.repository.AppRepository;

@Service
public class AppService
{
	@Autowired
	AppRepository ar;
	public List<AppModel> sortAppModel(String field)
	{
		return ar.findAll(Sort.by(Direction.DESC,field));
	}
	public List<AppModel> pagingAppModel(int offset,int pageSize)
	{
		Page<AppModel> paging=ar.findAll(PageRequest.of(offset, pageSize));
		return paging.getContent();
	}
	public List<AppModel> pagingAppModel1(int offset, int pageSize, String field)
	{
		Page<AppModel> paging=ar.findAll(PageRequest.of(offset, pageSize).withSort(Sort.by(field)));
		return paging.getContent();
	}
	public List<AppModel> fetchStudentsByNamePrefix(String prefix)
	{
		return ar.findByNameStartingWith(prefix);
	}
	public List<AppModel> fetchStudentsByNameSufix(String sufix)
	{
		return ar.findByNameEndingWith(sufix);
	}
	public List<AppModel> fetchStudentsByDepartment(String dept)
	{
		return ar.findByDepartment(dept);
	}
	public List<AppModel> getStudentsByDepartment(String dept,String name)
	  {
		  return ar.getStudentsByDepartment(dept, name);
	  }
}
