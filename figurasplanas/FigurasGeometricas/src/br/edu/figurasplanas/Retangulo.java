package br.edu.figurasplanas;

public class Retangulo {
	public double base;
	public double altura;
	public double area;
	
	public Retangulo() {
		
	}
	public void calcArea() {
		area = base*altura;
	}
	public void listarAtributos() {
		System.out.println("Valor da base: "+base);
		System.out.println("Valor da altura: "+altura);
		System.out.println("Valor da área: "+area);
	}
}
