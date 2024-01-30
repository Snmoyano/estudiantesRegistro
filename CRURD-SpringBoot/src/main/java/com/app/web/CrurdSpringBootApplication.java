package com.app.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.app.web.entidad.Estudiante;
import com.app.web.repositorio.EstudianteRepositorio;

@SpringBootApplication
public class CrurdSpringBootApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(CrurdSpringBootApplication.class, args);
	}
	
	@Autowired
	private EstudianteRepositorio repositorio;
	
	@Override
	public void run(String... args) throws Exception {
		/*
		Estudiante estudiante1=new Estudiante("Nicolas","Moyano","hola@gmail.com");
		repositorio.save(estudiante1);
		Estudiante estudiante2=new Estudiante("Jose","Perez","jose@gmail.com");
		repositorio.save(estudiante2);*/
	}

}
