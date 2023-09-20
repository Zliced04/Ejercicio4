package ejercicio4;

import java. util. Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Perro perro = new Perro("Perro" , "Canidae", "Marron", "carne", 15, "Pitbull");
		Ave ave = new Ave ("Lechuza", "Tytonidae", "Blanco con dorado rojizo", "ratones", 17, "Corto");
		Pez pez = new Pez ("Delfin", "Delphinidae", "Gris" , "peces pequeños", 30, "Aguas tropicales",
				"Vive en grupo");
		
		Scanner scanner = new Scanner (System.in);
		
		System.out.println("Te voy a proporcionar información sobre el siguiente animal que elijas a continuación:\n"
                + "1. Perro\n"
                + "2. Lechuza\n"
                + "3. Delfín");
		int opcion = scanner.nextInt();
		
		switch(opcion) {
		case 1:
			System.out.println(perro.getEspecie());
			System.out.println("Raza: " + perro.getRaza());
			System.out.println("Familia: " + perro.getFamilia());
			System.out.println("Color: " + perro.getColor());
			perro.envejecer();
			System.out.println("Comportamientos: ");
			perro.comer();
			perro.dormir();
			perro.hacerSonido();
			perro.jugar();
			perro.cazar();
			perro.cuidar();
			break;
		case 2:
			System.out.println(ave.getEspecie());
			System.out.println("Familia: " + ave.getFamilia());
			System.out.println("Color: " + ave.getColor());
			System.out.println("Tipo de pico: " + ave.getTipoDePico());
			ave.envejecer();
			System.out.println("Comportamientos: ");
			ave.comer();
			ave.dormir();
			ave.hacerSonido();
			ave.volar();
			ave.cantar();
			break;
		case 3:
			System.out.println(pez.getEspecie());
			System.out.println("Familia: " + pez.getFamilia());
			System.out.println("Color: " + pez.getColor());
			System.out.println("Habitat: " + pez.getHabitat());
			ave.envejecer();
			System.out.println("Comportamientos: ");
			pez.comer();
			pez.dormir();
			pez.hacerSonido();
			pez.nadar();
			pez.saltar();
			pez.respirar();
			pez.aprender();
			System.out.println(pez.getComportamiento());
			break;
		}
		
	}

}
