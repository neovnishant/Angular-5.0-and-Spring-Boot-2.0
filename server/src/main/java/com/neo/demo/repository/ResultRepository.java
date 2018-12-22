package com.neo.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.neo.demo.model.Result;

@RepositoryRestResource
@CrossOrigin(origins = "http://localhost:4200")
public 
interface ResultRepository extends JpaRepository<Result, Long> {

}
