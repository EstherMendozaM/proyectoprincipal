package com.example.demo.repository;

import org.springframework.data.repository.CrudRepository;
import com.example.demo.entity.Empleado;

public interface EmpleadoRepository extends CrudRepository<Empleado, Long> {

}
