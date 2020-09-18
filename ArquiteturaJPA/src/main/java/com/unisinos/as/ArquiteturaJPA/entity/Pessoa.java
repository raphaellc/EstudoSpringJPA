package com.unisinos.as.ArquiteturaJPA.entity;

import java.util.Date;

public class Pessoa {
	private int id;
	private String nome;
	private String localizacao;
	private Date data_nasc;
	
	public Pessoa() {
		
	}
	
	public Pessoa(int id, String nm, String loc, Date dn) {
		super();
		this.id = id;
		this.nome = nm;
		this.localizacao = loc;
		this.data_nasc = dn;
		
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getLocalizacao() {
		return localizacao;
	}
	public void setLocalizacao(String localizacao) {
		this.localizacao = localizacao;
	}
	public Date getData_nasc() {
		return data_nasc;
	}
	public void setData_nasc(Date data_nasc) {
		this.data_nasc = data_nasc;
	}

	@Override
	public String toString() {
		return "\n Pessoa [id=" + id + ", nome=" + nome + ", localizacao=" + localizacao + ", data_nasc=" + data_nasc
				+ "]";
	}
	
}
