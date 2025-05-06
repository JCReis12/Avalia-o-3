package Avaliativas;


import java.util.Scanner;
public class Atv3_ApenasPositivos {

	public static void main(String[] args) {
		Scanner jc = new Scanner (System.in);

		int num = 0;
		int somaPar = 0;
		
		do {
			{
				System.out.println("Digite um número");
				num = jc.nextInt();
				somaPar+=num;
			}
		}
		while(num%2 == 0) ;
		
		System.out.println(somaPar - num);
		
		
		jc.close();
	}

}
