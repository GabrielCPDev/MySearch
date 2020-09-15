package com.yggdrasil.mySearch.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yggdrasil.mySearch.repositories.ChapaRepository;

@Service
public class ChapaService {

	@Autowired
	private ChapaRepository repository;
}
