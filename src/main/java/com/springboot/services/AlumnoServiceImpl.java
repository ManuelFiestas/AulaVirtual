package com.springboot.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.models.dao.IAlumnoDao;
import com.springboot.models.entity.Alumno;

@Service
public class AlumnoServiceImpl implements IAlumnoService{
	
	
	@Autowired
	private IAlumnoDao alumnoDao;

		@Override
		public List<Alumno> findAll() {
			return alumnoDao.findAll();
		}
		

		@Override
		public Alumno save(Alumno alumno) {
			return alumnoDao.save(alumno);
		}


		@Override
		public Alumno findById(Long id) {
			// TODO Auto-generated method stub
			return alumnoDao.findById(id).orElse(null);
		}


		@Override
		public void delete(Long id) {
			// TODO Auto-generated method stub
			 alumnoDao.deleteById(id);
			
		}


	}


