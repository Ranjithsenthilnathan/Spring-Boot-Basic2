package com.example.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.app.model.LoginModel;
@Repository
public interface LoginRepository extends JpaRepository<LoginModel,Integer>
{
	LoginModel findByUsername(String username);
}
