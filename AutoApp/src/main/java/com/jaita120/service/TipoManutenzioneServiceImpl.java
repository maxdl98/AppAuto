package com.jaita120.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jaita120.entities.Tipo_Manutenzione;
import com.jaita120.repository.TipoManutenzioneRepository;

@Service
public class TipoManutenzioneServiceImpl implements TipoManutenzioneService {
	
	@Autowired 
	private TipoManutenzioneRepository Trepository;

	@Override
	public Tipo_Manutenzione save(Tipo_Manutenzione manutenzione) {
		return Trepository.save(manutenzione);
	}



	@Override
	public Optional<Tipo_Manutenzione> findById(Integer id_tipoman) throws Exception {
		return Trepository.findById(id_tipoman);
	}



	@Override
	public void deleteById(Integer id_tipoman) {
		Trepository.deleteById(id_tipoman);
		
	}



	





}
