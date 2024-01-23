package net.austrycastillo.meses;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		/*
		 * Desarrolle un algoritmo que solicite desde el teclado un número del 1 al 12 y
		 * luego muestre por pantalla el mes del año al cual pertenece
		 */
		Scanner teclado = new Scanner(System.in);
		int numeroMes;
		String mes = "";
		System.out.println("Escriba el número del mes");
		numeroMes = teclado.nextInt();
		switch (numeroMes) {
		case 12:
			mes = "Diciembre";
			break;
		case 1:
			mes = "Enero";
			break;
		case 2:
			mes = "Febrero";
			break;
		case 3:
			mes = "Marzo";
			break;
		case 4:
			mes = "Abril";
			break;
		case 5:
			mes = "Mayo";
			break;
		case 6:
			mes = "Junio";
			break;
		case 7:
			mes = "Julio";
			break;
		case 8:
			mes = "Agosto";
			break;
		case 9:
			mes = "Septiembre";
			break;
		case 10:
			mes = "Octubre";
			break;
		case 11:
			mes = "Noviembre";
			break;
		}
		System.out.println("El mes de " + mes);
	}

}
