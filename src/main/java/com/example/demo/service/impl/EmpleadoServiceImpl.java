package com.example.demo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Empleado;
import com.example.demo.repository.EmpleadoRepository;
import com.example.demo.service.EmpleadoService;

import jakarta.transaction.Transactional;

@Service
public class EmpleadoServiceImpl implements EmpleadoService {
	
	@Autowired
	private EmpleadoRepository repository;

	@Override
	public List<Empleado> listarTodos() {
		List<Empleado> lista = (List<Empleado>) repository.findAll();
		return lista;
	}
	
	@Transactional(rollbackOn = Exception.class)
	@Override
	public void grabar(Empleado empleado) {
		repository.save(empleado);
	}
	
	@Override
	public Empleado buscarPorId(long id) {
		Empleado bean = repository.findById(id).orElse(null);
		return bean;
	}
	
	@Override
	public void eliminar(Long id) {
		repository.deleteById(id);
	}

}
