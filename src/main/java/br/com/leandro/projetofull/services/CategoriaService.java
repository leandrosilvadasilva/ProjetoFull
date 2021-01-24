package br.com.leandro.projetofull.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.leandro.projetofull.domain.Categoria;
import br.com.leandro.projetofull.repositories.CategoriaRepository;

@Service
public class CategoriaService {

	@Autowired
	public CategoriaRepository repo;


	public Categoria find(Integer id) {

		Optional<Categoria> obj = repo.findById(id);
		
		return obj.orElse(null);

	}	
	
	
//	public Optional<Categoria> buscar(Integer id) {
//
//		Optional<Categoria> obj = repo.findById(id);
//		
//		return obj;
//
//	}

}
