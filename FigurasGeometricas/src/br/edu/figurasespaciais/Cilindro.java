package br.edu.figurasespaciais;

public class Cilindro {
	public double raio;
	public double altura;
	public double base;
	public double volume;
	public double areaTotal;
	
	public Cilindro() {
		
	}
	public void calcVolume() {
		volume = Math.PI*Math.pow(raio, 2)*altura;
	}
	public void calcAreaTotal() {
		areaTotal = (2*(Math.PI*Math.pow(raio,2)))+(2*Math.PI*raio*altura);
	}
	public void listarAtributos() {
		System.out.println("Listando atributos do Cilindro.");
		System.out.println("Raio: "+raio);
		System.out.println("Área da base: "+base);
		System.out.println("Altura: "+altura);
		System.out.println("Volume: "+volume);
		System.out.println("Área do Cilíndro: "+areaTotal); 
	}
	
	
	}
