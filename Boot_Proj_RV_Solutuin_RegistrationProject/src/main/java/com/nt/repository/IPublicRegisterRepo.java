package com.nt.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nt.entity.PublicRegister;

public interface IPublicRegisterRepo extends JpaRepository<PublicRegister, Integer> {

}
