package com.unisinos.as.ArquiteturaJPA;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


import com.unisinos.as.ArquiteturaJPA.jdbc.PessoaJdbcDao;

@SpringBootApplication
public class ArquiteturaJpaApplication implements CommandLineRunner{
	
	private Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@Autowired
	PessoaJdbcDao dao;
	
	public static void main(String[] args) {
		SpringApplication.run(ArquiteturaJpaApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		logger.info("Todos Usuarios -> {}", dao.buscaTodos());
		logger.info("Usuario ID 10001 -> {}", dao.buscaPorId(10001));
		logger.info("Deletando Usuario ID 10002 -> Nro de linhas deletadas - {}", 
				dao.deletaPorId(10002));
		
		
	} 

}
