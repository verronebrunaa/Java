package ProgramacaoSequencial;

import java.util.Scanner;

public class Exercicio2_ProgSeq {

	public static void main(String[] args) {
		// 2. Faça um sistema que leia a idade de uma pessoa expressa em dias e mostre-a expressa em anos, meses e dias. 

		Scanner leia = new Scanner(System.in);
		int dias,dia,meses,idade;
		
		System.out.println("Insira a sua idade em dias: ");
		dias = leia.nextInt();
		
		idade = dias/365;
		meses = (dias % 365)/30;
		dia = (dias % 365) % 30;
		System.out.println("Olá, você tem: "+idade+" anos, "+meses+" meses e "+dia+" dias.");
	}
}

