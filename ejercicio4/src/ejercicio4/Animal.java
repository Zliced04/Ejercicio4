package ejercicio4;

public class Animal {
	String especie;
	String familia;
	String color;
	String dieta;
	int vida;
	
	public Animal(String especie, String familia, String color, String dieta, int vida) {
		this.especie = especie;
		this.familia = familia;
		this.color = color;
		this.dieta = dieta;
		this.vida = vida;
	}

	public void comer() {
		System.out.println("El " + especie + " se alimenta de " + dieta);
		
	}
	
	public void dormir() {
		
	}
	
	public void hacerSonido() {
		
	}
	
	public void envejecer() {
		System.out.println("Su esperanza de vida es de " + vida + " años ");
	}

	public String getEspecie() {
		return especie;
	}

	public void setEspecie(String especie) {
		this.especie = especie;
	}

	public String getFamilia() {
		return familia;
	}

	public void setFamilia(String familia) {
		this.familia = familia;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getDieta() {
		return dieta;
	}

	public void setDieta(String dieta) {
		this.dieta = dieta;
	}

	public int getVida() {
		return vida;
	}

	public void setVida(int vida) {
		this.vida = vida;
	}
	
	
}
