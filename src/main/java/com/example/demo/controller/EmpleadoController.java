package com.example.demo.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import com.example.demo.entity.Empleado;
import com.example.demo.service.EmpleadoService;

@Controller
public class EmpleadoController {
	@Autowired
	private EmpleadoService empleadoService;
	
	@GetMapping("/listado")
	public String listar(Model model) {
		List<Empleado> lista = empleadoService.listarTodos();
		model.addAttribute("titulo", "LISTA DE EMPLEADO");
		model.addAttribute("empleados", lista);
		return "listado";
	}
	
	@GetMapping("/crear")
	public String crear(Model model) {
	 Empleado empleado = new Empleado();
		List<Empleado> listaEmpleados = empleadoService.listarTodos();
		model.addAttribute("titulo", "NUEVO EMPLEADO");
		model.addAttribute("empleado", empleado);
		model.addAttribute("empleados", listaEmpleados);
	 return "frmEditar";
	}
	
	@PostMapping("/grabar")
	public String guardar(@ModelAttribute Empleado empleado) {
	empleadoService.grabar(empleado);
	System.out.println("Empleado grabado con exito!");
	return "redirect:http://localhost:8080/listado";
	}
	
	@GetMapping("/editar/{id}")
	public String editar(@PathVariable("id") Long id, Model model) {
	Empleado empleado = empleadoService.buscarPorId(id);
	List<Empleado> listaEmpleados = empleadoService.listarTodos();
	model.addAttribute("titulo", "EDITAR EMPLEADO (" + id + ")");
	model.addAttribute("empleado", empleado);
	model.addAttribute("empleados", listaEmpleados);
	return "frmEditar";
	}
	
	@GetMapping("/eliminar/{id}")
	public String eliminar(@PathVariable("id") Long id) {
	empleadoService.eliminar(id);
	System.out.println("Empleado eliminado con exito!");
	return "redirect:http://localhost:8080/listado";
	}
}
