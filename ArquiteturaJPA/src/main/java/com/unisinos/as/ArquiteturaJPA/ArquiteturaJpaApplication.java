package com.unisinos.as.ArquiteturaJPA;

import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.unisinos.as.ArquiteturaJPA.entity.Pessoa;
//import com.unisinos.as.ArquiteturaJPA.jdbc.PessoaJdbcDao;
import com.unisinos.as.ArquiteturaJPA.jpa.PessoaJpaRepository;

@SpringBootApplication
public class ArquiteturaJpaApplication implements CommandLineRunner{
	
	private Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@Autowired
	PessoaJpaRepository repositorio;
	
	public static void main(String[] args) {
		SpringApplication.run(ArquiteturaJpaApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		logger.info("Usuario ID 10001 -> {}", repositorio.buscaPorId(10001));
		logger.info("Inserindo -> {}", repositorio.insert(new Pessoa("Eu","POA",new Date())));
		logger.info("Atualizando 10003 -> {}", repositorio.update(new Pessoa(10003,"Ela","POA",new Date())));
		
		repositorio.deleteById(10002);
		
		//logger.info("Todos Usuarios -> {}", repositorio.buscaTodas());
		/*
		logger.info("Deletando Usuario ID 10002 -> Nro de linhas deletadas - {}", 
				dao.deletaPorId(10002));
		*/
		
	} 

}
