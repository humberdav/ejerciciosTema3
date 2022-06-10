package com.example.demo;

public class encapsulamiento {

	public static void main(String[] args) {
		Persona persona = new Persona();
		persona.setEdad(30);
		persona.setNombre("Humberto");
		persona.setTelefono(22810000);
		System.out.println(persona.getEdad());
		System.out.println(persona.getNombre());
		System.out.println(persona.getTelefono());
	}
}

class Persona{
	private int edad;
	private int telefono;
	private String nombre;
	
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public int getEdad() {
		return this.edad;
	}
	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}
	public int getTelefono() {
		return this.telefono;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getNombre() {
		return this.nombre;
	}
}
