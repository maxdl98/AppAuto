package com.jaita120.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jaita120.entities.Utente;
import com.jaita120.repository.UtentiRepository;

@Service
public class UtentiServiceImpl implements UtentiService {
	
	@Autowired
	private UtentiRepository Urepository;

	@Override
	public Utente save(Utente utente) {
	 return Urepository.save(utente);
	 
	}

	
		
		
	

	

	

	@Override
	public Optional <Utente> findByEmail(String email) throws Exception {
		return Urepository.findByEmail(email);
	}


	

	@Override
	public Optional <Utente> findByPassword(String password) throws Exception {
		return Urepository.findByPassword(password);
	}

	

	@Override
	public Utente findById(Long id) throws Exception {
		
		
		return Urepository.findById(id);
		
		
		
	}








	@Override
	public void deleteById(Long id) throws Exception {
		// TODO Auto-generated method stub
		
	}








	@Override
	public Utente authenticate(String email, String password) throws Exception {
		
		Optional <Utente> uti = Urepository.findByEmail(email);
		Optional <Utente> ut2 = Urepository.findByPassword(password);
		
		Utente ut = null;
		
		
		if(!uti.isEmpty()) {
			 ut = uti.get();
			
			if(password.equals(ut.getPassword())) {
			    System.out.println("la password corrisponde");
			} else {
				throw new Exception("passsword non corretta");
			}
		} 
             
		return ut;
		
	}










	@Override
	public Utente updatePassword(String email, String password) throws Exception {
		System.out.println("email ricevuta: " +email + "password ricevuta: " + password);
		Optional <Utente> utente = Urepository.findByEmail(email);
		
		Utente ut = null;
		if(utente.isPresent()) {
			ut = utente.get();
			ut.setPassword(password);
		}
		
		
		
		return Urepository.save(ut);
		
	}










	@Override
	public void deleteAll() {
	  Urepository.deleteAll();
		
	}








}
	
	
	
	
	

	

