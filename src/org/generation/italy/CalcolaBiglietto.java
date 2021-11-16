package org.generation.italy;

import java.util.Scanner;

public class CalcolaBiglietto {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		double baseCost = 0.21;
		double sale40 = 0.4;
		double sale20 = 0.2;
		int underAge = 18;
		int overAge = 64;
		int age;
		
		System.out.print("Inserisci i km da percorrere: ");
		double kmDaPercorrere = scanner.nextDouble();
		
		System.out.print("Inserire età passeggero: ");
		age = scanner.nextInt();
		
		double prezzo = kmDaPercorrere * baseCost;
		String sconto = "nessuno sconto"; 

		// prova ad aggiungere sconto effettivo    
		// double prezzoSconto;
		
		if(age > overAge) {
			prezzo = prezzo - prezzo * sale40;
			sconto = "40%";
			// prezzoSconto = prezzo * sale40;
		} else if (age < underAge) {
			prezzo = prezzo - prezzo * sale20;
			sconto = "20%";
			// prezzoSconto = prezzo * sale20;
		}
		
		// String prezzoScontoFor = String.format("%.2f", prezzoSconto); 
		String prezzoFormat = String.format("%.2f", prezzo);
		
		System.out.println("La tua età è di: " + age + " anni");
		System.out.println("I tuoi km percorsi sono di: " + kmDaPercorrere + "km");
		System.out.println("Costo per km ed età: " + prezzoFormat + "€");
		System.out.println("È stato applicato uno sconto del: " + sconto);
		// System.out.println("Hai risparmiato: " + prezzoSconto + "€");
		
		scanner.close();
		
	}

}
