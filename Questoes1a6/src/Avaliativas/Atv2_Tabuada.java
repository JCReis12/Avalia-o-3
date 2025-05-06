package Avaliativas;

import java.util.Scanner;

public class Atv2_Tabuada {

	public static void main(String[] args) {
		Scanner jc = new Scanner (System.in);
		
		int num;
		
		
		System.out.print("Digite um número:");
		num = jc.nextInt();
		
		for(int i = 1; i<=10; i++) {
			
			System.out.println(num+" X "+i+" = "+num*i);
			
		}
		
		jc.close();
	}

}
