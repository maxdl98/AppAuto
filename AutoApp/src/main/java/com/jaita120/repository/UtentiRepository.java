package com.jaita120.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.jaita120.entities.Utente;

@Repository
public interface UtentiRepository extends CrudRepository<Utente, Integer> {

	@SuppressWarnings("unchecked")
	Utente save(Utente utente);
	//Optional <Utente> findByNameAndPassword(String usurname, String password) throws Exception;

	   // Metodo personalizzato per trovare il nome dell'utente tramite il suo usurname
	
	
	//Optional<Utente> updateEmail(String email) throws Exception;
	
	Optional <Utente> findByEmail(String email) throws Exception;
	
	Optional <Utente> findByPassword(String password) throws Exception;
	
	Utente findById(Long id);

	
	void deleteAll();
	
	

	
	
	
	
	
}
