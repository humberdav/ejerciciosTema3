package com.example.demo;

public class herencia {

	public static void main(String[] args) {
		Cliente cliente = new Cliente();
		cliente.setEdad(30);
		cliente.setNombre("Humberto");
		cliente.setTelefono(228222);
		cliente.setCredito(150);
		
		System.out.println("La edad es: "+cliente.getEdad());
		System.out.println("El nombre es: "+cliente.getNombre());
		System.out.println("E telefono es: "+cliente.getTelefono());
		System.out.println("Su credito es: "+cliente.getCredito());
		
		Trabajador trabajador = new Trabajador();
		trabajador.setSalario((float)200.50);
		System.out.println("Su salario es de: "+trabajador.getSalario());
		
	}

}

class Person{
	private int edad;
	private String nombre;
	private int telefono;
	
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getTelefono() {
		return telefono;
	}
	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}
	
}

class Cliente extends Persona{
	private int credito;

	public int getCredito() {
		return credito;
	}

	public void setCredito(int credito) {
		this.credito = credito;
	}
}

class Trabajador extends Persona{
	private float salario;

	public float getSalario() {
		return salario;
	}

	public void setSalario(float salario) {
		this.salario = salario;
	}
}