package aula02;

import java.util.Scanner;

public class Volumedaesfera {
	
	public static void main(String[] args) {


		
		//Declaração de variáveis
		Scanner leitor = new Scanner(System.in);
		double raio = 0;
		double volume;
		
		
	 //Entrada de dados
		System.out.print("Digite o valor do raio da esfera: ");
		
		raio = leitor.nextDouble();
		
		
		
		
		
		//Processamento
		
		volume = ((4 * Math.PI * Math.pow(raio, 3)) / 3);
		
		
		
		 //Saída de dados
	System.out.println("O volume da esfera é" + volume);
}
}