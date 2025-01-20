package com.jaita120.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.jaita120.entities.Tipo_Manutenzione;
import com.jaita120.entities.Utente;

@Repository
public interface TipoManutenzioneRepository extends CrudRepository<Tipo_Manutenzione,Integer> {
	
	@SuppressWarnings("unchecked")
	Tipo_Manutenzione save(Tipo_Manutenzione manutenzione);
	



	Optional<Tipo_Manutenzione> findById(Integer id_tipoman);
	
	
	void deleteById(Integer id_tipoman);

	
	
	

}
