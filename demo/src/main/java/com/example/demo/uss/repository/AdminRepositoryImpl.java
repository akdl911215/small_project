package com.example.demo.uss.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.uss.domain.Admin;

interface AdminCustomRepository {
	
}

public interface AdminRepositoryImpl extends JpaRepository<Admin, Long>,
											 AdminCustomRepository {

}
