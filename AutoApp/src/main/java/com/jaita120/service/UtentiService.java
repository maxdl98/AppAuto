package com.jaita120.service;

import java.util.Optional;

import com.jaita120.entities.Utente;

public interface UtentiService {
Utente save(Utente utente);

void deleteById(Long id) throws Exception;

//Optional <Utente> findByNameAndPassword(String usurname, String password) throws Exception;


//Optional<Utente> updateEmail(String email) throws Exception;


Optional <Utente> findByEmail(String email) throws Exception;





Optional <Utente> findByPassword(String password) throws Exception;

Utente findById(Long id) throws Exception;


Utente authenticate(String usurname, String password) throws Exception;


Utente updatePassword(String email, String password) throws Exception;



void deleteAll();

}
