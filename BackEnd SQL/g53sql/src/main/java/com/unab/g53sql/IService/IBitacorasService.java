package com.unab.g53sql.IService;

import java.util.List;
import java.util.Optional;

import com.unab.g53sql.Entity.Bitacoras;


public interface IBitacorasService {

	public List<Bitacoras> all();

	public Optional<Bitacoras> findById(Integer id);

	public Bitacoras save(Bitacoras bitacoras);

	public void delete(Integer id);
}
