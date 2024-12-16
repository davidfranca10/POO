package br.edu.figurasespaciais;

public class Pirâmide {
	public double altura;
	public double arestab;
	public double Base;
	public double Face;
	public double areaTotal;
	public double volume;
	
	public Pirâmide() {
		
	}
	public void calcAreaBase() {
		Base = Math.pow(arestab, 2);
	}
	public void calcAreaFaces() {
		Face = (arestab*altura)/2;
	}
	public void calcAreaTotal() {
		areaTotal = Base+Face;
	}
	public void calcVolume() {
		volume = (Base*altura)/3;
	}
	public void listarAtributos() {
		System.out.println("Listando atributos da Pirâmide.");
		System.out.println("Base: "+Base);
		System.out.println("Altura: "+altura);
		System.out.println("Área: "+areaTotal);
		System.out.println("Volume: "+volume);
	}
}
