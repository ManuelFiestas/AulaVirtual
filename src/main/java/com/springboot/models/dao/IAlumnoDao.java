package com.springboot.models.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import com.springboot.models.entity.Alumno;

public interface IAlumnoDao extends JpaRepository<Alumno, Long>{
		
}
