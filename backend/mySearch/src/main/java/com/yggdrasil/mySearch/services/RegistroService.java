package com.yggdrasil.mySearch.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yggdrasil.mySearch.repositories.RegistroRepository;

@Service
public class RegistroService {

	@Autowired
	private RegistroRepository repository;
}
