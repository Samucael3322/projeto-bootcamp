package aula02;

import java.util.Scanner;

public class TemperaturaFahrenheit {
   public static void main(String[] args) {
	   
	//Declaração de variáveis
	   Scanner leitor = new Scanner(System.in);
	   double temperaturaCelsius = 0;
	   double temperaturaFahrenheit = 0;
	   
	   
	   
	   //Entrada de dados
	   System.out.print("Digite a temperatura em graus Celsius: ");
	   temperaturaCelsius = leitor.nextDouble();
	   
	   leitor.close();
	   
	   
	   
	   //Processamento
	  temperaturaFahrenheit = (((temperaturaCelsius * 9) / 5) +32);
	  
	   //Saída de dados
	  System.out.println("Atemperatura em Fahrenheit é: " +  temperaturaFahrenheit);
	 
	   
 
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
   }

}
