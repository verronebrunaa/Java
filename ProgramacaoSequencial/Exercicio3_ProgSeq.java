package ProgramacaoSequencial;

import java.util.Scanner;

public class Exercicio3_ProgSeq {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int duracao, minutos, segundos;
		
		//3. Faça um sistema que leia o tempo de duração de um evento em uma fábrica expressa em segundos e mostre-o expresso em horas, minutos e segundos. 
		
		System.out.println("Insira a duração do evento em horas: ");
		duracao = leia.nextInt();
		
		minutos = duracao*60;
		segundos = minutos*60;
		System.out.println("O evento teve duração de:  "+duracao+" horas, "+minutos+" minutos e: "+segundos+" segundos.");
	}
}
