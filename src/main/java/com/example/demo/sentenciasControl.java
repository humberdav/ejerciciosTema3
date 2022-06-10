package com.example.demo;

public class sentenciasControl {
	public static void main(String[] args) {
		/*Usando un if*/
		int numero = -10;
		if(numero < 0) {
			System.out.println("El número es negativo");
		}else if(numero == 0) {
			System.out.println("El número es 0");
		}else {
			System.out.println("El número es positivo");
		}
		
		/*Usando un while*/
		int numeroWhile = 0;
		while(numeroWhile < 3) {
			System.out.println(numeroWhile);
			numeroWhile++;
		}
		
		/*Usando un do-while*/
		int dw=0;
		do {
			System.out.println(dw);
		}while(dw != 0);
		
		/*Bucle for*/
		for(int numeroFor=0; numeroFor <= 3; numeroFor++) {
			System.out.println(numeroFor);
		}
		/*Sentencia switch*/
		String estacion = "verano";
		switch(estacion) {
		case "primavera":
			System.out.println("Es primavera");
			break;
		case "verano":
			System.out.println("Es verano");
			break;
		case "otoño":
			System.out.println("Es otoño");
			break;
		case "invierno":
			System.out.println("Es invierno");
			break;
		default:
			System.out.println("Estación desconocida");
				
		}
	}
}
