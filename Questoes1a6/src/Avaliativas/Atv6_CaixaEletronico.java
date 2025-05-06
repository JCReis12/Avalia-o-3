package Avaliativas;

import java.util.Scanner;
public class Atv6_CaixaEletronico {
	public static void main(String[] args) {
		
		Scanner jc = new Scanner(System.in);
		
		double saldo = 0;
		int acao;
		double valorD;
		double valorS;
		
		
		
		do {
			System.out.println("---------------------------");
			System.out.println("");
			System.out.println("Que ação deseja realizar?");
			System.out.println("1 - Depositar");
			System.out.println("2 - Sacar");
			System.out.println("3 - Ver saldo");
			System.out.println("4 - Sair");
			acao = jc.nextInt();
			
			
			if (acao == 1) {
				System.out.println("Qual o valor que deseja depositar");
				valorD = jc.nextDouble();
				saldo+=valorD;
				System.out.println("Valor depositado com sucesso!");
			}
			
			else if (acao == 2) {
				System.out.println("Qual o valor que deseja sacar");
				valorS = jc.nextDouble();
				if(valorS > saldo) {
					System.out.println("Saldo insuficiente");
				}
				else if (valorS <= saldo) {
					saldo-=valorS;
					System.out.println("Valor sacado com sucesso!");
				}
			}
			
			else if (acao == 3) {
				System.out.println("Seu saldo é de: R$"+saldo);
			}
		}
		while(acao != 4);
		
		
		
		


		
		
		
		
		
		
		jc.close();
	}

}
