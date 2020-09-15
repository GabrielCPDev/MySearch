package com.yggdrasil.mySearch.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.yggdrasil.mySearch.entities.Chapa;

@Repository
public interface ChapaRepository extends JpaRepository<Chapa, Long> {

}
