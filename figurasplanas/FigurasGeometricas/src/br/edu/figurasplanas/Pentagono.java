package br.edu.figurasplanas;

public class Pentagono {
	public double lado;
	public double area;
	public double apotema;
	public Pentagono(){
		
	}
	public void calcArea() {
		apotema = lado/(2*Math.tan(Math.PI/5));
		area = ((lado*5)*apotema)/2;
	}
	public void listarAtributos() {
		System.out.println("Valor da lado: "+lado);
		System.out.println("Valor da apotema: "+apotema);
		System.out.println("Valor da área: "+area);
	}
}
