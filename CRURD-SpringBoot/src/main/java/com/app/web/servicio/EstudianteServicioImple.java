package com.app.web.servicio;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.web.entidad.Estudiante;
import com.app.web.repositorio.EstudianteRepositorio;

@Service
public class EstudianteServicioImple implements EstudianteServicio {
	
	@Autowired
	private EstudianteRepositorio repositorio;

	@Override
	public List<Estudiante> listarTodosLosEstudiantes() {
		// TODO Auto-generated method stub
		return repositorio.findAll();
	}

	@Override
	public Estudiante guardarEstudiante(Estudiante estudiante) {
		// TODO Auto-generated method stub
		return repositorio.save(estudiante);
	}

	@Override
	public Estudiante obtenerEstudiantePorId(Long id) {
		
		return repositorio.findById(id).get();
	}

	@Override
	public Estudiante actualizarEstudiante(Estudiante estudiante) {
		
		return repositorio.save(estudiante);
	}

	@Override
	public void eliminarEstudiante(Long id) {
		repositorio.deleteById(id);
		
	}

}
