package br.edu.figurasplanas;

public class Hexagono {
	public double lado;
	public double area;
	
	public Hexagono(){
		
	}
	public void calcArea() {
		area = (3 * Math.sqrt(3) * Math.pow(lado, 2))/2;
	}
	public void listarAtributos() {
		System.out.println("Lado do Hexagono: "+lado);
		System.out.println("Área do circulo: "+area);
	}
}
