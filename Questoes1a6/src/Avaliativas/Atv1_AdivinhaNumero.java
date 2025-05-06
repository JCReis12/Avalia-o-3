package Avaliativas;
import java.util.Random;
import java.util.Scanner;

public class Atv1_AdivinhaNumero {
	
	public static void main (String [] args) {
	
	Scanner jc = new Scanner(System.in);
	Random aleatorio = new Random();
	
	
	int numeroSecreto = aleatorio.nextInt(100) + 1;
	int numeroTentativas = 0;
	int maxTentativas = 5;
	int palpite;
	
	
	
	System.out.println("Número aleatótio definido");
	System.out.println("Você tem "+maxTentativas+" tentativas");
	System.out.println("");
	
	do {
		System.out.println("");
		System.out.print("Qual seu palpite:");
		palpite = jc.nextInt();
		numeroTentativas++;
		
		if (palpite == numeroSecreto) {
			System.out.println("Você acertou! Você precisou de "+numeroTentativas+" tentativas!");
		}
		else if (palpite > numeroSecreto) {
			System.out.println("Mais baixo");
			System.out.println("-------------------");
		}
		else if (palpite < numeroSecreto) {
			System.out.println("Mais alto");
			System.out.println("-------------------");
		}
	} while(palpite != numeroSecreto && numeroTentativas != maxTentativas);
	
	if(numeroTentativas == maxTentativas && palpite != numeroSecreto) {
		System.out.println("Você perdeu! Tente novamente");
		System.out.println("O número aleatório era "+numeroSecreto);
	}
	
	jc.close();

	}

}
