/**
 * 
 */
package exerciciosjava1;

import java.util.Scanner;

// Autores Trumai e Vivi

public class ExerciciosOperacoes {

	
	public static void main(String[] args) {
	 
	/* Faça um programa que imprima a categoria que uma pessoa se encontra ao comprar um ingresso:
	 * menor que 18 : menor de idade
	 * maior ou igual a 18 : maior de idade 
	 */
		
		Scanner tec = new Scanner(System.in);
		
		int idade ;
		
		System.out.print("Digite a idade: ");
		idade = tec.nextInt();
		
		if (idade < 18) {
			System.out.print("Você é menor de idade !");
		} 
		if (idade >= 18 ) {
			System.out.print("Você é maior de idade !");
		}
	}
}
