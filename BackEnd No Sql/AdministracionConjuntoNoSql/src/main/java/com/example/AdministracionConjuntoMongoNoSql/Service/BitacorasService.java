package com.example.AdministracionConjuntoMongoNoSql.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.AdministracionConjuntoMongoNoSql.Collection.Bitacoras;
import com.example.AdministracionConjuntoMongoNoSql.IRepository.IBitacorasRepository;
import com.example.AdministracionConjuntoMongoNoSql.IService.IBitacorasService;


@Service
public class BitacorasService implements IBitacorasService{

	@Autowired
	private IBitacorasRepository repository;//asociacion
	
	@Override
	public List<Bitacoras> all() {
		return repository.findAll();
	}

	@Override
	public Optional<Bitacoras> findById(String id) {		
		return repository.findById(id);
	}

	@Override
	public Bitacoras save(Bitacoras bitacoras) {
		return repository.save(bitacoras);
	}

	@Override
	public void delete(String id) {
		repository.deleteById(id);
	}

	
}
