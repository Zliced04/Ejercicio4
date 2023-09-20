package ejercicio4;

public class Pez extends Animal {
	String habitat;
	String comportamiento;
	public Pez(String especie, String familia, String color, String dieta, int vida, String habitat,
			String comportamiento) {
		super(especie, familia, color, dieta, vida);
		this.habitat = habitat;
		this.comportamiento = comportamiento;
	}
	
	@Override
	public void dormir() {
		System.out.println("Puede llegar a dormir entre 9 y 10 horas ");
	}
	
	@Override
	public void hacerSonido() {
		System.out.println("Gorjea" );
	}
	
	public void nadar() {
		System.out.println("Nada");
	}
	
	public void saltar() {
		System.out.println("Salta");
		
	}
	public void respirar() {
		System.out.println("Respira oxigeno");
	}
	
	public void aprender() {
		System.out.println("Puede llegar a aprender a realizar trucos");
	}
	
	public String getHabitat() {
		return habitat;
	}
	public void setHabitat(String habitat) {
		this.habitat = habitat;
	}
	public String getComportamiento() {
		return comportamiento;
	}
	public void setComportamiento(String comportamiento) {
		this.comportamiento = comportamiento;
	}
	
	
	
	
	

}
