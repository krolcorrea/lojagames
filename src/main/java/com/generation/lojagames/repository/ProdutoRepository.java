package com.generation.lojagames.repository;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

import com.generation.lojagames.model.Produto;

public interface ProdutoRepository extends JpaRepository<Produto, Long> {
	
	//Quando colocar o public e quando pode deixar só o List
	List<Produto> findAllByNomeContainingIgnoreCase(@Param("nome")String nome);

	public List <Produto> findAllByPrecoGreaterThanOrderByPreco(BigDecimal preco);
	
	public List <Produto> findAllByPrecoLessThanOrderByPrecoDesc(BigDecimal preco);
}
