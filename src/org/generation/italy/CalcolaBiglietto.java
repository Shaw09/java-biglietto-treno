package org.generation.italy;

import java.util.Scanner;

public class CalcolaBiglietto {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		double baseCost = 0.21;
		int underAge = 17;
		int overAge = 65;
		int age;
		
		
		
		System.out.println("Inserisci i km da percorrere: ");
		double kmDaPercorrere = scanner.nextDouble();
		String kmFormattati = String.format("%.2f", kmDaPercorrere);
		System.out.println(kmFormattati);
		
		System.out.println("Inserire et� passeggero: ");
		age = scanner.nextInt();
		
		scanner.close();
		
	}

}
