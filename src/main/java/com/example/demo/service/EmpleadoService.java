package com.example.demo.service;

import java.util.List;
import com.example.demo.entity.Empleado;

public interface EmpleadoService {
	public List<Empleado> listarTodos();
	public void grabar(Empleado empleado);
	public Empleado buscarPorId(long id);
	public void eliminar(Long id);
}
