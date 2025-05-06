package Avaliativas;

import java.util.Scanner;
public class Atv5_Ternario {
	public static void main (String [] args) {
		Scanner jc = new Scanner (System.in);
		
		int num1;
		int num2;
		
		System.out.println("Digite um número:");
		num1 = jc.nextInt();
		
		System.out.println("Digite um novo número:");
		num2 = jc.nextInt();
		
		
		String compara = (num1>=num2) ? "O número "+num1+" é maior ou igual ao número "+num2 : "O número "+num2+" é maior que o número "+num1;

		System.out.println(compara);
		
		jc.close();
	}
	
}
