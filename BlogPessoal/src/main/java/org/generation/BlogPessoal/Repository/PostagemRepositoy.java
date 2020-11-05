package org.generation.BlogPessoal.Repository;

import java.util.List;

import org.generation.BlogPessoal.model.Postagem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PostagemRepositoy extends JpaRepository<Postagem, Long> {
 
	public List<Postagem> findAllByTituloCOntainingIgnoreCase (String titulo);
	
}
