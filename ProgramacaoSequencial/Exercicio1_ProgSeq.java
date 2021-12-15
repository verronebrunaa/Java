package ProgramacaoSequencial;

import java.util.Scanner;

public class Exercicio1_ProgSeq {

	public static void main(String[] args)
{//1. Faça um sistema que leia a idade de uma pessoa expressa em anos, meses e dias e mostre-a expressa apenas em dias. 

		
		Scanner leia = new Scanner(System.in);
		int idade;
		float meses, dias;
		
		System.out.println("Insira a sua idade: ");
		idade = leia.nextInt();
		
		meses = idade*12;
		dias = meses*30;
		System.out.println("Olá, você tem: "+idade+" anos, "+meses+" meses,"+dias+" dias.");
	}
}
