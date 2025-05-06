package Avaliativas;

import java.util.Scanner;

public class Atv4_ValidacaoIdade {
	public static void main(String[] args) {
		
		Scanner jc = new Scanner (System.in);
		
		int idade;
		
		System.out.print("Qual a sua idade: ");
		idade = jc.nextInt();
		
		if (idade < 12) {
			System.out.println("Você está dentro da faixa etária 'Criança'");
		}
		else if (idade >= 12 && idade <= 17) {
			System.out.println("Você está dentro da faixa etária 'Adolecente'");
		}
		else if (idade >= 18 && idade <= 59) {
			System.out.println("Você está dentro da faixa etária 'Adulto'");
		}
		else {
			System.out.println("Você está dentro da faixa etária 'Idoso'");
		}
		jc.close();
	}

}
