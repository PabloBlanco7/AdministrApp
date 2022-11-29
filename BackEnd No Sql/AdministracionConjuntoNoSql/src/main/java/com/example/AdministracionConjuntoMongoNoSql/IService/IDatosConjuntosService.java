package com.example.AdministracionConjuntoMongoNoSql.IService;

import java.util.List;
import java.util.Optional;

import com.example.AdministracionConjuntoMongoNoSql.Collection.DatosConjuntos;

public interface IDatosConjuntosService {

	public List<DatosConjuntos> all();

	public Optional<DatosConjuntos> findById(String id);

	public DatosConjuntos save(DatosConjuntos datosConjuntos);

	public void delete(String id);
}
