package com.unab.g53sql.IService;

import java.util.List;
import java.util.Optional;

import com.unab.g53sql.Entity.Inmuebles;


public interface IInmueblesService {

	public List<Inmuebles> all();

	public Optional<Inmuebles> findById(Integer id);

	public Inmuebles save(Inmuebles inmuebles);

	public void delete(Integer id);
}
