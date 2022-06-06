package com.example.demo;


public class coche {
	int numPuertas=4;
	
	public void incDoors() {
		numPuertas++;
	}
	
	public static void main(String[] args) {
		coche miCoche = new coche();
		miCoche.incDoors();
		System.out.println(miCoche.numPuertas);	
	}
	
}