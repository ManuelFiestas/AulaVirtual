package com.springboot.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.models.entity.Alumno;
import com.springboot.services.IAlumnoService;

@RestController
@RequestMapping("/api/alumnos")
public class AlumnoRestController {
	
	@Autowired
	IAlumnoService alumnoService;
	
	@GetMapping("")
	public List<Alumno> listarAlumnos(){
		 return alumnoService.findAll();
	}
	
	@PostMapping("")
	public Alumno guardarAlumno(@RequestBody Alumno alumno) {
		return alumnoService.save(alumno);
	}
	
	@GetMapping("/{id}")
	public Alumno obtenerPorId (@PathVariable Long id ) {
		return alumnoService.findById(id);
	}
	
	@PutMapping("/{id}")
	public Alumno actualizar(@RequestBody Alumno alumno, @PathVariable Long id) {
		Alumno alumnoActual = alumnoService.findById(id);
		if(alumno.getNombre() != null)
		alumnoActual.setNombre(alumno.getNombre());
		if(alumno.getApellido() != null)
		alumnoActual.setApellido(alumno.getApellido());
		return alumnoService.save(alumnoActual);
	}
	
	@DeleteMapping("/{id}")
	public void borrar (@PathVariable Long id ) {
		alumnoService.delete(id);
	}
}
