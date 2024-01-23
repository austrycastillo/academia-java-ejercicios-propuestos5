package net.austrycastillo.hotel;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		/*
		 * Tenemos un Hotel con 4 habitaciones, de las cuales 3 ya se encuentran
		 * reservadas por Juan, Ana y Jacobo. Desarrolla un programa que solicite el
		 * nombre por teclado e indique qué habitación le corresponde
		 * 
		 */
		Scanner teclado = new Scanner(System.in);
		System.out.println("Escribe tu nombre");
		String nombre = teclado.next();
		switch (nombre) {
		case "Juan":
		case "JUAN":
		case "juan":
			System.out.println("Habitación 1");
			break;
		case "Ana":
			System.out.println("Habitación 2");
			break;
		case "Jacobo":
			System.out.println("Habitación 3");
			break;
		default:
			System.out.println("Habitación 4");
		}
	}

}
