package com.unisinos.as.ArquiteturaJPA.jpa;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.unisinos.as.ArquiteturaJPA.entity.Pessoa;

@Repository
@Transactional
public class PessoaJpaRepository {

	//connect to the database
	@PersistenceContext
	EntityManager entityManager;
	
	public List<Pessoa> buscaTodas() {
		TypedQuery<Pessoa> namedQuery = entityManager.createNamedQuery("Busca_todas_pessoas", Pessoa.class);
		return namedQuery.getResultList();
	}
	
	public Pessoa buscaPorId(int id) {
		return entityManager.find(Pessoa.class, id);//JPA
	}
	public Pessoa update(Pessoa pessoa) {
		return entityManager.merge(pessoa);
	}

	public Pessoa insert(Pessoa pessoa) {
		return entityManager.merge(pessoa);
	}

	public void deleteById(int id) {
		Pessoa pessoa = buscaPorId(id);
		entityManager.remove(pessoa);
	}
}
