package com.swagger.swagger.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.google.gson.Gson;
import com.swagger.swagger.models.Usuarios;
import com.swagger.swagger.repositories.UsersRepository;

@RestController("/usuarios")
public class UsuariosController {

	@Autowired
	private UsersRepository repo;
	
	Gson gson = new Gson();
	
	
	/**
	 * GET: Method to get all Users
	 * 
	 * @return List<Usuarios>
	 * 
	 */
	@GetMapping()
	public String getAll() {
		String json = "";
		List<Usuarios> lstUsers = null;
		
		lstUsers = (List<Usuarios>) repo.findAll();
		json = gson.toJson(lstUsers);
		
		return json;
	}
	
	
}
