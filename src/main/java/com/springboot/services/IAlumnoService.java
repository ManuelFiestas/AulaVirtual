package com.springboot.services;

import java.util.List;
import com.springboot.models.entity.Alumno;

public interface IAlumnoService {
	List<Alumno> findAll();
	Alumno save(Alumno alumno);
	Alumno findById(Long id);
	void delete(Long id);
	
	
}
