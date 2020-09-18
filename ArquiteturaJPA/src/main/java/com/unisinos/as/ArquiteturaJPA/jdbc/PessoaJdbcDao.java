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
		return jdbcTemplate.query("select * from Pessoa", 
				new BeanPropertyRowMapper<Pessoa>(Pessoa.class));
	}
	public Pessoa buscaPorId(int id){
		return jdbcTemplate.queryForObject("select * from Pessoa where id=?",
				new Object[] {id}, 
				new BeanPropertyRowMapper<Pessoa>(Pessoa.class));
	}
	public int deletaPorId(int id){
		return jdbcTemplate.update("delete from Pessoa where id=?",
				new Object[] {id});
	}
}
