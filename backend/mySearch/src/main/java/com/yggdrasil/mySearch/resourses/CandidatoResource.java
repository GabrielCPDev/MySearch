package com.yggdrasil.mySearch.resourses;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.yggdrasil.mySearch.services.CandidatoService;

@RestController
@RequestMapping(value = "/candidatos")
public class CandidatoResource {

	@Autowired
	private CandidatoService service;
}
