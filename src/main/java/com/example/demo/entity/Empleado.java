
package com.example.demo.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "empleado")
public class Empleado {
	@Id
	@Column(name = "id")
	private int id;
	@Column(name = "dni")
	private String dni;
	@Column(name = "nombre")
	private String nombre;
	@Column(name = "direccion")
	private String direccion;
	@Column(name = "distrito")
	private String distrito;
	@Column(name = "edad")
	private int edad;
	@Column(name = "celular")
	private String celular;
	@Column(name = "correo")
	private String correo;
	@Column(name = "sexo")
	private String sexo;
	@Column(name = "cargo")
	private String cargo;
	@Column(name = "sueldo")
	private String sueldo;
	
	public Empleado() {
		
	}


	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}



	public String getDni() {
		return dni;
	}



	public void setDni(String dni) {
		this.dni = dni;
	}



	public String getNombre() {
		return nombre;
	}



	public void setNombre(String nombre) {
		this.nombre = nombre;
	}



	public String getDireccion() {
		return direccion;
	}



	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}



	public String getDistrito() {
		return distrito;
	}



	public void setDistrito(String distrito) {
		this.distrito = distrito;
	}



	public int getEdad() {
		return edad;
	}



	public void setEdad(int edad) {
		this.edad = edad;
	}



	public String getCelular() {
		return celular;
	}



	public void setCelular(String celular) {
		this.celular = celular;
	}



	public String getCorreo() {
		return correo;
	}



	public void setCorreo(String correo) {
		this.correo = correo;
	}



	public String getSexo() {
		return sexo;
	}



	public void setSexo(String sexo) {
		this.sexo = sexo;
	}



	public String getCargo() {
		return cargo;
	}



	public void setCargo(String cargo) {
		this.cargo = cargo;
	}



	public String getSueldo() {
		return sueldo;
	}



	public void setSueldo(String sueldo) {
		this.sueldo = sueldo;
	}



	@Override
	public String toString() {
	return "[dni=" + dni + ", Nombre=" + nombre
	+ ", Direccion=" + direccion + ", Distrito=" + distrito
	+ ", Edad=" + edad + ", Celular=" + celular
	+ ", Correo=" + correo + ", Sexo=" + sexo
	+ ", Cargo=" + cargo + ", Sexo=" + sexo + "]";
	}

}
