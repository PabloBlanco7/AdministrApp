package com.unab.g53sql.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.unab.g53sql.Entity.Bitacoras;
import com.unab.g53sql.IRepository.IBitacorasRepository;
import com.unab.g53sql.IService.IBitacorasService;

@Service
public class BitacorasService implements IBitacorasService{

	@Autowired
	private IBitacorasRepository repository;//asociacion
	
	@Override
	public List<Bitacoras> all() {
		return repository.findAll();
	}

	@Override
	public Optional<Bitacoras> findById(Integer id) {		
		return repository.findById(id);
	}

	@Override
	public Bitacoras save(Bitacoras bitacoras) {
		return repository.save(bitacoras);
	}

	@Override
	public void delete(Integer id) {
		repository.deleteById(id);
	}

	
}
