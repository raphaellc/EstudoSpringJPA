package com.unisinos.as.ArquiteturaJPA.jdbc;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.unisinos.as.ArquiteturaJPA.entity.Pessoa;

@Repository
public class PessoaJdbcDao {

	@Autowired
	JdbcTemplate jdbcTemplate;
	//select * from pessoa
	public List<Pessoa> buscaTodos(){
		jdbcTemplate.query("select * from person", 
				new BeanPropertyRowMapper(Pessoa.class));
	}
}
