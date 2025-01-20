package com.jaita120.service;

import java.util.Optional;

import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Service;

import com.jaita120.entities.Tipo_Manutenzione;

@Service
public interface TipoManutenzioneService {
	Tipo_Manutenzione save(Tipo_Manutenzione manutenzione);
	
	


	Optional<Tipo_Manutenzione> findById(Integer id_tipoman) throws Exception;
	
	void deleteById(Integer id_tipoman);

	

}
