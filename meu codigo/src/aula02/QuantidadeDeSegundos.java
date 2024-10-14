package aula02;

import java.util.Scanner;

public class QuantidadeDeSegundos {
	public static void main(String[] args) {

		//Declaração de variáveis
		Scanner leitor = new Scanner(System.in);
		double horas = 0;
		double minutos = 0;
		double segundos = 0;
		double totalSegundos = 0;
		
		
		
		//Entrada de dados
		System.out.print("Digite a quantidade  de horas: ");
		 horas = leitor.nextDouble();
		 System.out.print("Digite a quantidade de minutos: ");
		 minutos = leitor.nextDouble();
		 System.out.print("Digite a quantidade de segundos: ");
		 segundos = leitor.nextDouble();
		 
		 leitor.close();
		
		
		
		
		//Processamento
		totalSegundos = 3600 * horas + 60 * minutos + segundos;
		
		
		//Saída de dados
		System.out.println("A quantidade Total de segundos é" + totalSegundos);
}
}