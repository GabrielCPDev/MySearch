package com.yggdrasil.mySearch.resourses;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.yggdrasil.mySearch.services.RegistroService;

@RestController
@RequestMapping(value = "/registros" )
public class RegistroResource {
	
	@Autowired
	private RegistroService service;

}
