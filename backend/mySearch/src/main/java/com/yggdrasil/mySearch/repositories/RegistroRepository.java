package com.yggdrasil.mySearch.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.yggdrasil.mySearch.entities.Registro;

@Repository
public interface RegistroRepository extends JpaRepository<Registro, Long> {

}
