package br.edu.figurasespaciais;

public class Cubo {
	public double aresta;
	public double volume;
	public double areaTotal;
	
	public Cubo(){
		
	}
	public void calcVolume(){
		volume = Math.pow(aresta, 3);
	}
	public void calcAreaT() {
		areaTotal = 6*Math.pow(aresta,3);
	}
	public void listarAtributos() {
		System.out.println("Listando Atributos do Cubo.");
		System.out.println("Aresta: "+aresta);
		System.out.println("Volume: "+volume);
		System.out.println("Área total: "+areaTotal);
	}
}
